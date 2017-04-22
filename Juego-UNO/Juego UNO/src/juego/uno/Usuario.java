package juego.uno;

import java.io.*;
import java.util.Scanner;
import java.util.Iterator;

public class Usuario {
	public String nombre;
	private String passwd;
	public Registro reg;

	private static File usuarios = new File("C:\\Users\\aldor\\Desktop\\Proteco\\PJAVA\\users.txt");

	public Usuario(String nombre, String passwd){
		this.nombre = nombre;
		this.passwd = passwd;
	}

	public void write_Registro() throws IOException{
        FileWriter fichero = new FileWriter(usuarios);
        PrintWriter pw = null;
        try
        {
            pw = new PrintWriter(fichero);

            pw.println("Nombre:" + nombre);
            pw.println("Contraseña: " + passwd);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
    	/*public void read_Registro() throws IOException{

		File aEntrada;
		FileReader leido;
		BufferedReader bufeido;

		try{
			aEntrada = new File(input);
			leido = new FileReader(aEntrada);
			bufeido = new BufferedReader(leido);
			input_chars = new ArrayList<>();
			int ac;

			while( (ac = bufeido.read()) != -1 ){
				input_chars.add(ac);
			} 

			bufeido.close();
			leido.close();
		} catch(IOException ioe){
			System.out.println("No se puede leer el archivo");
			System.exit(0);
		}

	}


	public void encrypt() throws IOException{
		int ic;
		leer();

		for(int i=0; i<input_chars.size(); i++){
			if( (ic = input_chars.get(i)) >= 97 || ic <= 122)
				input_chars.set(i, ic + 3);
		}

		System.out.println(escribir());
	}

	public void decrypt() throws IOException{
		int ic;
		leer();

		for(int i=0; i<input_chars.size(); i++){
			if( (ic = input_chars.get(i)) >= 97 || ic <= 122)
				input_chars.set(i, ic-3);
		}

		System.out.println(escribir());
	}



	*/
	public void new_User() throws IOException{

		reg = new Registro();
		Scanner name = new Scanner(System.in);
		String nom = name.next(); 
		Scanner psswd = new Scanner(System.in);
		String pswd = psswd.next();
		Iterator<Usuario> it = reg.users.iterator();
		while(it.hasNext()){//Recorre la lista para ver si el usuario existe
			Usuario tmp = it.next();
			if(tmp.nombre == nom){
				System.out.println("El usuario ya existe");
			}
			else{//Pues aquí solo metemos el nuevo usuario
				Usuario neoUser = new Usuario(nom, pswd);
				reg.new_Registro(neoUser);
				System.out.println("Usuario agregado");
				write_Registro();
			}
			
		}//while

	}

	//public void */

}
