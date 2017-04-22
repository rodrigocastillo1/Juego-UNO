
package juego.uno;

import java.util.ArrayList;

public class Jugador{

    ArrayList<Carta> mano;
    String nombre;
    int id, turno;

    public Jugador(String nombre){
       this.nombre = nombre;
       this.id = id;
       this.mano = new ArrayList();
       turno = 0;
    }

    public void recibeCartas(ArrayList<Carta> cartas){
        mano.addAll(cartas);
    }
    
    public Carta tiraCarta(int id){
        return mano.get(id-1);
    }
    
    public Carta borrarCarta(int id){
        return mano.remove(id-1);
    }

    public void imprimirCartas(){
        //System.out.println("Cartas de: "+nombre);
        int i=1;
        for(Carta carta: mano){
            System.out.print(i+". ");
            carta.ImprimirCarta();
            i++;
        }
    }
}
