
package Pantallas;

import javax.swing.JButton;
import javax.swing.JTextField;

public class PantallaInicio extends javax.swing.JFrame {
   
    
    public PantallaInicio() {
        initComponents();
         setSize(420,520);
         setLocationRelativeTo(this);
           }

    public String getJugador1() {
        return String.valueOf(Jugador1);
    }

   public String getJugador2() {
        return String.valueOf(Jugador2);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Jugador1 = new javax.swing.JTextField();
        Jugador2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotonInicioJuego = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setForeground(java.awt.Color.black);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 400, 500));
        setMaximumSize(new java.awt.Dimension(400, 500));
        setMinimumSize(new java.awt.Dimension(400, 500));
        setPreferredSize(new java.awt.Dimension(400, 500));

        Jugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jugador2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel1.setText("Nombre Jugador Rojo");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        jLabel2.setText(" TA-TE-TI GAME");
        jLabel2.setToolTipText("");
        jLabel2.setAlignmentX(1.0F);
        jLabel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), javax.swing.BorderFactory.createCompoundBorder())));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setName(""); // NOI18N

        BotonInicioJuego.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        BotonInicioJuego.setText("¡Empecemos!");
        BotonInicioJuego.setAlignmentX(0.5F);
        BotonInicioJuego.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        BotonInicioJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioJuegoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel3.setText("Nombre Jugador azul");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Jugador2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                        .addComponent(BotonInicioJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Jugador1))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonInicioJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel2.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jugador2ActionPerformed
     
        
    }//GEN-LAST:event_Jugador2ActionPerformed

    private void BotonInicioJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioJuegoActionPerformed
        
    }//GEN-LAST:event_BotonInicioJuegoActionPerformed

    public JButton getBotonInicioJuego() {
        return BotonInicioJuego;
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInicioJuego;
    private javax.swing.JTextField Jugador1;
    private javax.swing.JTextField Jugador2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
