
package Pantallas;

import Entidades.Juego.Tateti;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class PantallaInicio extends javax.swing.JFrame {
   
    
    public PantallaInicio() {
        initComponents();
         setSize(420,520);
         setLocationRelativeTo(null);
           }

    public String getJugador1() {
        return Jugador1.getText();
    }

   public String getJugador2() {
        return Jugador2.getText();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Jugador1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Jugador2 = new javax.swing.JTextField();
        BotonInicioJuego = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BotonInicioJuego1 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("¡Ta Te Ti !");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 400, 500));
        setMaximumSize(new java.awt.Dimension(400, 500));
        setMinimumSize(new java.awt.Dimension(400, 500));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Nombre Jugador Uno");
        jLabel3.setMaximumSize(new java.awt.Dimension(400, 500));
        jLabel3.setMinimumSize(new java.awt.Dimension(400, 500));
        jLabel3.setOpaque(true);

        Jugador1.setBackground(new java.awt.Color(0, 51, 51));
        Jugador1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        Jugador1.setForeground(new java.awt.Color(255, 255, 255));
        Jugador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre Jugador Dos");
        jLabel1.setToolTipText("");

        Jugador2.setBackground(new java.awt.Color(0, 51, 51));
        Jugador2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        Jugador2.setForeground(new java.awt.Color(255, 255, 255));
        Jugador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Jugador2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        Jugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jugador2ActionPerformed(evt);
            }
        });

        BotonInicioJuego.setBackground(new java.awt.Color(153, 153, 153));
        BotonInicioJuego.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        BotonInicioJuego.setText("¡Empezar!");
        BotonInicioJuego.setAlignmentX(0.5F);
        BotonInicioJuego.setBorder(null);
        BotonInicioJuego.setFocusable(false);
        BotonInicioJuego.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonInicioJuego.setIconTextGap(2);
        BotonInicioJuego.setOpaque(true);
        BotonInicioJuego.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BotonInicioJuego.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonInicioJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioJuegoActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tateti.jpg"))); // NOI18N
        jLabel2.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TA!");

        jLabel7.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TE!");

        jLabel8.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TI!");

        BotonInicioJuego1.setBackground(new java.awt.Color(153, 153, 153));
        BotonInicioJuego1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        BotonInicioJuego1.setText("Salir");
        BotonInicioJuego1.setAlignmentX(0.5F);
        BotonInicioJuego1.setBorder(null);
        BotonInicioJuego1.setFocusable(false);
        BotonInicioJuego1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonInicioJuego1.setIconTextGap(2);
        BotonInicioJuego1.setOpaque(true);
        BotonInicioJuego1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonInicioJuego1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioJuego1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(BotonInicioJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(BotonInicioJuego1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(60, 60, 60))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)))
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(BotonInicioJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonInicioJuego1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jugador2ActionPerformed
     
        
    }//GEN-LAST:event_Jugador2ActionPerformed

    private void BotonInicioJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioJuegoActionPerformed
     
    }//GEN-LAST:event_BotonInicioJuegoActionPerformed

    private void BotonInicioJuego1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioJuego1ActionPerformed
System.exit(0);
    }//GEN-LAST:event_BotonInicioJuego1ActionPerformed

    public JButton getBotonInicioJuego() {
        return BotonInicioJuego;
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInicioJuego;
    private javax.swing.JButton BotonInicioJuego1;
    private javax.swing.JTextField Jugador1;
    private javax.swing.JTextField Jugador2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
