
package juego.uno;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import login.*;

public class JuegoUNO {
    
    
    public static int players;
    
    public JuegoUNO(int players){
        JuegoUNO.players = players;
    }

    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int num = 0, carta, it;
        boolean aux = false;
        String nombre, opcion;
        Juego juego;
        
        new Start().setVisible(true);
        
        System.out.println("Bienvenido a UNO\n\nIngrese el numero de jugadores de la partida: ");
        
            juego = new Juego();
            
            juego.repartoInicial();
            cleanTerminal();
            System.out.println(juego.jugadores.get(0).nombre+" tira la primera carta: ");
            System.out.println("Tus cartas disponibles son: ");
            juego.jugadores.get(0).imprimirCartas();
            carta = scan.nextInt();
            juego.pila.insertaCarta(juego.jugadores.get(0).tiraCarta(carta));
            cleanTerminal();
            scan.nextLine();
    //        juego.jugadores.forEach((j) -> {
    //            System.out.println("\nCartas de: "+j.nombre);
    //            j.imprimirCartas();
    //        }); 
            //juego.mazo.ImprimeMazo();
    //        System.out.println("");
    //        System.out.println("");
    //        juego.jugadores.get(num-1).imprimirCartas();
            it=1;
            while(juego.pila.getSize() < 109){
                if(juego.jugadores.get(it).turno == 0){
                    System.out.println("Ultima carta tirada: ");
                    juego.pila.getCarta().ImprimirCarta();
                    System.out.println("Es el turno de: "+ ConnBD.Consult_Name(juego.jugadores.get(it).nombre));
                    System.out.println("Tus cartas disponibles son: ");
                    juego.jugadores.get(it).imprimirCartas();
                    System.out.println("Tienes cartas para tirar? s/n ");
                    opcion = scan.nextLine();
                    switch(opcion){
                        case "s":
                            System.out.println("Ingresa el numero de tu carta: ");
                            carta = scan.nextInt();
                            aux = juego.Movimiento(juego.jugadores.get(it).tiraCarta(carta), it);
                            if (aux){
                                juego.jugadores.get(it).borrarCarta(carta);
                                nextPlayer(players ,it);
                            }
                            cleanTerminal();
                            scan.nextLine();
                            break;
                        case "n":
                            System.out.println("Tomaste una carta!");
                            juego.repartirCartas(juego.jugadores.get(it), 1);
                            aux = false;
                            break;
                        default:
                            System.out.println("Opcion no valida!");
                            aux = false;
                    }
                }else{
                    it++;
                    nextPlayer(num ,it);
                }
            }
        }
    
    
    public static void cleanTerminal(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter para contiuar...");
        scan.nextLine();
        for (int i = 0; i < 30; i++) {
            System.out.println("\n");
        }
    }
    
    public static void nextPlayer(int jugadores, int it){
        if (it==jugadores) {
            it=0;
        }else{
            it++;
        }
    }
    public boolean Validate(){
        if(players <= 1){
           JOptionPane.showMessageDialog(null, "Jugadores insuficientes, sal y consigue amigos");
           return true;
        }
        else if(players == 2){
            JOptionPane.showMessageDialog(null, "El juego será de: " + players);
           return true;
        }
        else if(players == 3){
            JOptionPane.showMessageDialog(null, "El juego será de: " + players);
           return true;
        }
        else if(players > 4){
           JOptionPane.showMessageDialog(null, "Jugadores demasiado suficientes, sal y deshazte de algunos amigos");
           return false;
        }
        return false;
    }
    

}
