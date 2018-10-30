package Tateti;

import LogicaGuardar.GuardarPuntos;
import LogicaGuardar.Puntos;
import Tetris.Tetris;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 *
 * @author malol
 */
public class tateti extends javax.swing.JFrame {
     // VARIABLES AGREGADAS POR EL PROFE, COPIEN ESTO
    public String usuario;
    int puntos=0;
    int lugar=-1;
    ArrayList<Puntos> arr=null;
    GuardarPuntos gp=new GuardarPuntos();
    // AQUI TERMINA LO AGREGADO
    private boolean terminoJuego = false;
    private String[][] matriz = new String[3][3];
    JButton bt1[][];
    int tablero[] = new int[9];
    int cantj = 0;

    ComputadoraIA juegam = new ComputadoraIA();

    /**
     * Creates new form tateti
     */
    public tateti(){
        initComponents();
    }
    public tateti(String usuario) {
        initComponents();
        
// SISTEMA DE PUNTAJE AGREGADO POR EL PROFE, COPIEN ESTO HASTA...
        arr=new ArrayList<Puntos>();
        arr=gp.getLectura("Puntos.txt");
        this.usuario=usuario;
        for(int i=0;i<arr.size();i++){
            if(usuario.equals(arr.get(i).getnombrejugador()) && "tateti".equals(arr.get(i).getnombrejuego())){// EN CADA JUEGO CAMBIAN EL NOMBRE DEL JUEGO DONDE DICE Tetris
                puntos=arr.get(i).getpuntos();
                lugar=i;
                System.out.println("encontro en "+lugar+" puntos "+puntos);
                i=arr.size();
            }
        }
        if(lugar==-1){
            Puntos pu=new Puntos("tateti",usuario,0,0);// AQUI TAMBIEN CAMBIEN EL NOMBRE DEL JUEGO
            arr.add(pu);
            lugar=arr.lastIndexOf(pu);
            JOptionPane.showMessageDialog(rootPane, "Primera vez que juega, puntaje 0");
        }else JOptionPane.showMessageDialog(rootPane, "Bienvenido "+arr.get(lugar).getnombrejugador()+". Su puntaje en el tetris es "+arr.get(lugar).getpuntos() );
        // AQUI.... TERMINA LO AGREGADO POR EL PROFE
        
        bt1 = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                bt1[i][j] = new JButton(" ");
            }

        }
        for (int i = 0; i < 9; i++) {
            tablero[i] = 0;
        }
        int col = 5;
        int fila = 5;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                bt1[j][i].setBackground(Color.gray);
                bt1[j][i].setBounds(col, fila, 170, 170);
                bt1[j][i].setEnabled(false);
                matriz[j][i] = "-";
                panel.add(bt1[i][j]);
                col = col + 180;
            }
            col = 5;
            fila = fila + 180;
        }
        bt1[0][0].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt100ActionPerformed(evt);
            }

        });

        bt1[0][1].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt101ActionPerformed(evt);
            }

        });
        bt1[0][2].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt102ActionPerformed(evt);
            }
        });
        bt1[1][0].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt110ActionPerformed(evt);
            }

        });
        bt1[1][1].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt111ActionPerformed(evt);
            }
        });
        bt1[1][2].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt112ActionPerformed(evt);
            }

        });
        bt1[2][0].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt120ActionPerformed(evt);
            }

        });
        bt1[2][1].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt121ActionPerformed(evt);
            }

        });
        bt1[2][2].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt122ActionPerformed(evt);
            }

        });

    }

// este metodo se ejecuta cuando hagas un clic en el boton 0 0, debes hacer lo mismo en los otros botones cambiando el 0 0 por el que corresponda.
    private void bt100ActionPerformed(ActionEvent evt) {
        bt1[0][0].setEnabled(false);
        bt1[0][0].setIcon(new ImageIcon("src/org/me/images/X.png"));

        tablero[0] = 1;
        matriz[0][0] = "X";

        if (verifica_tateti(1)) {// verifica si hizo el tateti, retorna verdadero o falso, se le pasa 1 en el parametro para saber que es el boton 1.
            JOptionPane.showMessageDialog(rootPane, "GANASTE");
            ganajugador();
            luegoQueGaneAlguien();
        } else if (mueve_maquina()) {// mueve maquina y devuelve true si hizo el tateti o false
            // muestro cartel de gana maquina e inhabilito todos los botones.
        }
    }

    private void bt101ActionPerformed(ActionEvent evt) {
        bt1[0][1].setEnabled(false);

        tablero[3] = 1;
        bt1[0][1].setIcon(new ImageIcon("src/org/me/images/X.png"));
        matriz[0][1] = "X";

        if (verifica_tateti(4)) {// verifica si hizo el tateti, retorna verdadero o falso, se le pasa 1 en el parametro para saber que es el boton 1.
            // pongo lo que haya que hacer por verdadero.
            JOptionPane.showMessageDialog(rootPane, "GANASTE");
            luegoQueGaneAlguien();
        } else if (mueve_maquina()) {   // agrega aqui lo mismo que esta en el boton anterior cambiando los indices 0 0 por 0 1. y luego todos los de abajo.
        }

    }

    private void bt102ActionPerformed(ActionEvent evt) {
        bt1[0][2].setEnabled(false);

        tablero[6] = 1;
        //bt1[0][2].setEnabled(false);
        bt1[0][2].setIcon(new ImageIcon("src/org/me/images/X.png"));
        matriz[0][2] = "X";

        if (verifica_tateti(7)) {// verifica si hizo el tateti, retorna verdadero o falso, se le pasa 1 en el parametro para saber que es el boton 1.
            // pongo lo que haya que hacer por verdadero.
            JOptionPane.showMessageDialog(rootPane, "GANASTE");
            luegoQueGaneAlguien();
        } else if (mueve_maquina()) {    // aqui el otro
        }

    }

    private void bt110ActionPerformed(ActionEvent evt) {

        bt1[1][0].setEnabled(false);
        tablero[1] = 1;
        bt1[1][0].setIcon(new ImageIcon("src/org/me/images/X.png"));
        matriz[1][0] = "X";

        if (verifica_tateti(2)) {// verifica si hizo el tateti, retorna verdadero o falso, se le pasa 1 en el parametro para saber que es el boton 1.
            // pongo lo que haya que hacer por verdadero.
            JOptionPane.showMessageDialog(rootPane, "GANASTE");
            luegoQueGaneAlguien();
        } else if (mueve_maquina()) { // aqui el otro

        }

    }

    private void bt111ActionPerformed(ActionEvent evt) {
        String directorioRaiz = System.getProperty("user.dir");
    System.out.println("Directorio de trabajo = " + directorioRaiz);
        File carpeta = new File(directorioRaiz);
    if (carpeta.exists()) {
        File[] ficheros = carpeta.listFiles(); //Listar archivos en carpeta raiz
        for (File f : ficheros) {
            System.out.println(f.getName());
        }
    } else {

    }
        bt1[1][1].setEnabled(false);
        tablero[4] = 1;
        bt1[1][1].setIcon(new ImageIcon("src/org/me/images/X.png"));

        matriz[1][1] = "X";

        if (verifica_tateti(5)) {// verifica si hizo el tateti, retorna verdadero o falso, se le pasa 1 en el parametro para saber que es el boton 1.
            // pongo lo que haya que hacer por verdadero.
            JOptionPane.showMessageDialog(rootPane, "GANASTE");
            luegoQueGaneAlguien();
        } else if (mueve_maquina()) {    // aqui el otro
        }

    }

    private void bt112ActionPerformed(ActionEvent evt) {

        bt1[1][2].setEnabled(false);
        tablero[7] = 1;
        bt1[1][2].setIcon(new ImageIcon("src/org/me/images/X.png"));
        // panel.repaint();
        // repaint();
        matriz[1][2] = "X";

        if (verifica_tateti(8)) {// verifica si hizo el tateti, retorna verdadero o falso, se le pasa 1 en el parametro para saber que es el boton 1.
            // pongo lo que haya que hacer por verdadero.
            JOptionPane.showMessageDialog(rootPane, "GANASTE");
            luegoQueGaneAlguien();
        } else if (mueve_maquina()) {    // aqui el otro
        }     // aqui el otro

    }

    private void bt120ActionPerformed(ActionEvent evt) {

        bt1[2][0].setEnabled(false);
        tablero[2] = 1;
        bt1[2][0].setIcon(new ImageIcon("src/org/me/images/X.png"));
        // panel.repaint();
        //   repaint();
        matriz[2][0] = "X";

        if (verifica_tateti(3)) {// verifica si hizo el tateti, retorna verdadero o falso, se le pasa 1 en el parametro para saber que es el boton 1.
            // pongo lo que haya que hacer por verdadero.
            JOptionPane.showMessageDialog(rootPane, "GANASTE");
            luegoQueGaneAlguien();
        } else if (mueve_maquina()) {    // aqui el otro
        }    // aqui el otro

    }

    private void bt121ActionPerformed(ActionEvent evt) {

        bt1[2][1].setEnabled(false);
        tablero[5] = 1;
        bt1[2][1].setIcon(new ImageIcon("src/org/me/images/X.png"));
        // panel.repaint();
        //  repaint();
        matriz[2][1] = "X";

        if (verifica_tateti(6)) {// verifica si hizo el tateti, retorna verdadero o falso, se le pasa 1 en el parametro para saber que es el boton 1.
            // pongo lo que haya que hacer por verdadero.
            JOptionPane.showMessageDialog(rootPane, "GANASTE");
            luegoQueGaneAlguien();
        } else if (mueve_maquina()) {    // aqui el otro
        }    // aqui el otro

    }

    private void bt122ActionPerformed(ActionEvent evt) {

        bt1[2][2].setEnabled(false);
        tablero[8] = 1;
        bt1[2][2].setIcon(new ImageIcon("src/org/me/images/X.png"));
        //   panel.repaint();
        //  repaint();
        matriz[2][2] = "X";

        if (verifica_tateti(9) == true) {// verifica si hizo el tateti, retorna verdadero o falso, se le pasa 1 en el parametro para saber que es el boton 1.
            // pongo lo que haya que hacer por verdadero.
            JOptionPane.showMessageDialog(rootPane, "GANASTE");
            luegoQueGaneAlguien();
        } else if (mueve_maquina()) {    // aqui el otro
        }     // aqui el otro

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jugar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(0, 204, 204));

        jugar.setText("JUGAR");
        jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(605, Short.MAX_VALUE)
                .addComponent(jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarActionPerformed

        int turno = (int) (Math.random() * 2);//genero numero random entero entre 0 y 1
        turno++;// le sumo 1 para tener un numero entre 1 y 2

        jugar.setEnabled(false);
System.out.println(bt1.length+" largo");
        for (int i = 0; i < 3; i++) {
            for (int x = 0; x < 3; x++) {
                bt1[x][i].setEnabled(true);
                matriz[x][i] = "-";

            }
        }

        if (turno == 2) {
            JOptionPane.showMessageDialog(rootPane, "Juega la maquina");
            boolean ganador = mueve_maquina();

        } else {
            JOptionPane.showMessageDialog(rootPane, "Juegas tu");

        }

    }//GEN-LAST:event_jugarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tateti().setVisible(true);
            }
        });
    }

    private boolean verifica_tateti(int i) {
        //sumo uno a la cantidad de jugadas
        cantj++;
        boolean hizo = false; // aqui pones la logica que verifica si la maquina hizo tateti y retornas true o false
        int px = 0;
        int py = 0;

        if (i == 1) {
            px = 0;
            py = 0;
        }
        if (i == 2) {
            px = 1;
            py = 0;
        }
        if (i == 3) {
            px = 2;
            py = 0;
        }
        if (i == 4) {
            px = 0;
            py = 1;
        }
        if (i == 5) {
            px = 1;
            py = 1;
        }
        if (i == 6) {
            px = 2;
            py = 1;
        }
        if (i == 7) {
            px = 0;
            py = 2;
        }
        if (i == 8) {
            px = 1;
            py = 2;
        }
        if (i == 9) {
            px = 2;
            py = 2;
        }
        String signo = matriz[px][py];

        if (i == 5) {
            if (matriz[0][0].equals(signo) && matriz[2][2].equals(signo)) {
                hizo = true;
            } else if (matriz[2][0].equals(signo) && matriz[0][2].equals(signo)) {
                hizo = true;
            } else if (matriz[1][0].equals(signo) && matriz[1][2].equals(signo)) {
                hizo = true;
            } else if (matriz[0][1].equals(signo) && matriz[2][1].equals(signo)) {
                hizo = true;
            }
        }
        if (i == 1) {

            if (matriz[1][0].equals(signo) && matriz[2][0].equals(signo)) {
                hizo = true;
            } else if (matriz[1][1].equals(signo) && matriz[2][2].equals(signo)) {
                hizo = true;
            } else if (matriz[0][1].equals(signo) && matriz[0][2].equals(signo)) {
                hizo = true;
            }
        }
        if (i == 3) {
            if (matriz[1][0].equals(signo) && matriz[0][0].equals(signo)) {
                hizo = true;
            } else if (matriz[1][1].equals(signo) && matriz[0][2].equals(signo)) {
                hizo = true;
            } else if (matriz[2][1].equals(signo) && matriz[2][2].equals(signo)) {
                hizo = true;
            }
        }
        if (i == 9) {
            if (matriz[2][1].equals(signo) && matriz[2][0].equals(signo)) {
                hizo = true;
            } else if (matriz[1][1].equals(signo) && matriz[0][0].equals(signo)) {
                hizo = true;
            } else if (matriz[1][2].equals(signo) && matriz[0][2].equals(signo)) {
                hizo = true;
            }
        }
        if (i == 7) {
            if (matriz[0][1].equals(signo) && matriz[0][0].equals(signo)) {
                hizo = true;
            } else if (matriz[1][1].equals(signo) && matriz[2][0].equals(signo)) {
                hizo = true;
            } else if (matriz[1][2].equals(signo) && matriz[2][2].equals(signo)) {
                hizo = true;
            }
        }
        if (i == 2) {
            if (matriz[0][0].equals(signo) && matriz[2][0].equals(signo)) {
                hizo = true;
            } else if (matriz[1][1].equals(signo) && matriz[1][2].equals(signo)) {
                hizo = true;
            }
        }
        if (i == 6) {
            if (matriz[2][0].equals(signo) && matriz[2][2].equals(signo)) {
                hizo = true;
            } else if (matriz[1][1].equals(signo) && matriz[0][1].equals(signo)) {
                hizo = true;
            }
        }
        if (i == 8) {
            if (matriz[0][2].equals(signo) && matriz[2][2].equals(signo)) {
                hizo = true;
            } else if (matriz[1][1].equals(signo) && matriz[1][0].equals(signo)) {
                hizo = true;
            }
        }
        if (i == 4) {
            if (matriz[0][0].equals(signo) && matriz[0][2].equals(signo)) {
                hizo = true;
            } else if (matriz[1][1].equals(signo) && matriz[2][1].equals(signo)) {
                hizo = true;
            }
        }

        //Alguien hizo el Tateti.
        if (hizo) {
            terminoJuego = true;
        }
        if(cantj==9){
             terminoJuego = true;
             JOptionPane.showMessageDialog(rootPane, "PRESIONAR JUGAR");
        }
        return hizo;
    }

    private boolean mueve_maquina() {

        //repaint();
        int mov = juegam.movimiento(tablero);

        switch (mov) {
            case 0:
                tablero[0] = 2;
                matriz[0][0] = "O";
                bt1[0][0].setIcon(new ImageIcon("src/org/me/images/O.png"));
                bt1[0][0].setEnabled(false);
                if (verifica_tateti(1) == true) {
                    JOptionPane.showMessageDialog(rootPane, "GANO MAQUINA");
                }
                break;
            case 1:
                tablero[1] = 2;
                matriz[1][0] = "O";
                bt1[1][0].setIcon(new ImageIcon("src/org/me/images/O.png"));
                bt1[1][0].setEnabled(false);
                if (verifica_tateti(2) == true) {
                    JOptionPane.showMessageDialog(rootPane, "GANO MAQUINA");
                }
                break;
            case 2:
                tablero[2] = 2;
                matriz[2][0] = "O";
                bt1[2][0].setIcon(new ImageIcon("src/org/me/images/O.png"));
                bt1[2][0].setEnabled(false);
                if (verifica_tateti(3) == true) {
                    JOptionPane.showMessageDialog(rootPane, "GANO MAQUINA");
                }
                break;
            case 3:
                tablero[3] = 2;
                matriz[0][1] = "O";
                bt1[0][1].setIcon(new ImageIcon("src/org/me/images/O.png"));
                bt1[0][1].setEnabled(false);
                if (verifica_tateti(4) == true) {
                    JOptionPane.showMessageDialog(rootPane, "GANO MAQUINA");
                }
                break;
            case 4:
                tablero[4] = 2;
                matriz[1][1] = "O";
                bt1[1][1].setIcon(new ImageIcon("src/org/me/images/O.png"));
                bt1[1][1].setEnabled(false);
                if (verifica_tateti(5) == true) {
                    JOptionPane.showMessageDialog(rootPane, "GANO MAQUINA");
                }
                break;
            case 5:
                tablero[5] = 2;
                matriz[2][1] = "O";
                bt1[2][1].setIcon(new ImageIcon("src/org/me/images/O.png"));
                bt1[2][1].setEnabled(false);
                if (verifica_tateti(6) == true) {
                    JOptionPane.showMessageDialog(rootPane, "GANO MAQUINA");
                }
                break;
            case 6:
                tablero[6] = 2;
                matriz[0][2] = "O";
                bt1[0][2].setIcon(new ImageIcon("src/org/me/images/O.png"));
                bt1[0][2].setEnabled(false);
                if (verifica_tateti(7) == true) {
                    JOptionPane.showMessageDialog(rootPane, "GANO MAQUINA");
                }
                break;
            case 7:
                tablero[7] = 2;
                matriz[1][2] = "O";
                bt1[1][2].setIcon(new ImageIcon("src/org/me/images/O.png"));
                bt1[1][2].setEnabled(false);
                if (verifica_tateti(8) == true) {
                    JOptionPane.showMessageDialog(rootPane, "GANO MAQUINA");
                }
                break;
            case 8:
                tablero[8] = 2;
                matriz[2][2] = "O";
                bt1[2][2].setIcon(new ImageIcon("src/org/me/images/O.png"));
                bt1[2][2].setEnabled(false);
                if (verifica_tateti(9) == true) {
                    JOptionPane.showMessageDialog(rootPane, "GANO MAQUINA");
                }
                break;
        }

        if (terminoJuego) {
            terminoJuego = false;
            luegoQueGaneAlguien();
        }
        return false;

    }

    private void luegoQueGaneAlguien() {
     
        //LIMPIO VARIABLES GLOBALES
        cantj = 0;
        juegam = new ComputadoraIA();
        for (int i = 0; i < 9; i++) {
            tablero[i] = 0;
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

               
                //deshabilitar botones
                bt1[j][i].setEnabled(false);
                //sacar imagenes anteriores
                bt1[j][i].setIcon(new ImageIcon("NADA.PNG"));
                //limpiar matriz
                matriz[j][i] = "-";
     
            }
           
        }
      
        //acá termina lo repetido del inicio que carga casilleros

        //habilitar botón.
        jugar.setEnabled(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jugar;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    private void ganajugador() {
         // AQUI SISTEMA DE PUNTAJE AGREGADO POR EL PROFE, COPIEN ESTO
        puntos=puntos+5;
        arr.get(lugar).setpuntos(puntos);
      
        try {
            gp.setEscritura(arr,"Puntos.txt");
        } catch (Exception ex) {
            Logger.getLogger(Tetris.class.getName()).log(Level.SEVERE, null, ex);
        }
//             HASTA AQUI, EN EL LUGAR DONDE UDS QUIERAN GUARDAR LOS PUNTOS
    }

}
