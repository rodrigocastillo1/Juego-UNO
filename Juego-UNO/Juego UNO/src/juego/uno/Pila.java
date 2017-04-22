
package juego.uno;

import java.util.ArrayList;

public class Pila {
    
    ArrayList<Carta> mazo;
    
    public Pila(){
        mazo = new ArrayList();
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
        return mazo.get(mazo.size()-1);
    }
    
    public Carta removeCarta(){
        Carta c = mazo.remove(mazo.size()-1);
        //c.ImprimirCarta();
        return c;
    }
    
    public void insertaCarta(Carta nueva_carta){
        mazo.add(nueva_carta);
    }
    
    public int getSize(){
        return mazo.size();
    }
}
