
package TriviaGeografia;

import LogicaGuardar.GuardarPuntos;
import LogicaGuardar.Puntos;
import LogicaGuardar.TriviaGeografia;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author malol
 */
public class Pregunta1 extends javax.swing.JFrame {
    private ArrayList<TriviaGeografia> arr=new ArrayList<>();
    public String usuario;
    int puntos=0;
    int lugar=-1;
    int nivel=0;
    ArrayList<Puntos> arr2=new ArrayList<>();
    GuardarPuntos gp=new GuardarPuntos();
    public Pregunta1() {
        initComponents();
        lugar=-1;
        
        arr2=new ArrayList<Puntos>();
        arr2=gp.getLectura("Puntos.txt");
        
        this.usuario=usuario;
        
        for(int i=0;i<arr2.size();i++){
            if(usuario.equals(arr2.get(i).getnombrejugador()) && "TriviaGeografia".equals(arr2.get(i).getnombrejuego())){// EN CADA JUEGO CAMBIAN EL NOMBRE DEL JUEGO DONDE DICE Tetris
                puntos=arr2.get(i).getpuntos();
                nivel=arr2.get(i).getnivel();
                lugar=i;
                
                i=arr.size();
            }
        }
        
        if(lugar==-1){
            Puntos pu=new Puntos("TriviaGeografia",usuario,0,1);// AQUI TAMBIEN CAMBIEN EL NOMBRE DEL JUEGO
            arr2.add(pu);
            lugar=arr2.lastIndexOf(pu);
            JOptionPane.showMessageDialog(rootPane,"Primera vez que juega, puntaje 0");
        }else JOptionPane.showMessageDialog(rootPane, "Bienvenido "+arr2.get(lugar).getnombrejugador()+". Su puntaje en el Trivia Geografia es "+arr2.get(lugar).getpuntos());
        
        arr.add(new TriviaGeografia("A que País pertenece Tasmania",2,"Estados Unidos","Australia","Ninguna correcta"));
//        1
        arr.add(new TriviaGeografia("¿En cuál de los siguientes países no hay ningún desierto? ",3,"España","Chile","Alemania"));
//        2
        arr.add(new TriviaGeografia("¿Cuál es la capital de Arkansas? ",2,"Kansas","Little Rock","Washington"));
//        3
        arr.add(new TriviaGeografia("¿Cuál es la principal celebración Holandesa? ",2,"Navidad","El día de la Reina","Llegada del verano"));
//        4
        arr.add(new TriviaGeografia("¿Con cuantos países limita Argentina? ",3,"Cuatro","Dos","Cinco"));
//        5
        arr.add(new TriviaGeografia("¿Cuál es la capital de Suiza? ",1,"Berna","Zurich","Ginebra"));
//        6
        arr.add(new TriviaGeografia("¿Cuál de las siguientes islas está más al sur? ",2,"Sicilia","Malta","Cerdeña"));
//        7
        arr.add(new TriviaGeografia("¿En que país está la Laguna Verde? ",2,"Argentina","Bolivia","Paraguay"));
//        8
        arr.add(new TriviaGeografia("¿Cuál es la capital de Libia? ",2,"Beirut","Trípoli","Riad"));
//        9
        arr.add(new TriviaGeografia("¿A que país pertenece la isla Mujeres? ",1,"México","Colombia","Child"));
//        10
        arr.add(new TriviaGeografia("¿En que continente se encuentra Turquía? ",2,"Africa y Europa","Asia y Europa","Oceanía"));
//        11
        arr.add(new TriviaGeografia("¿Cuál es la religión mayoritaria en en China? ",2,"Taoísmo","Budismo","Cristianismo"));  
//        12
        arr.add(new TriviaGeografia("¿A que país pertenece la isla de Pascua? ",1,"Chile","España","Argentina"));
//        13
        arr.add(new TriviaGeografia("¿En qué país de África el español es el idioma oficial? ",3,"Gabón i","Camerún","Ghana"));
//        14
        arr.add(new TriviaGeografia("¿Cuál es la capital de Argelia? ",2,"Arabia","Argel","Colombo"));
//        15
        arr.add(new TriviaGeografia("¿En que continente está la India? ",3,"Oceanía","Africa","Asia"));
//        16
        arr.add(new TriviaGeografia("¿Cuál es la capital de Alemania? ",3,"Múnich","Ámsterdam","Berlín"));
//        17
        arr.add(new TriviaGeografia("¿Cuál es la capital de Ecuador? ",2,"Lima","Quito","Bogotá"));
//        18
        arr.add(new TriviaGeografia("¿Cuál de estos paises no está en una isla? ",2,"Madagascar","Ghana","Japón"));
//        19
        arr.add(new TriviaGeografia("¿Donde vivía Pablo Escobar? ",1,"Colombia","España","Chie"));
//        20
        this.Pregunta1.setText(arr.get(nivel).getpregunta());
        boton1.setText(arr.get(nivel).getr1());
        boton2.setText(arr.get(nivel).getr2());
        boton3.setText(arr.get(nivel).getr3());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Pregunta1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 204));

        boton1.setBackground(new java.awt.Color(51, 102, 255));
        boton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boton1.setForeground(new java.awt.Color(255, 255, 255));
        boton1.setText("Estados Unidos  ");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton2.setBackground(new java.awt.Color(51, 102, 255));
        boton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boton2.setForeground(new java.awt.Color(255, 255, 255));
        boton2.setText("Australia");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton3.setBackground(new java.awt.Color(51, 102, 255));
        boton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boton3.setForeground(new java.awt.Color(255, 255, 255));
        boton3.setText("Ninguna es correcta ");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 90)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("GEOGRAFÍA");

        Pregunta1.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        Pregunta1.setForeground(new java.awt.Color(255, 255, 255));
        Pregunta1.setText("¿A que país pertenece Tasmania?  ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(Pregunta1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(boton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1)))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(87, 87, 87)
                .addComponent(Pregunta1)
                .addGap(51, 51, 51)
                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        if(arr.get(lugar).getresp()==1){
            
            
            JOptionPane.showMessageDialog(rootPane, "¡CORRECTO!, AVANZAS.");
            
            lugar++;
            this.Pregunta1.setText(arr.get(lugar).getpregunta());
            boton1.setText(arr.get(lugar).getr1());
            boton2.setText(arr.get(lugar).getr2());
            boton3.setText(arr.get(lugar).getr3());
        }else{
            JOptionPane.showMessageDialog(rootPane, "¡INCORRECTO!, NO AVANZAS.");
            
            lugar++;
            this.Pregunta1.setText(arr.get(lugar).getpregunta());
            boton1.setText(arr.get(lugar).getr1());
            boton2.setText(arr.get(lugar).getr2());
            boton3.setText(arr.get(lugar).getr3());
        }
        
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        if(arr.get(lugar).getresp()==2){
            JOptionPane.showMessageDialog(rootPane, "CORRECTO, AVANZAS.");
            lugar++;
            this.Pregunta1.setText(arr.get(lugar).getpregunta());
            boton1.setText(arr.get(lugar).getr1());
            boton2.setText(arr.get(lugar).getr2());
            boton3.setText(arr.get(lugar).getr3());
        }else{
            JOptionPane.showMessageDialog(rootPane, "¡INCORRECTO!, NO AVANZAS.");
            
            lugar++;
            this.Pregunta1.setText(arr.get(lugar).getpregunta());
            boton1.setText(arr.get(lugar).getr1());
            boton2.setText(arr.get(lugar).getr2());
            boton3.setText(arr.get(lugar).getr3());
        }
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        if(arr.get(lugar).getresp()==3){
            JOptionPane.showMessageDialog(rootPane, "CORRECTO, AVANZAS.");
            lugar++;
            this.Pregunta1.setText(arr.get(lugar).getpregunta());
            boton1.setText(arr.get(lugar).getr1());
            boton2.setText(arr.get(lugar).getr2());
            boton3.setText(arr.get(lugar).getr3());
        }else{
            JOptionPane.showMessageDialog(rootPane, "¡INCORRECTO!, NO AVANZAS.");
            
            lugar++;
            this.Pregunta1.setText(arr.get(lugar).getpregunta());
            boton1.setText(arr.get(lugar).getr1());
            boton2.setText(arr.get(lugar).getr2());
            boton3.setText(arr.get(lugar).getr3());
        }
    }//GEN-LAST:event_boton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Pregunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pregunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pregunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pregunta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pregunta1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pregunta1;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
