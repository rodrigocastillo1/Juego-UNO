
package Interfaz;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.*;

public class Interfaz_Juego extends javax.swing.JFrame {

    public Interfaz_Juego() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CartaUNO = new javax.swing.JPanel();
        num_carta = new javax.swing.JTextField();
        panel_opciones = new javax.swing.JPanel();
        nombre_jugador = new javax.swing.JTextField();
        cartas_disponibles = new javax.swing.JComboBox<>();
        boton_jugar = new javax.swing.JButton();
        boton_tomar_carta = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CartaUNO.setBackground(new java.awt.Color(204, 0, 0));
        CartaUNO.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        CartaUNO.setForeground(new java.awt.Color(0, 0, 0));

        num_carta.setEditable(false);
        num_carta.setBackground(new java.awt.Color(204, 0, 0));
        num_carta.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        num_carta.setForeground(new java.awt.Color(0, 0, 0));
        num_carta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num_carta.setText("1");
        num_carta.setBorder(null);

        javax.swing.GroupLayout CartaUNOLayout = new javax.swing.GroupLayout(CartaUNO);
        CartaUNO.setLayout(CartaUNOLayout);
        CartaUNOLayout.setHorizontalGroup(
            CartaUNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CartaUNOLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(num_carta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        CartaUNOLayout.setVerticalGroup(
            CartaUNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartaUNOLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(num_carta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        panel_opciones.setBackground(new java.awt.Color(211, 224, 204));
        panel_opciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(187, 23, 30))); // NOI18N

        nombre_jugador.setEditable(false);
        nombre_jugador.setBackground(new java.awt.Color(192, 213, 157));
        nombre_jugador.setForeground(new java.awt.Color(0, 0, 0));
        nombre_jugador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre_jugador.setText("Jugador");
        nombre_jugador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nombre_jugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_jugadorActionPerformed(evt);
            }
        });

        cartas_disponibles.setBackground(new java.awt.Color(229, 204, 16));
        cartas_disponibles.setForeground(new java.awt.Color(153, 0, 0));
        cartas_disponibles.setModel(cartas_disponibles.getModel());
        cartas_disponibles.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        boton_jugar.setBackground(new java.awt.Color(111, 126, 28));
        boton_jugar.setForeground(new java.awt.Color(0, 0, 0));
        boton_jugar.setText("Jugar");

        boton_tomar_carta.setForeground(new java.awt.Color(187, 113, 135));
        boton_tomar_carta.setText("Tomar carta");

        javax.swing.GroupLayout panel_opcionesLayout = new javax.swing.GroupLayout(panel_opciones);
        panel_opciones.setLayout(panel_opcionesLayout);
        panel_opcionesLayout.setHorizontalGroup(
            panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_opcionesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombre_jugador)
                    .addComponent(cartas_disponibles, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton_jugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton_tomar_carta, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panel_opcionesLayout.setVerticalGroup(
            panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_opcionesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(nombre_jugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(cartas_disponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(boton_jugar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_tomar_carta)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(CartaUNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(CartaUNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panel_opciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombre_jugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_jugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_jugadorActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Juego().setVisible(true);
            }
        });
    }
    
    public void setColorCarta(Color c){
        CartaUNO.setBackground(c);
    }
    
    public void getModel(){
        Color c = Color.blue;
        
        cartas_disponibles.setRenderer(new DefaultListCellRenderer() {
            @Override
            public void paint(Graphics g) {
                setBackground(Color.WHITE);
                setForeground(Color.GREEN);
                super.paint(g);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CartaUNO;
    private javax.swing.JButton boton_jugar;
    private javax.swing.JButton boton_tomar_carta;
    private javax.swing.JComboBox<String> cartas_disponibles;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre_jugador;
    private javax.swing.JTextField num_carta;
    private javax.swing.JPanel panel_opciones;
    // End of variables declaration//GEN-END:variables
}
