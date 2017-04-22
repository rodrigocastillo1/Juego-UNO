
package juego.uno;

import java.util.*;

public class Registro {

	public ArrayList<Usuario> users;

	public Registro(){
		users = new ArrayList<Usuario>();
	}

	public void new_Registro(Usuario user){

		users.add(user);
	}
	
}