package PiedraPapelTijera;


import LogicaGuardar.GuardarPuntos;
import LogicaGuardar.Puntos;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofinall.Seleccionajuego;


public class PiedraPapelVisual extends javax.swing.JFrame {
PiedraPapelTijera ppt=new PiedraPapelTijera();
// VARIABLES AGREGADAS POR EL PROFE, COPIEN ESTO
    public String usuario;
    int puntos=0;
    int lugar=-1;
    ArrayList<Puntos> arr=null;
    GuardarPuntos gp=new GuardarPuntos();
    // AQUI TERMINA LO AGREGADO
    /**
     * Creates new form PiedraPapelVisual
     */
    public PiedraPapelVisual(){
        initComponents();
    }
    public PiedraPapelVisual(String usuario) {
        initComponents();
        
        this.setLocationRelativeTo(null);
        // SISTEMA DE PUNTAJE AGREGADO POR EL PROFE, COPIEN ESTO HASTA...
        arr=new ArrayList<Puntos>();
        arr=gp.getLectura("Puntos.txt");
        
        this.usuario=usuario;
        jusuario.setText(usuario);
        for(int i=0;i<arr.size();i++){
            if(usuario.equals(arr.get(i).getnombrejugador()) && "ppt".equals(arr.get(i).getnombrejuego())){// EN CADA JUEGO CAMBIAN EL NOMBRE DEL JUEGO DONDE DICE Tetris
                puntos=arr.get(i).getpuntos();
                lugar=i;
                this.mipuntaje.setText(String.valueOf(puntos));
                System.out.println("encontro en "+lugar+" puntos "+puntos);
                i=arr.size();
            }
        }
        if(lugar==-1){
            Puntos pu=new Puntos("ppt",usuario,0,0);// AQUI TAMBIEN CAMBIEN EL NOMBRE DEL JUEGO
            arr.add(pu);
            lugar=arr.lastIndexOf(pu);
            JOptionPane.showMessageDialog(rootPane, "Primera vez que juega, puntaje 0");
        }else JOptionPane.showMessageDialog(rootPane, "Bienvenido "+arr.get(lugar).getnombrejugador()+". Su puntaje en el tetris es "+arr.get(lugar).getpuntos() );
        // AQUI.... TERMINA LO AGREGADO POR EL PROFE
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Piedra = new javax.swing.JButton();
        Papel = new javax.swing.JButton();
        Tijera = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jusuario = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mipuntaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        Piedra.setBackground(new java.awt.Color(51, 51, 255));
        Piedra.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        Piedra.setForeground(new java.awt.Color(51, 51, 255));
        Piedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/images/piedra.jpg"))); // NOI18N
        Piedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PiedraActionPerformed(evt);
            }
        });

        Papel.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        Papel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/images/papel.jpeg"))); // NOI18N
        Papel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PapelActionPerformed(evt);
            }
        });

        Tijera.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        Tijera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/images/tijera.jpg"))); // NOI18N
        Tijera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TijeraActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 11)); // NOI18N
        jButton1.setText("A T R A S");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jusuario.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jusuario.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("E S C O G E   C U A N D O   E S T E S    L I S T O!");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("PUNTAJE");

        mipuntaje.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(684, 684, 684)
                                .addComponent(Piedra, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(370, 370, 370)
                                .addComponent(Papel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(375, 375, 375)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(574, 574, 574)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(402, 402, 402)
                                        .addComponent(jButton1))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(Tijera, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addGap(506, 506, 506))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(451, 451, 451)
                                        .addComponent(jLabel6)
                                        .addGap(33, 33, 33)
                                        .addComponent(mipuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jLabel1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(mipuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(Tijera, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Papel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(Piedra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Seleccionajuego sj=new Seleccionajuego();
        sj.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TijeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TijeraActionPerformed
        int r=ppt.resultado(3);
        if(r==1) {
            JOptionPane.showMessageDialog(Papel, "PC: PAPEL, GANASTE TU");
            ganajugador();
        }
        else if(r==2) JOptionPane.showMessageDialog(Papel, "EMPATE");
        else JOptionPane.showMessageDialog(Papel, "PC: PIEDRA, GANÓ LA MÁQUINA");
    }//GEN-LAST:event_TijeraActionPerformed

    private void PapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PapelActionPerformed
        int v= ppt.resultado(2);
        if(v==1){
            JOptionPane.showMessageDialog(Papel, "PC: PIEDRA, GANASTE TU");
            ganajugador();
        }
        else if(v==2) JOptionPane.showMessageDialog(Papel, "EMPATE");
        else JOptionPane.showMessageDialog(Papel, "PC: TIJERA, GANÓ LA MÁQUINA");
    }//GEN-LAST:event_PapelActionPerformed

    private void PiedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PiedraActionPerformed
        int j= ppt.resultado(1);
        if(j==1){
            JOptionPane.showMessageDialog(Papel, "PC: TIJERA, GANASTE TU");
            ganajugador();
        }
        else if(j==2) JOptionPane.showMessageDialog(Papel, "EMPATE");
        else JOptionPane.showMessageDialog(Papel, "PC: PAPEL, GANÓ LA MÁQUINA");
    }//GEN-LAST:event_PiedraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PiedraPapelVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PiedraPapelVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PiedraPapelVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PiedraPapelVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PiedraPapelVisual().setVisible(true);
            }
        });
    }
private void ganajugador() {
         // AQUI SISTEMA DE PUNTAJE AGREGADO POR EL PROFE, COPIEN ESTO
        puntos=puntos+5;
        this.mipuntaje.setText(String.valueOf(puntos));
        arr.get(lugar).setpuntos(puntos);
      
        try {
            gp.setEscritura(arr,"Puntos.txt");
        } catch (Exception ex) {
            Logger.getLogger(PiedraPapelVisual.class.getName()).log(Level.SEVERE, null, ex);
        }
//             HASTA AQUI, EN EL LUGAR DONDE UDS QUIERAN GUARDAR LOS PUNTOS
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Papel;
    private javax.swing.JButton Piedra;
    private javax.swing.JButton Tijera;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jusuario;
    private javax.swing.JLabel mipuntaje;
    // End of variables declaration//GEN-END:variables
}
