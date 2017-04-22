
package juego.uno;

import java.util.Scanner;

import java.util.ArrayList;

public class Juego {
    
    public Scanner scan;
    static public ArrayList<Jugador> jugadores;
    public Mazo mazo;
    public Pila pila;
    
    public Juego(){
        this.mazo = new Mazo();
        pila = new Pila();
        scan = new Scanner(System.in);
    }
    
    public void repartoInicial(){
        for(Jugador jugador: jugadores)
            repartirCartas(jugador, 7);
    }
    
    public void repartirCartas(Jugador jugador, int num_cartas){
        ArrayList<Carta> cartas = new ArrayList();
        for(int i=0; i<num_cartas; i++){
            cartas.add(mazo.removeCarta());
        }
        jugador.recibeCartas(cartas);
    }
    
    public boolean isLegalMove(Carta nueva_carta){
        Carta carta_pila = pila.getCarta();
        if(carta_pila.getColor().equals(nueva_carta.getColor()) || carta_pila.getValor().equals(nueva_carta.getValor()) || nueva_carta.getColor().equals("negro")){
            return true;
        }
        return false;
    }
    
    public boolean Movimiento(Carta nueva_carta, int id){
        if(isLegalMove(nueva_carta)){
            pila.insertaCarta(nueva_carta);
            if(!nueva_carta.efecto.equals(""))
                aplicarEfectoCarta(nueva_carta, id);
            return true;
        }
        else{
            System.out.println("No es un movimiento válido");
            return false;
        }
    }
    
    public void aplicarEfectoCarta(Carta carta, int id){
        ArrayList<String> efectos = new ArrayList() {{add("toma dos"); add("cambio de sentido"); 
                                                      add("pierde turno");add("comodin"); 
                                                      add("comodin toma cuatro");}};
        switch(efectos.indexOf(carta.getEfecto())){
            case 0:
                repartirCartas(jugadores.get(id+1),2);
                System.out.println("Toma dos");
                break;
            case 1:
                
                System.out.println("Cambio de sentido");
                break;             
            case 2:
                
                System.out.println("Pierde Turno");
                break;
            case 3:
                seleccionarColor(carta);
                System.out.println("Comodin");
                break;
            case 4:
                int opcion;
                seleccionarColor(carta);
                repartirCartas(jugadores.get(id+1),4);
                System.out.println("Comodin toma cuatro");
                break; 
            default:
                System.out.println("Error, no está en la lista");
        }
    }
    
    public void seleccionarColor(Carta carta){
        int opcion;
        System.out.println("Selecciona el color que desees: 1.rojo\n2.azul\n3.verde\n4.amarillo");
        opcion = scan.nextInt();
        switch(opcion){
            case 1:
                carta.color="rojo";
                break;
            case 2:
                carta.color="azul";
                break;
            case 3:
                carta.color="verde";
                break;
            case 4:
                carta.color="amarillo";
                break;
            default:
                System.out.println("Color no permitido");
        }
    }
}
