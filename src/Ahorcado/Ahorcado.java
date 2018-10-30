
package Ahorcado;

import Atxy2k.CustomTextField.RestrictedTextField;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JOptionPane;


/**
 *
 * @author Francisco Pagani 
 */
public class Ahorcado extends javax.swing.JFrame {
    private int parte;
    private int cantrayas;
    private String palabra;
      // Se obtiene un Clip de sonido
    Clip aplauso;
    Clip buu;
    Clip gana;
    Clip pierde;
    
    
    JTextField tf1=new JTextField(1);
    JTextField tf2=new JTextField(1);
    JTextField tf3=new JTextField(1);
    JTextField tf4=new JTextField(1);
    JTextField tf5=new JTextField(1);
    JTextField tf6=new JTextField(1);
    JTextField tf7=new JTextField(1);
    JTextField tf8=new JTextField(1);
    JTextField tf9=new JTextField(1);
    JTextField tf10=new JTextField(1);
    JTextField tf11=new JTextField(1);
    JTextField tf12=new JTextField(1);
    
    /**
     * Creates new form Ahorcado
     */
   
    public Ahorcado() {
        initComponents();
        String ruta="src/org/me/sonidos/";
        parte=0;
        cantrayas=0;
        try {
            aplauso=  AudioSystem.getClip();
             // Se carga con un fichero wav
            aplauso.open(AudioSystem.getAudioInputStream(new File(ruta+"aplauso.wav")));

            gana=AudioSystem.getClip();
            gana.open(AudioSystem.getAudioInputStream(new File(ruta+"gana.wav")));
            
            buu=  AudioSystem.getClip();
            buu.open(AudioSystem.getAudioInputStream(new File(ruta+"boo.wav")));
       pierde= AudioSystem.getClip();
            pierde.open(AudioSystem.getAudioInputStream(new File(ruta+"pierde2.wav")));
            
        
        } catch (LineUnavailableException ex) {
            System.out.println("ERROR 1");
            Logger.getLogger(Ahorcado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            System.out.println("ERROR 2");
            Logger.getLogger(Ahorcado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("ERROR 3");
            Logger.getLogger(Ahorcado.class.getName()).log(Level.SEVERE, null, ex);
        }
        RestrictedTextField res=new RestrictedTextField(letra);
      
        
        res = new RestrictedTextField(letra);;
        res.setLimit(1);
        res.setOnlyText(true);
     
    }
    
    
    public void paint(Graphics g){
        super.paint(g);
        g.drawLine(50,100,200,100);
        g.drawLine(50,100,50,400);
        g.drawLine(200,150,200,100);
        
        switch(parte){
            
            case 1:g.drawArc(170, 150, 50, 50,0 , 360);break;
            
            case 2:g.drawArc(170, 150, 50, 50,0 , 360);
                    g.drawLine(200,200,200,280);break;
                    
            case 3: g.drawArc(170, 150, 50, 50,0 , 360);
                    g.drawLine(200,200,200,280);
                    g.drawLine(200,200,230 ,250 );break;
                
            case 4: g.drawArc(170, 150, 50, 50,0 , 360);
                    g.drawLine(200,200,200,280);
                    g.drawLine(200,200,230 ,250 );
                    g.drawLine(200,200,160,250);break;
            
            case 5: g.drawArc(170, 150, 50, 50,0 , 360);
                    g.drawLine(200,200,200,280);
                    g.drawLine(200,200,230 ,250 );
                    g.drawLine(200,200,160,250);
                    g.drawLine(200,280,170,350);break;
                
            case 6: g.drawArc(170, 150, 50, 50,0 , 360);
                    g.drawLine(200,200,200,280);
                    g.drawLine(200,200,230 ,250 );
                    g.drawLine(200,200,160,250);
                    g.drawLine(200,280,170,350);
                    g.drawLine(200,280,230,350);break;
                    
                    
                    
                    
                    
        }
        
      
     
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();
        usadas = new javax.swing.JLabel();
        letra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pista = new javax.swing.JLabel();
        lblErrorLetra = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 102));
        setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Comenzar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        usadas.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        usadas.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Usadas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Showcard Gothic", 0, 14))); // NOI18N

        letra.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        letra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        letra.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        letra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                letraKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letraKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Ingrese letra");

        pista.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        pista.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Pista", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Showcard Gothic", 1, 18))); // NOI18N
        pista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pista.setMaximumSize(new java.awt.Dimension(20, 40));
        pista.setMinimumSize(new java.awt.Dimension(20, 40));
        pista.setPreferredSize(new java.awt.Dimension(20, 40));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pista, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblErrorLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(letra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(110, 110, 110)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(usadas, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(pista, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(lblErrorLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(letra, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(usadas, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
          armoletras();
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void armoletras(){
    aleatorio();
    
    parte=0;
    cantrayas= palabra.length();
    int col=150;
     tf1.setEnabled(false); tf1.setDisabledTextColor(Color.BLACK);tf1.setFont(new Font("Comic Sans MC", Font.PLAIN, 20));
                    tf1.setBorder(new LineBorder(Color.RED)); 
      tf2.setEnabled(false);tf2.setDisabledTextColor(Color.BLACK);tf2.setFont(new Font("Comic Sans MC", Font.PLAIN, 20));
                    tf2.setBorder(new LineBorder(Color.RED)); 
      tf3.setEnabled(false);tf3.setDisabledTextColor(Color.black);tf3.setFont(new Font("Comic Sans MC", Font.PLAIN, 20));
                    tf3.setBorder(new LineBorder(Color.RED)); 
      tf4.setEnabled(false);tf4.setDisabledTextColor(Color.black);tf4.setFont(new Font("Comic Sans MC", Font.PLAIN, 20));
                    tf4.setBorder(new LineBorder(Color.RED)); 
      tf5.setEnabled(false);tf5.setDisabledTextColor(Color.black);tf5.setFont(new Font("Comic Sans MC", Font.PLAIN, 20));
                    tf5.setBorder(new LineBorder(Color.RED)); 
      tf6.setEnabled(false);tf6.setDisabledTextColor(Color.black);tf6.setFont(new Font("Comic Sans MC", Font.PLAIN, 20));
                    tf6.setBorder(new LineBorder(Color.RED)); 
      tf7.setEnabled(false);tf7.setDisabledTextColor(Color.black);tf7.setFont(new Font("Comic Sans MC", Font.PLAIN, 20));
                    tf7.setBorder(new LineBorder(Color.RED)); 
      tf8.setEnabled(false);tf8.setDisabledTextColor(Color.black);tf8.setFont(new Font("Comic Sans MC", Font.PLAIN, 20));
                    tf8.setBorder(new LineBorder(Color.RED)); 
      tf9.setEnabled(false);tf9.setDisabledTextColor(Color.black);tf9.setFont(new Font("Comic Sans MC", Font.PLAIN, 20));
                    tf9.setBorder(new LineBorder(Color.RED)); 
      tf10.setEnabled(false);tf10.setDisabledTextColor(Color.black);tf10.setFont(new Font("Comic Sans MC", Font.PLAIN, 20));
                    tf10.setBorder(new LineBorder(Color.RED)); 
      tf11.setEnabled(false);tf11.setDisabledTextColor(Color.BLACK);tf11.setFont(new Font("Comic Sans MC", Font.PLAIN, 20));
                    tf11.setBorder(new LineBorder(Color.RED)); 
      tf12.setEnabled(false);tf12.setDisabledTextColor(Color.BLACK);tf12.setFont(new Font("Comic Sans MC", Font.PLAIN, 20));
                    tf12.setBorder(new LineBorder(Color.RED)); 
                    
                    remove(tf1);
                    remove(tf2);
                    remove(tf3);
                    remove(tf4);
                    remove(tf5);
                    remove(tf6);
                    remove(tf7);
                    remove(tf8);
                    remove(tf9);
                    remove(tf10);
                    remove(tf11);
                    remove(tf12);
                
                    switch(cantrayas){
                    case 1:   this.add(tf1);
                                tf1.setBounds(130,350, 25, 40);
                                break;
                    case 2:   this.add(tf1);
                                tf1.setBounds(130,350, 25, 30);

                                this.add(tf2);
                                tf2.setBounds(155,350, 25, 30);

                                break;
                    case 3: this.add(tf1);
                                tf1.setBounds(130,350, 25, 30);

                                this.add(tf2);
                                tf2.setBounds(155,350, 25, 30);

                                this.add(tf3);
                                tf3.setBounds(180,350, 25, 30);
                              break;

                    case 4:     
                                this.add(tf1);
                                tf1.setBounds(130,350, 25, 30);

                                this.add(tf2);
                                tf2.setBounds(155,350, 25, 30);


                                this.add(tf3);
                                tf3.setBounds(180,350, 25, 30);


                                this.add(tf4);
                                tf4.setBounds(205,350, 25, 30);
                                break;

                    case 5:  this.add(tf5);

                                 this.add(tf1);
                                tf1.setBounds(130,350, 25, 30);

                                this.add(tf2);
                                tf2.setBounds(155,350, 25, 30);


                                this.add(tf3);
                                tf3.setBounds(180,350, 25, 30);


                                this.add(tf4);
                                tf4.setBounds(205,350, 25, 30);


                                 this.add(tf5);
                                tf5.setBounds(230,350, 25, 30);
                               break;

                    case 6:  this.add(tf6);

                                this.add(tf1);
                                tf1.setBounds(130,350, 25, 30);

                                this.add(tf2);
                                tf2.setBounds(155,350, 25, 30);


                                this.add(tf3);
                                tf3.setBounds(180,350, 25, 30);


                                this.add(tf4);
                                tf4.setBounds(205,350, 25, 30);


                                 this.add(tf5);
                                tf5.setBounds(230,350, 25, 30);


                                this.add(tf6);
                                tf6.setBounds(255,350, 25, 30);
                                break;

                    case 7: this.add(tf7);

                                        this.add(tf1);
                                    tf1.setBounds(130,350, 25, 30);

                                    this.add(tf2);
                                    tf2.setBounds(155,350, 25, 30);


                                    this.add(tf3);
                                    tf3.setBounds(180,350, 25, 30);


                                    this.add(tf4);
                                    tf4.setBounds(205,350, 25, 30);


                                    this.add(tf5);
                                    tf5.setBounds(230,350, 25, 30);


                                    this.add(tf6);
                                    tf6.setBounds(255,350, 25, 30);


                                    this.add(tf7);
                                    tf7.setBounds(280,350, 25, 30);
                                    break;

                    case 8: 

                                    this.add(tf1);
                                    tf1.setBounds(130,350, 25, 30);

                                    this.add(tf2);
                                    tf2.setBounds(155,350, 25, 30);


                                    this.add(tf3);
                                    tf3.setBounds(180,350, 25, 30);


                                    this.add(tf4);
                                    tf4.setBounds(205,350, 25, 30);


                                    this.add(tf5);
                                    tf5.setBounds(230,350, 25, 30);


                                    this.add(tf6);
                                    tf6.setBounds(255,350, 25, 30);


                                    this.add(tf7);
                                    tf7.setBounds(280,350, 25, 30);


                                    this.add(tf8);
                                    tf8.setBounds(305,350, 25, 30);
                                  break;

                    case 9: 
                                    this.add(tf1);
                                    tf1.setBounds(130,350, 25, 30);

                                    this.add(tf2);
                                    tf2.setBounds(155,350, 25, 30);

                                    this.add(tf3);
                                    tf3.setBounds(180,350, 25, 30);


                                    this.add(tf4);
                                    tf4.setBounds(205,350, 25, 30);


                                    this.add(tf5);
                                    tf5.setBounds(230,350, 25, 30);


                                    this.add(tf6);
                                    tf6.setBounds(255,350, 25, 30);


                                    this.add(tf7);
                                    tf7.setBounds(280,350, 25, 30);


                                    this.add(tf8);
                                    tf8.setBounds(305,350, 25, 30);


                                    this.add(tf9);
                                    tf9.setBounds(330,350, 25, 30);
                                   break;

                    case 10:
                                    this.add(tf1);
                                    tf1.setBounds(130,350, 25, 30);


                                    this.add(tf2);
                                    tf2.setBounds(155,350, 25, 30);


                                    this.add(tf3);
                                    tf3.setBounds(180,350, 25, 30);


                                    this.add(tf4);
                                    tf4.setBounds(205,350, 25, 30);


                                    this.add(tf5);
                                    tf5.setBounds(230,350, 25, 30);


                                    this.add(tf6);
                                    tf6.setBounds(255,350, 25, 30);

                                    this.add(tf7);
                                    tf7.setBounds(280,350, 25, 30);

                                    this.add(tf8);
                                    tf8.setBounds(305,350, 25, 30);

                                    this.add(tf9);
                                    tf9.setBounds(330,350, 25, 30);

                                    this.add(tf10);
                                   break;

                    case 11:

                this.add(tf11);
                                    this.add(tf1);
                                    tf1.setBounds(130,350, 25, 30);


                                    this.add(tf2);
                                    tf2.setBounds(155,350, 25, 30);


                                    this.add(tf3);
                                    tf3.setBounds(180,350, 25, 30);

                                    this.add(tf4);
                                    tf4.setBounds(205,350, 25, 30);


                                    this.add(tf5);
                                    tf5.setBounds(230,350, 25, 30);

                                    this.add(tf6);
                                    tf6.setBounds(255,350, 25, 30);

                                    this.add(tf7);
                                    tf7.setBounds(280,350, 25, 30);

                                    this.add(tf8);
                                    tf8.setBounds(305,350, 25, 30);

                                   this.add(tf9); 
                                    tf9.setBounds(330,350, 25, 30);

                                    this.add(tf10);
                                    tf10.setBounds(355,350, 25, 30);

                                    this.add(tf11);
                                    tf11.setBounds(380,350, 25, 30);
                                  break;
                    case 12: 

                        this.add(tf12);

                                    this.add(tf1);
                                    tf1.setBounds(130,350, 25, 30);

                                    this.add(tf2);
                                    tf2.setBounds(155,350, 25, 30);

                                    this.add(tf3);
                                    tf3.setBounds(180,350, 25, 30);

                                    this.add(tf4);
                                    tf4.setBounds(205,350, 25, 30);

                                    this.add(tf5);
                                    tf5.setBounds(230,350, 25, 30);

                                    this.add(tf6);
                                    tf6.setBounds(255,350, 25, 30);

                                    this.add(tf7);
                                    tf7.setBounds(280,350, 25, 30);

                                    this.add(tf8);
                                    tf8.setBounds(305,350, 25, 30);

                                    this.add(tf9);
                                    tf9.setBounds(330,350, 25, 30);

                                    this.add(tf10);
                                    tf10.setBounds(355,350, 25, 30);

                                    this.add(tf11);
                                    tf11.setBounds(380,350, 25, 30);

                                    this.add(tf12);
                                    tf12.setBounds(405,350, 25, 30);
                                   break;


                }
                   
        repaint();
        jButton1.setEnabled(false);
        
    }

    private void letraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letraKeyReleased
      
        aplauso.stop();
        aplauso.setFramePosition(0);
        
        buu.stop();
        buu.setFramePosition(0);
        
        pierde.stop();
        pierde.setFramePosition(0);
        
        gana.stop();
        gana.setFramePosition(0);
        // valido que digiten solo letras, si no son letras no hace nada
        if (!Character.isLetter(evt.getKeyChar())
                && !(evt.getKeyChar() == KeyEvent.VK_SPACE)
                && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) 
        {
            evt.consume();
            lblErrorLetra.setText("Escribe solo letras");
        }else{
            int n=palabra.indexOf(letra.getText());
            boolean existe=false;
            
        String e = usadas.getText();
        int r = e.indexOf(letra.getText());
            
            if(r==-1){
                
                
                
                 while(n>-1){

                      switch(n){
                          case 0: tf1.setText(letra.getText().toUpperCase());

                          aplauso.start();
                          cantrayas--;
                          existe=true;break;
                          case 1: tf2.setText(letra.getText().toUpperCase());
                          aplauso.start();
                          cantrayas--;

                          existe=true;break;
                          case 2: tf3.setText(letra.getText().toUpperCase());
                          aplauso.start();
                          cantrayas--;

                          existe=true;break;
                          case 3: tf4.setText(letra.getText().toUpperCase());
                          aplauso.start();
                          cantrayas--;

                          existe=true;break;
                          case 4: tf5.setText(letra.getText().toUpperCase());
                          aplauso.start();
                          cantrayas--;

                          existe=true;break;
                          case 5: tf6.setText(letra.getText().toUpperCase());
                          aplauso.start();
                          cantrayas--;
                          existe=true;break;
                          case 6: tf7.setText(letra.getText().toUpperCase());
                          aplauso.start();
                          cantrayas--;
                          existe=true;break;
                          case 7: tf8.setText(letra.getText().toUpperCase());
                          aplauso.start();
                          cantrayas--;
                          existe=true;break;
                          case 8: tf9.setText(letra.getText().toUpperCase());
                          aplauso.start();
                          cantrayas--;
                          existe=true;break;
                          case 9: tf10.setText(letra.getText().toUpperCase());
                          aplauso.start();
                          cantrayas--;

                          existe=true;break;
                          case 10: tf11.setText(letra.getText().toUpperCase());
                          aplauso.start();
                          cantrayas--;

                          existe=true;break;
                          case 11: tf12.setText(letra.getText().toUpperCase());
                          aplauso.start();
                          cantrayas--;

                          existe=true;break;

                      }


                      if(n>=palabra.length()) n=-1;
                      else n=palabra.indexOf(letra.getText(),n+1);
                 
            }

            if(!existe){
                aplauso.stop();
                buu.start();
                parte++;
                this.repaint();
                buu.start();
            }
                
                
                
                
            

            usadas.setText(usadas.getText()+" "+letra.getText());

            letra.setText("");

             if(parte==6){

                   aplauso.stop();
                buu.stop();
                     
                  pierde.start();  
                JOptionPane.showMessageDialog(rootPane, "AHORCADO! La palabra era:"+" "+palabra);  
                
              
               
                armoletras();
               
                jButton1.setEnabled(true);
                
                usadas.setText("");
                pista.setText("");
                
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                tf4.setText("");
                tf5.setText("");
                tf6.setText("");
                tf7.setText("");
                tf8.setText("");
                tf9.setText("");
                tf10.setText("");
                tf11.setText("");
                tf12.setText("");  
                
                lblErrorLetra.setText("");
             
             }else if(cantrayas==0){
               
              
                 // aquí pones todo lo necesario de ganador, es similar a perdedor. y aquí vas a llamar al método que está haciendo Pablo, para grabar puntos.
                    aplauso.stop();
                 buu.stop();
                 
                 gana.start();
                 JOptionPane.showMessageDialog(rootPane, "GANASTE!!! Has sumado 100 puntos");
                 
                  usadas.setText("");
                pista.setText("");
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                tf4.setText("");
                tf5.setText("");
                tf6.setText("");
                tf7.setText("");
                tf8.setText("");
                tf9.setText("");
                tf10.setText("");
                tf11.setText("");
                tf12.setText(""); 
               
              
                 lblErrorLetra.setText("");
             
                 jButton1.setEnabled(true);
               
               
                
                
                    
             }
                
                
                
            }else{ 
                JOptionPane.showMessageDialog(rootPane, "ESA LETRA YA FUE UTILIZADA!");
       
            letra.setText("");
           
                    }
        }
        
    }//GEN-LAST:event_letraKeyReleased

    private void letraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letraKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_letraKeyTyped


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ahorcado ah=new Ahorcado();
                ah.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblErrorLetra;
    private javax.swing.JTextField letra;
    private javax.swing.JLabel pista;
    private javax.swing.JLabel usadas;
    // End of variables declaration//GEN-END:variables

    
    
    private void aleatorio(){
        palabra="";
        int aletcate=(int) (Math.random()*5+1);
        
      switch(aletcate){
          case 1: cate1();break;
          case 2: cate2();break;
          case 3: cate3();break;
          case 4: cate4();break;
          case 5: cate5();break;
        
         
      }
             
    }
    private void cate1(){
         int aletpalabra1=(int) (Math.random()*5+1);
               
              
    switch(aletpalabra1){

        case 0:
   

        break;

        case 1:
            palabra="uruguay";
            pista.setText("SU CAPITAL ES MONTEVIDEO");

break;

    case 2:
        palabra="argentina";
        pista.setText("MESSI ES DE ....");
break;

    case 3:
        palabra="chile";
        pista.setText("CEDE DE LA COPA AMERICA 2015");

break;

    case 4:
        palabra="mexico";
        pista.setText("SE CONOCE POR SU COMIDA PICANTE");
break;

    case 5:
        palabra="brasil";
        pista.setText("EL PAIS CON MAS MUNDIALES");

break;
}
    }
    
    private void cate2(){
         int aletpalabra2=(int) (Math.random()*5+1);
         
         switch(aletpalabra2){

        case 0:
   

        break;

        case 1:
            palabra="tigre";
            pista.setText("FELINO CON PIEL A RAYAS");

break;

    case 2:
        palabra="pajaro";
        pista.setText("TIENE ALAS");
break;

    case 3:
        palabra="caballo";
        pista.setText("ANIMAL DE CAMPO,SE PUEDE ANDAR EN EL ");

break;

    case 4:
        palabra="perro";
        pista.setText("EL MEJOR AMIGO DEL HOMBRE");
break;

    case 5:
        palabra="gato";
        pista.setText("TIENE 7 VIDAS");

break;
}
         
}
     private void cate3(){
         int aletpalabra3=(int) (Math.random()*5+1);
         
         switch(aletpalabra3){

        case 0:
   

        break;

        case 1:
            palabra="milanesa";
            pista.setText("SE HACE CON PAN RALLADO Y CARNE");

break;

    case 2:
        palabra="pasta";
        pista.setText("SE HACE CON HARINA Y VIENE DE ITALIA");
break;

    case 3:
        palabra="queso";
        pista.setText("SE HACE CON LECHE ");

break;

    case 4:
        palabra="manzana";
        pista.setText("VIENE DE UN ARBOL Y ES ROJA");
break;

    case 5:
        palabra="pizza";
        pista.setText("ES CIRCULAR Y LLEVA SALSA");

break;
}
         
}
  
         

       private void cate4(){
         int aletpalabra4=(int) (Math.random()*4+1);
         
         switch(aletpalabra4){

        case 0:
   

        break;

        case 1:
            palabra="harrypotter";
            pista.setText("HECHIZOS Y VARITAS");

break;

 

    case 2:
        palabra="indianajones";
        pista.setText("CAZADOR DE TESOROS/PROFESOR  ");

break;

    case 3:
        palabra="jurassicpark";
        pista.setText("PELICULA DE DINOSAURIOS");
break;

    case 4:
        palabra="starwars";
        pista.setText("DARTH VADER ES EL VILLANO");

break;
}
         
}
        private void cate5(){
         int aletpalabra5=(int) (Math.random()*5+1);
         
         switch(aletpalabra5){

        case 0:
   

        break;

        case 1:
            palabra="piano";
            pista.setText("TECLAS NEGRAS Y BLANCAS");

break;

    case 2:
        palabra="guitarra";
        pista.setText("INSTRUMENTO A CUERDA");
break;

    case 3:
        palabra="bateria";
        pista.setText("EL CELULAR USA UNA.....PARA PRENDER");

break;

    case 4:
        palabra="flauta";
        pista.setText("INSTRUMENTO DE AIRE");
break;

    case 5:
        palabra="violin";
        pista.setText("SE TOCA CON UN ARCO");

break;
}
         
}
   
         
}




