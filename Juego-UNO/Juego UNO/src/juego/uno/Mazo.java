
package juego.uno;

import java.util.ArrayList;
import java.util.Collections;

public final class Mazo {
    
    ArrayList<Carta> mazo;
    
    public Mazo(){
        mazo = generaMazoDesordenado();
    }
    
    public ArrayList generaMazoDesordenado(){
        ArrayList<Carta> m;
        Collections.shuffle(m = generarCartas());
        return m;
    }

    public ArrayList generarCartas(){
        String[] Colores = {"rojo", "azul", "verde", "amarillo"};
        ArrayList<Carta> cartas = new ArrayList();
        for(String color: Colores){                             //Por cada color en el arreglo de colores...
            cartas.add(new Carta(color, 0, ""));                    //Creamos e insertamos en el mazo una carta del color iterado y con valor cero
            for(int i=0; i<2; i++){                                 //Haremos dos cartas de cada número del 1 al 9
                for(int j=1; j<10; j++){
                    cartas.add(new Carta(color, j, ""));            //Creamos e insertamos en el mazo una carta del color y número iterados.
                }
            }
        }
        String[] Poderes = {"toma dos", "cambio de sentido", "pierde turno"};
        for(String poder: Poderes){
            for(String color: Colores){
                for(int i=0; i<2; i++){
                    cartas.add(new Carta(color, null, poder));
                }
            }
        }
        String[] Comodines = {"comodin", "comodin toma cuatro"};
        for(String comodin: Comodines){    
            for(int i=0; i<4; i++){
                cartas.add(new Carta("negro", null, comodin));
            }
        }
        return cartas;
    }
    
    public void ImprimeMazo(){
        int i=1;
        for(Carta c: mazo){
            System.out.print("["+i+"] ");
            ((Carta)c).ImprimirCarta();
            i++;
        }
    }
    
    public Carta getCarta(){
        return mazo.get(mazo.size());
    }
    
    public Carta removeCarta(){
        Carta c = mazo.remove(mazo.size()-1);
        //c.ImprimirCarta();
        return c;
    }
    
    public void insertaCarta(Carta nueva_carta){
        mazo.add(nueva_carta);
    }
}
