package BtNaval;




import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;


/**
 *
 * @author Usuario
 */
public class BatallaNaval extends javax.swing.JFrame {
    NodoCelda matriz[][]=new NodoCelda[10][10];// matriz del tablero de la maquina.
    NodoCelda matrizj[][]=new NodoCelda[10][10];// matriz del tablero del jugador
    NodoCelda nodo2=new NodoCelda();
    NodoCelda nodo3=new NodoCelda();
    ArrayList<NodoCelda> arrtoc=new ArrayList();// guarda los nodos tocados en jugada maquina
    ArrayList<NodoCelda> arrjugada=new ArrayList();// guarda los nodos a jugar en jugada maquina
    int midisparo=0;
 
    /**
     * Creates new form BatallaNaval
     */
    public BatallaNaval() {
        initComponents();
        
    
        // recorro los botones del panel de la maquina y los inhabilito todos
        for(int x=0;x<jPanel2.getComponentCount();x++){
            if(jPanel2.getComponent(x) instanceof JButton){
                JButton jb = (JButton) jPanel2.getComponent(x);
                jb.setEnabled(false);
                
            }
        }

            
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton111 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        c1 = new javax.swing.JButton();
        c2 = new javax.swing.JButton();
        c3 = new javax.swing.JButton();
        c4 = new javax.swing.JButton();
        c5 = new javax.swing.JButton();
        c6 = new javax.swing.JButton();
        c7 = new javax.swing.JButton();
        c8 = new javax.swing.JButton();
        c9 = new javax.swing.JButton();
        c10 = new javax.swing.JButton();
        c11 = new javax.swing.JButton();
        c12 = new javax.swing.JButton();
        c13 = new javax.swing.JButton();
        c14 = new javax.swing.JButton();
        c15 = new javax.swing.JButton();
        c16 = new javax.swing.JButton();
        c17 = new javax.swing.JButton();
        c18 = new javax.swing.JButton();
        c19 = new javax.swing.JButton();
        c20 = new javax.swing.JButton();
        c21 = new javax.swing.JButton();
        c22 = new javax.swing.JButton();
        c23 = new javax.swing.JButton();
        c24 = new javax.swing.JButton();
        c25 = new javax.swing.JButton();
        c26 = new javax.swing.JButton();
        c27 = new javax.swing.JButton();
        c28 = new javax.swing.JButton();
        c29 = new javax.swing.JButton();
        c30 = new javax.swing.JButton();
        c31 = new javax.swing.JButton();
        c32 = new javax.swing.JButton();
        c33 = new javax.swing.JButton();
        c34 = new javax.swing.JButton();
        c35 = new javax.swing.JButton();
        c36 = new javax.swing.JButton();
        c37 = new javax.swing.JButton();
        c38 = new javax.swing.JButton();
        c39 = new javax.swing.JButton();
        c40 = new javax.swing.JButton();
        c41 = new javax.swing.JButton();
        c42 = new javax.swing.JButton();
        c43 = new javax.swing.JButton();
        c44 = new javax.swing.JButton();
        c45 = new javax.swing.JButton();
        c46 = new javax.swing.JButton();
        c47 = new javax.swing.JButton();
        c48 = new javax.swing.JButton();
        c49 = new javax.swing.JButton();
        c50 = new javax.swing.JButton();
        c51 = new javax.swing.JButton();
        c52 = new javax.swing.JButton();
        c53 = new javax.swing.JButton();
        c54 = new javax.swing.JButton();
        c55 = new javax.swing.JButton();
        c56 = new javax.swing.JButton();
        c57 = new javax.swing.JButton();
        c58 = new javax.swing.JButton();
        c59 = new javax.swing.JButton();
        c60 = new javax.swing.JButton();
        c61 = new javax.swing.JButton();
        c62 = new javax.swing.JButton();
        c63 = new javax.swing.JButton();
        c64 = new javax.swing.JButton();
        c65 = new javax.swing.JButton();
        c66 = new javax.swing.JButton();
        c67 = new javax.swing.JButton();
        c68 = new javax.swing.JButton();
        c69 = new javax.swing.JButton();
        c70 = new javax.swing.JButton();
        c71 = new javax.swing.JButton();
        c72 = new javax.swing.JButton();
        c73 = new javax.swing.JButton();
        c74 = new javax.swing.JButton();
        c75 = new javax.swing.JButton();
        c76 = new javax.swing.JButton();
        c77 = new javax.swing.JButton();
        c78 = new javax.swing.JButton();
        c79 = new javax.swing.JButton();
        c80 = new javax.swing.JButton();
        c81 = new javax.swing.JButton();
        c82 = new javax.swing.JButton();
        c83 = new javax.swing.JButton();
        c84 = new javax.swing.JButton();
        c85 = new javax.swing.JButton();
        c86 = new javax.swing.JButton();
        c87 = new javax.swing.JButton();
        c88 = new javax.swing.JButton();
        c89 = new javax.swing.JButton();
        c90 = new javax.swing.JButton();
        c91 = new javax.swing.JButton();
        c92 = new javax.swing.JButton();
        c93 = new javax.swing.JButton();
        c94 = new javax.swing.JButton();
        c95 = new javax.swing.JButton();
        c96 = new javax.swing.JButton();
        c97 = new javax.swing.JButton();
        c98 = new javax.swing.JButton();
        c99 = new javax.swing.JButton();
        c100 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        paneljugador = new javax.swing.JPanel();
        c101 = new javax.swing.JButton();
        c102 = new javax.swing.JButton();
        c103 = new javax.swing.JButton();
        c104 = new javax.swing.JButton();
        c105 = new javax.swing.JButton();
        c106 = new javax.swing.JButton();
        c107 = new javax.swing.JButton();
        c108 = new javax.swing.JButton();
        c109 = new javax.swing.JButton();
        c110 = new javax.swing.JButton();
        c111 = new javax.swing.JButton();
        c112 = new javax.swing.JButton();
        c113 = new javax.swing.JButton();
        c114 = new javax.swing.JButton();
        c115 = new javax.swing.JButton();
        c116 = new javax.swing.JButton();
        c117 = new javax.swing.JButton();
        c118 = new javax.swing.JButton();
        c119 = new javax.swing.JButton();
        c120 = new javax.swing.JButton();
        c121 = new javax.swing.JButton();
        c122 = new javax.swing.JButton();
        c123 = new javax.swing.JButton();
        c124 = new javax.swing.JButton();
        c125 = new javax.swing.JButton();
        c126 = new javax.swing.JButton();
        c127 = new javax.swing.JButton();
        c128 = new javax.swing.JButton();
        c129 = new javax.swing.JButton();
        c130 = new javax.swing.JButton();
        c131 = new javax.swing.JButton();
        c132 = new javax.swing.JButton();
        c133 = new javax.swing.JButton();
        c134 = new javax.swing.JButton();
        c135 = new javax.swing.JButton();
        c136 = new javax.swing.JButton();
        c137 = new javax.swing.JButton();
        c138 = new javax.swing.JButton();
        c139 = new javax.swing.JButton();
        c140 = new javax.swing.JButton();
        c141 = new javax.swing.JButton();
        c142 = new javax.swing.JButton();
        c143 = new javax.swing.JButton();
        c144 = new javax.swing.JButton();
        c145 = new javax.swing.JButton();
        c146 = new javax.swing.JButton();
        c147 = new javax.swing.JButton();
        c148 = new javax.swing.JButton();
        c149 = new javax.swing.JButton();
        c150 = new javax.swing.JButton();
        c151 = new javax.swing.JButton();
        c152 = new javax.swing.JButton();
        c153 = new javax.swing.JButton();
        c154 = new javax.swing.JButton();
        c155 = new javax.swing.JButton();
        c156 = new javax.swing.JButton();
        c157 = new javax.swing.JButton();
        c158 = new javax.swing.JButton();
        c159 = new javax.swing.JButton();
        c160 = new javax.swing.JButton();
        c161 = new javax.swing.JButton();
        c162 = new javax.swing.JButton();
        c163 = new javax.swing.JButton();
        c164 = new javax.swing.JButton();
        c165 = new javax.swing.JButton();
        c166 = new javax.swing.JButton();
        c167 = new javax.swing.JButton();
        c168 = new javax.swing.JButton();
        c169 = new javax.swing.JButton();
        c170 = new javax.swing.JButton();
        c171 = new javax.swing.JButton();
        c172 = new javax.swing.JButton();
        c173 = new javax.swing.JButton();
        c174 = new javax.swing.JButton();
        c175 = new javax.swing.JButton();
        c176 = new javax.swing.JButton();
        c177 = new javax.swing.JButton();
        c178 = new javax.swing.JButton();
        c179 = new javax.swing.JButton();
        c180 = new javax.swing.JButton();
        c181 = new javax.swing.JButton();
        c182 = new javax.swing.JButton();
        c183 = new javax.swing.JButton();
        c184 = new javax.swing.JButton();
        c185 = new javax.swing.JButton();
        c186 = new javax.swing.JButton();
        c187 = new javax.swing.JButton();
        c188 = new javax.swing.JButton();
        c189 = new javax.swing.JButton();
        c190 = new javax.swing.JButton();
        c191 = new javax.swing.JButton();
        c192 = new javax.swing.JButton();
        c193 = new javax.swing.JButton();
        c194 = new javax.swing.JButton();
        c195 = new javax.swing.JButton();
        c196 = new javax.swing.JButton();
        c197 = new javax.swing.JButton();
        c198 = new javax.swing.JButton();
        c199 = new javax.swing.JButton();
        c200 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cant1 = new javax.swing.JLabel();
        cant2 = new javax.swing.JLabel();
        cant3 = new javax.swing.JLabel();
        cant4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cantjuga1 = new javax.swing.JTextField();
        cantjuga2 = new javax.swing.JTextField();
        cantjuga3 = new javax.swing.JTextField();
        cantjuga4 = new javax.swing.JTextField();
        avisos = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        columnam = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        filam = new javax.swing.JTextField();
        agua = new javax.swing.JRadioButton();
        tocado = new javax.swing.JRadioButton();
        hundido = new javax.swing.JRadioButton();
        tetoca = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1015, 520));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 484));

        jButton111.setText("Comenzar a jugar");
        jButton111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton111ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setLayout(null);

        c1.setToolTipText("");
        c1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c1.setHideActionText(true);
        c1.setName(""); // NOI18N
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        jPanel2.add(c1);
        c1.setBounds(30, 20, 30, 30);

        c2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        jPanel2.add(c2);
        c2.setBounds(60, 20, 30, 30);

        c3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });
        jPanel2.add(c3);
        c3.setBounds(90, 20, 30, 30);

        c4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });
        jPanel2.add(c4);
        c4.setBounds(120, 20, 30, 30);

        c5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5ActionPerformed(evt);
            }
        });
        jPanel2.add(c5);
        c5.setBounds(150, 20, 30, 30);

        c6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c6ActionPerformed(evt);
            }
        });
        jPanel2.add(c6);
        c6.setBounds(180, 20, 30, 30);

        c7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c7ActionPerformed(evt);
            }
        });
        jPanel2.add(c7);
        c7.setBounds(210, 20, 30, 30);

        c8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c8ActionPerformed(evt);
            }
        });
        jPanel2.add(c8);
        c8.setBounds(240, 20, 30, 30);

        c9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c9ActionPerformed(evt);
            }
        });
        jPanel2.add(c9);
        c9.setBounds(270, 20, 30, 30);

        c10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c10ActionPerformed(evt);
            }
        });
        jPanel2.add(c10);
        c10.setBounds(300, 20, 30, 30);

        c11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c11ActionPerformed(evt);
            }
        });
        jPanel2.add(c11);
        c11.setBounds(30, 50, 30, 30);

        c12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c12ActionPerformed(evt);
            }
        });
        jPanel2.add(c12);
        c12.setBounds(60, 50, 30, 30);

        c13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c13ActionPerformed(evt);
            }
        });
        jPanel2.add(c13);
        c13.setBounds(90, 50, 30, 30);

        c14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c14ActionPerformed(evt);
            }
        });
        jPanel2.add(c14);
        c14.setBounds(120, 50, 30, 30);

        c15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c15ActionPerformed(evt);
            }
        });
        jPanel2.add(c15);
        c15.setBounds(150, 50, 30, 30);

        c16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c16ActionPerformed(evt);
            }
        });
        jPanel2.add(c16);
        c16.setBounds(180, 50, 30, 30);

        c17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c17ActionPerformed(evt);
            }
        });
        jPanel2.add(c17);
        c17.setBounds(210, 50, 30, 30);

        c18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c18ActionPerformed(evt);
            }
        });
        jPanel2.add(c18);
        c18.setBounds(240, 50, 30, 30);

        c19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c19ActionPerformed(evt);
            }
        });
        jPanel2.add(c19);
        c19.setBounds(270, 50, 30, 30);

        c20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c20ActionPerformed(evt);
            }
        });
        jPanel2.add(c20);
        c20.setBounds(300, 50, 30, 30);

        c21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c21ActionPerformed(evt);
            }
        });
        jPanel2.add(c21);
        c21.setBounds(30, 80, 30, 30);

        c22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c22ActionPerformed(evt);
            }
        });
        jPanel2.add(c22);
        c22.setBounds(60, 80, 30, 30);

        c23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c23ActionPerformed(evt);
            }
        });
        jPanel2.add(c23);
        c23.setBounds(90, 80, 30, 30);

        c24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c24ActionPerformed(evt);
            }
        });
        jPanel2.add(c24);
        c24.setBounds(120, 80, 30, 30);

        c25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c25ActionPerformed(evt);
            }
        });
        jPanel2.add(c25);
        c25.setBounds(150, 80, 30, 30);

        c26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c26ActionPerformed(evt);
            }
        });
        jPanel2.add(c26);
        c26.setBounds(180, 80, 30, 30);

        c27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c27ActionPerformed(evt);
            }
        });
        jPanel2.add(c27);
        c27.setBounds(210, 80, 30, 30);

        c28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c28ActionPerformed(evt);
            }
        });
        jPanel2.add(c28);
        c28.setBounds(240, 80, 30, 30);

        c29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c29ActionPerformed(evt);
            }
        });
        jPanel2.add(c29);
        c29.setBounds(270, 80, 30, 30);

        c30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c30ActionPerformed(evt);
            }
        });
        jPanel2.add(c30);
        c30.setBounds(300, 80, 30, 30);

        c31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c31ActionPerformed(evt);
            }
        });
        jPanel2.add(c31);
        c31.setBounds(30, 110, 30, 30);

        c32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c32ActionPerformed(evt);
            }
        });
        jPanel2.add(c32);
        c32.setBounds(60, 110, 30, 30);

        c33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c33ActionPerformed(evt);
            }
        });
        jPanel2.add(c33);
        c33.setBounds(90, 110, 30, 30);

        c34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c34ActionPerformed(evt);
            }
        });
        jPanel2.add(c34);
        c34.setBounds(120, 110, 30, 30);

        c35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c35ActionPerformed(evt);
            }
        });
        jPanel2.add(c35);
        c35.setBounds(150, 110, 30, 30);

        c36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c36ActionPerformed(evt);
            }
        });
        jPanel2.add(c36);
        c36.setBounds(180, 110, 30, 30);

        c37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c37ActionPerformed(evt);
            }
        });
        jPanel2.add(c37);
        c37.setBounds(210, 110, 30, 30);

        c38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c38ActionPerformed(evt);
            }
        });
        jPanel2.add(c38);
        c38.setBounds(240, 110, 30, 30);

        c39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c39ActionPerformed(evt);
            }
        });
        jPanel2.add(c39);
        c39.setBounds(270, 110, 30, 30);

        c40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c40ActionPerformed(evt);
            }
        });
        jPanel2.add(c40);
        c40.setBounds(300, 110, 30, 30);

        c41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c41ActionPerformed(evt);
            }
        });
        jPanel2.add(c41);
        c41.setBounds(30, 140, 30, 30);

        c42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c42ActionPerformed(evt);
            }
        });
        jPanel2.add(c42);
        c42.setBounds(60, 140, 30, 30);

        c43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c43ActionPerformed(evt);
            }
        });
        jPanel2.add(c43);
        c43.setBounds(90, 140, 30, 30);

        c44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c44ActionPerformed(evt);
            }
        });
        jPanel2.add(c44);
        c44.setBounds(120, 140, 30, 30);

        c45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c45ActionPerformed(evt);
            }
        });
        jPanel2.add(c45);
        c45.setBounds(150, 140, 30, 30);

        c46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c46ActionPerformed(evt);
            }
        });
        jPanel2.add(c46);
        c46.setBounds(180, 140, 30, 30);

        c47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c47ActionPerformed(evt);
            }
        });
        jPanel2.add(c47);
        c47.setBounds(210, 140, 30, 30);

        c48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c48ActionPerformed(evt);
            }
        });
        jPanel2.add(c48);
        c48.setBounds(240, 140, 30, 30);

        c49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c49ActionPerformed(evt);
            }
        });
        jPanel2.add(c49);
        c49.setBounds(270, 140, 30, 30);

        c50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c50ActionPerformed(evt);
            }
        });
        jPanel2.add(c50);
        c50.setBounds(300, 140, 30, 30);

        c51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c51ActionPerformed(evt);
            }
        });
        jPanel2.add(c51);
        c51.setBounds(30, 170, 30, 30);

        c52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c52ActionPerformed(evt);
            }
        });
        jPanel2.add(c52);
        c52.setBounds(60, 170, 30, 30);

        c53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c53ActionPerformed(evt);
            }
        });
        jPanel2.add(c53);
        c53.setBounds(90, 170, 30, 30);

        c54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c54ActionPerformed(evt);
            }
        });
        jPanel2.add(c54);
        c54.setBounds(120, 170, 30, 30);

        c55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c55ActionPerformed(evt);
            }
        });
        jPanel2.add(c55);
        c55.setBounds(150, 170, 30, 30);

        c56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c56ActionPerformed(evt);
            }
        });
        jPanel2.add(c56);
        c56.setBounds(180, 170, 30, 30);

        c57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c57ActionPerformed(evt);
            }
        });
        jPanel2.add(c57);
        c57.setBounds(210, 170, 30, 30);

        c58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c58ActionPerformed(evt);
            }
        });
        jPanel2.add(c58);
        c58.setBounds(240, 170, 30, 30);

        c59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c59ActionPerformed(evt);
            }
        });
        jPanel2.add(c59);
        c59.setBounds(270, 170, 30, 30);

        c60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c60ActionPerformed(evt);
            }
        });
        jPanel2.add(c60);
        c60.setBounds(300, 170, 30, 30);

        c61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c61ActionPerformed(evt);
            }
        });
        jPanel2.add(c61);
        c61.setBounds(30, 200, 30, 30);

        c62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c62ActionPerformed(evt);
            }
        });
        jPanel2.add(c62);
        c62.setBounds(60, 200, 30, 30);

        c63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c63ActionPerformed(evt);
            }
        });
        jPanel2.add(c63);
        c63.setBounds(90, 200, 30, 30);

        c64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c64ActionPerformed(evt);
            }
        });
        jPanel2.add(c64);
        c64.setBounds(120, 200, 30, 30);

        c65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c65ActionPerformed(evt);
            }
        });
        jPanel2.add(c65);
        c65.setBounds(150, 200, 30, 30);

        c66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c66ActionPerformed(evt);
            }
        });
        jPanel2.add(c66);
        c66.setBounds(180, 200, 30, 30);

        c67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c67ActionPerformed(evt);
            }
        });
        jPanel2.add(c67);
        c67.setBounds(210, 200, 30, 30);

        c68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c68ActionPerformed(evt);
            }
        });
        jPanel2.add(c68);
        c68.setBounds(240, 200, 30, 30);

        c69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c69ActionPerformed(evt);
            }
        });
        jPanel2.add(c69);
        c69.setBounds(270, 200, 30, 30);

        c70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c70ActionPerformed(evt);
            }
        });
        jPanel2.add(c70);
        c70.setBounds(300, 200, 30, 30);

        c71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c71ActionPerformed(evt);
            }
        });
        jPanel2.add(c71);
        c71.setBounds(30, 230, 30, 30);

        c72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c72ActionPerformed(evt);
            }
        });
        jPanel2.add(c72);
        c72.setBounds(60, 230, 30, 30);

        c73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c73ActionPerformed(evt);
            }
        });
        jPanel2.add(c73);
        c73.setBounds(90, 230, 30, 30);

        c74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c74ActionPerformed(evt);
            }
        });
        jPanel2.add(c74);
        c74.setBounds(120, 230, 30, 30);

        c75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c75ActionPerformed(evt);
            }
        });
        jPanel2.add(c75);
        c75.setBounds(150, 230, 30, 30);

        c76.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c76ActionPerformed(evt);
            }
        });
        jPanel2.add(c76);
        c76.setBounds(180, 230, 30, 30);

        c77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c77ActionPerformed(evt);
            }
        });
        jPanel2.add(c77);
        c77.setBounds(210, 230, 30, 30);

        c78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c78ActionPerformed(evt);
            }
        });
        jPanel2.add(c78);
        c78.setBounds(240, 230, 30, 30);

        c79.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c79ActionPerformed(evt);
            }
        });
        jPanel2.add(c79);
        c79.setBounds(270, 230, 30, 30);

        c80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c80ActionPerformed(evt);
            }
        });
        jPanel2.add(c80);
        c80.setBounds(300, 230, 30, 30);

        c81.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c81ActionPerformed(evt);
            }
        });
        jPanel2.add(c81);
        c81.setBounds(30, 260, 30, 30);

        c82.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c82ActionPerformed(evt);
            }
        });
        jPanel2.add(c82);
        c82.setBounds(60, 260, 30, 30);

        c83.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c83ActionPerformed(evt);
            }
        });
        jPanel2.add(c83);
        c83.setBounds(90, 260, 30, 30);

        c84.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c84ActionPerformed(evt);
            }
        });
        jPanel2.add(c84);
        c84.setBounds(120, 260, 30, 30);

        c85.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c85ActionPerformed(evt);
            }
        });
        jPanel2.add(c85);
        c85.setBounds(150, 260, 30, 30);

        c86.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c86ActionPerformed(evt);
            }
        });
        jPanel2.add(c86);
        c86.setBounds(180, 260, 30, 30);

        c87.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c87ActionPerformed(evt);
            }
        });
        jPanel2.add(c87);
        c87.setBounds(210, 260, 30, 30);

        c88.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c88ActionPerformed(evt);
            }
        });
        jPanel2.add(c88);
        c88.setBounds(240, 260, 30, 30);

        c89.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c89ActionPerformed(evt);
            }
        });
        jPanel2.add(c89);
        c89.setBounds(270, 260, 30, 30);

        c90.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c90ActionPerformed(evt);
            }
        });
        jPanel2.add(c90);
        c90.setBounds(300, 260, 30, 30);

        c91.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c91ActionPerformed(evt);
            }
        });
        jPanel2.add(c91);
        c91.setBounds(30, 290, 30, 30);

        c92.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c92ActionPerformed(evt);
            }
        });
        jPanel2.add(c92);
        c92.setBounds(60, 290, 30, 30);

        c93.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c93ActionPerformed(evt);
            }
        });
        jPanel2.add(c93);
        c93.setBounds(90, 290, 30, 30);

        c94.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c94ActionPerformed(evt);
            }
        });
        jPanel2.add(c94);
        c94.setBounds(120, 290, 30, 30);

        c95.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c95ActionPerformed(evt);
            }
        });
        jPanel2.add(c95);
        c95.setBounds(150, 290, 30, 30);

        c96.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c96ActionPerformed(evt);
            }
        });
        jPanel2.add(c96);
        c96.setBounds(180, 290, 30, 30);

        c97.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c97ActionPerformed(evt);
            }
        });
        jPanel2.add(c97);
        c97.setBounds(210, 290, 30, 30);

        c98.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c98ActionPerformed(evt);
            }
        });
        jPanel2.add(c98);
        c98.setBounds(240, 290, 30, 30);

        c99.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c99ActionPerformed(evt);
            }
        });
        jPanel2.add(c99);
        c99.setBounds(270, 290, 30, 30);

        c100.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c100ActionPerformed(evt);
            }
        });
        jPanel2.add(c100);
        c100.setBounds(300, 290, 30, 30);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("1\n\n2\n\n3\n\n4\n\n5\n\n6\n\n7\n\n8\n\n9\n\n10");
        jTextArea2.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(0, 20, 30, 300);

        jLabel10.setText("  A         B        C       D         E        F        G        H       I        J");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(30, 0, 300, 14);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 0));
        jLabel1.setText("Tablero de la máquina");

        paneljugador.setBackground(new java.awt.Color(255, 102, 0));
        paneljugador.setLayout(null);

        c101.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c101ActionPerformed(evt);
            }
        });
        paneljugador.add(c101);
        c101.setBounds(30, 20, 30, 30);

        c102.setToolTipText("");
        c102.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c102ActionPerformed(evt);
            }
        });
        paneljugador.add(c102);
        c102.setBounds(60, 20, 30, 30);

        c103.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c103ActionPerformed(evt);
            }
        });
        paneljugador.add(c103);
        c103.setBounds(90, 20, 30, 30);

        c104.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c104ActionPerformed(evt);
            }
        });
        paneljugador.add(c104);
        c104.setBounds(120, 20, 30, 30);

        c105.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c105ActionPerformed(evt);
            }
        });
        paneljugador.add(c105);
        c105.setBounds(150, 20, 30, 30);

        c106.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c106ActionPerformed(evt);
            }
        });
        paneljugador.add(c106);
        c106.setBounds(180, 20, 30, 30);

        c107.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c107ActionPerformed(evt);
            }
        });
        paneljugador.add(c107);
        c107.setBounds(210, 20, 30, 30);

        c108.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c108ActionPerformed(evt);
            }
        });
        paneljugador.add(c108);
        c108.setBounds(240, 20, 30, 30);

        c109.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c109ActionPerformed(evt);
            }
        });
        paneljugador.add(c109);
        c109.setBounds(270, 20, 30, 30);

        c110.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c110ActionPerformed(evt);
            }
        });
        paneljugador.add(c110);
        c110.setBounds(300, 20, 30, 30);

        c111.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c111ActionPerformed(evt);
            }
        });
        paneljugador.add(c111);
        c111.setBounds(30, 50, 30, 30);

        c112.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c112ActionPerformed(evt);
            }
        });
        paneljugador.add(c112);
        c112.setBounds(60, 50, 30, 30);

        c113.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c113ActionPerformed(evt);
            }
        });
        paneljugador.add(c113);
        c113.setBounds(90, 50, 30, 30);

        c114.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c114ActionPerformed(evt);
            }
        });
        paneljugador.add(c114);
        c114.setBounds(120, 50, 30, 30);

        c115.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c115ActionPerformed(evt);
            }
        });
        paneljugador.add(c115);
        c115.setBounds(150, 50, 30, 30);

        c116.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c116ActionPerformed(evt);
            }
        });
        paneljugador.add(c116);
        c116.setBounds(180, 50, 30, 30);

        c117.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c117ActionPerformed(evt);
            }
        });
        paneljugador.add(c117);
        c117.setBounds(210, 50, 30, 30);

        c118.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c118ActionPerformed(evt);
            }
        });
        paneljugador.add(c118);
        c118.setBounds(240, 50, 30, 30);

        c119.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c119ActionPerformed(evt);
            }
        });
        paneljugador.add(c119);
        c119.setBounds(270, 50, 30, 30);

        c120.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c120ActionPerformed(evt);
            }
        });
        paneljugador.add(c120);
        c120.setBounds(300, 50, 30, 30);

        c121.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c121ActionPerformed(evt);
            }
        });
        paneljugador.add(c121);
        c121.setBounds(30, 80, 30, 30);

        c122.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c122ActionPerformed(evt);
            }
        });
        paneljugador.add(c122);
        c122.setBounds(60, 80, 30, 30);

        c123.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c123ActionPerformed(evt);
            }
        });
        paneljugador.add(c123);
        c123.setBounds(90, 80, 30, 30);

        c124.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c124ActionPerformed(evt);
            }
        });
        paneljugador.add(c124);
        c124.setBounds(120, 80, 30, 30);

        c125.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c125ActionPerformed(evt);
            }
        });
        paneljugador.add(c125);
        c125.setBounds(150, 80, 30, 30);

        c126.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c126ActionPerformed(evt);
            }
        });
        paneljugador.add(c126);
        c126.setBounds(180, 80, 30, 30);

        c127.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c127.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c127ActionPerformed(evt);
            }
        });
        paneljugador.add(c127);
        c127.setBounds(210, 80, 30, 30);

        c128.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c128ActionPerformed(evt);
            }
        });
        paneljugador.add(c128);
        c128.setBounds(240, 80, 30, 30);

        c129.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c129ActionPerformed(evt);
            }
        });
        paneljugador.add(c129);
        c129.setBounds(270, 80, 30, 30);

        c130.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c130ActionPerformed(evt);
            }
        });
        paneljugador.add(c130);
        c130.setBounds(300, 80, 30, 30);

        c131.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c131ActionPerformed(evt);
            }
        });
        paneljugador.add(c131);
        c131.setBounds(30, 110, 30, 30);

        c132.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c132ActionPerformed(evt);
            }
        });
        paneljugador.add(c132);
        c132.setBounds(60, 110, 30, 30);

        c133.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c133ActionPerformed(evt);
            }
        });
        paneljugador.add(c133);
        c133.setBounds(90, 110, 30, 30);

        c134.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c134ActionPerformed(evt);
            }
        });
        paneljugador.add(c134);
        c134.setBounds(120, 110, 30, 30);

        c135.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c135ActionPerformed(evt);
            }
        });
        paneljugador.add(c135);
        c135.setBounds(150, 110, 30, 30);

        c136.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c136ActionPerformed(evt);
            }
        });
        paneljugador.add(c136);
        c136.setBounds(180, 110, 30, 30);

        c137.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c137ActionPerformed(evt);
            }
        });
        paneljugador.add(c137);
        c137.setBounds(210, 110, 30, 30);

        c138.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c138ActionPerformed(evt);
            }
        });
        paneljugador.add(c138);
        c138.setBounds(240, 110, 30, 30);

        c139.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c139.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c139ActionPerformed(evt);
            }
        });
        paneljugador.add(c139);
        c139.setBounds(270, 110, 30, 30);

        c140.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c140.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c140ActionPerformed(evt);
            }
        });
        paneljugador.add(c140);
        c140.setBounds(300, 110, 30, 30);

        c141.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c141ActionPerformed(evt);
            }
        });
        paneljugador.add(c141);
        c141.setBounds(30, 140, 30, 30);

        c142.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c142ActionPerformed(evt);
            }
        });
        paneljugador.add(c142);
        c142.setBounds(60, 140, 30, 30);

        c143.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c143.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c143ActionPerformed(evt);
            }
        });
        paneljugador.add(c143);
        c143.setBounds(90, 140, 30, 30);

        c144.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c144.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c144ActionPerformed(evt);
            }
        });
        paneljugador.add(c144);
        c144.setBounds(120, 140, 30, 30);

        c145.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c145.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c145ActionPerformed(evt);
            }
        });
        paneljugador.add(c145);
        c145.setBounds(150, 140, 30, 30);

        c146.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c146.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c146ActionPerformed(evt);
            }
        });
        paneljugador.add(c146);
        c146.setBounds(180, 140, 30, 30);

        c147.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c147.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c147ActionPerformed(evt);
            }
        });
        paneljugador.add(c147);
        c147.setBounds(210, 140, 30, 30);

        c148.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c148.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c148ActionPerformed(evt);
            }
        });
        paneljugador.add(c148);
        c148.setBounds(240, 140, 30, 30);

        c149.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c149.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c149ActionPerformed(evt);
            }
        });
        paneljugador.add(c149);
        c149.setBounds(270, 140, 30, 30);

        c150.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c150ActionPerformed(evt);
            }
        });
        paneljugador.add(c150);
        c150.setBounds(300, 140, 30, 30);

        c151.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c151ActionPerformed(evt);
            }
        });
        paneljugador.add(c151);
        c151.setBounds(30, 170, 30, 30);

        c152.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c152.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c152ActionPerformed(evt);
            }
        });
        paneljugador.add(c152);
        c152.setBounds(60, 170, 30, 30);

        c153.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c153.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c153ActionPerformed(evt);
            }
        });
        paneljugador.add(c153);
        c153.setBounds(90, 170, 30, 30);

        c154.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c154.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c154ActionPerformed(evt);
            }
        });
        paneljugador.add(c154);
        c154.setBounds(120, 170, 30, 30);

        c155.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c155.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c155ActionPerformed(evt);
            }
        });
        paneljugador.add(c155);
        c155.setBounds(150, 170, 30, 30);

        c156.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c156.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c156ActionPerformed(evt);
            }
        });
        paneljugador.add(c156);
        c156.setBounds(180, 170, 30, 30);

        c157.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c157.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c157ActionPerformed(evt);
            }
        });
        paneljugador.add(c157);
        c157.setBounds(210, 170, 30, 30);

        c158.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c158.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c158ActionPerformed(evt);
            }
        });
        paneljugador.add(c158);
        c158.setBounds(240, 170, 30, 30);

        c159.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c159.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c159ActionPerformed(evt);
            }
        });
        paneljugador.add(c159);
        c159.setBounds(270, 170, 30, 30);

        c160.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c160.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c160ActionPerformed(evt);
            }
        });
        paneljugador.add(c160);
        c160.setBounds(300, 170, 30, 30);

        c161.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c161.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c161ActionPerformed(evt);
            }
        });
        paneljugador.add(c161);
        c161.setBounds(30, 200, 30, 30);

        c162.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c162.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c162ActionPerformed(evt);
            }
        });
        paneljugador.add(c162);
        c162.setBounds(60, 200, 30, 30);

        c163.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c163.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c163ActionPerformed(evt);
            }
        });
        paneljugador.add(c163);
        c163.setBounds(90, 200, 30, 30);

        c164.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c164.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c164ActionPerformed(evt);
            }
        });
        paneljugador.add(c164);
        c164.setBounds(120, 200, 30, 30);

        c165.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c165.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c165ActionPerformed(evt);
            }
        });
        paneljugador.add(c165);
        c165.setBounds(150, 200, 30, 30);

        c166.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c166.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c166ActionPerformed(evt);
            }
        });
        paneljugador.add(c166);
        c166.setBounds(180, 200, 30, 30);

        c167.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c167.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c167ActionPerformed(evt);
            }
        });
        paneljugador.add(c167);
        c167.setBounds(210, 200, 30, 30);

        c168.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c168.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c168ActionPerformed(evt);
            }
        });
        paneljugador.add(c168);
        c168.setBounds(240, 200, 30, 30);

        c169.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c169.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c169ActionPerformed(evt);
            }
        });
        paneljugador.add(c169);
        c169.setBounds(270, 200, 30, 30);

        c170.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c170.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c170ActionPerformed(evt);
            }
        });
        paneljugador.add(c170);
        c170.setBounds(300, 200, 30, 30);

        c171.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c171.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c171ActionPerformed(evt);
            }
        });
        paneljugador.add(c171);
        c171.setBounds(30, 230, 30, 30);

        c172.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c172.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c172ActionPerformed(evt);
            }
        });
        paneljugador.add(c172);
        c172.setBounds(60, 230, 30, 30);

        c173.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c173.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c173ActionPerformed(evt);
            }
        });
        paneljugador.add(c173);
        c173.setBounds(90, 230, 30, 30);

        c174.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c174.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c174ActionPerformed(evt);
            }
        });
        paneljugador.add(c174);
        c174.setBounds(120, 230, 30, 30);

        c175.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c175.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c175ActionPerformed(evt);
            }
        });
        paneljugador.add(c175);
        c175.setBounds(150, 230, 30, 30);

        c176.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c176.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c176ActionPerformed(evt);
            }
        });
        paneljugador.add(c176);
        c176.setBounds(180, 230, 30, 30);

        c177.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c177.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c177ActionPerformed(evt);
            }
        });
        paneljugador.add(c177);
        c177.setBounds(210, 230, 30, 30);

        c178.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c178.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c178ActionPerformed(evt);
            }
        });
        paneljugador.add(c178);
        c178.setBounds(240, 230, 30, 30);

        c179.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c179.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c179ActionPerformed(evt);
            }
        });
        paneljugador.add(c179);
        c179.setBounds(270, 230, 30, 30);

        c180.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c180ActionPerformed(evt);
            }
        });
        paneljugador.add(c180);
        c180.setBounds(300, 230, 30, 30);

        c181.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c181.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c181ActionPerformed(evt);
            }
        });
        paneljugador.add(c181);
        c181.setBounds(30, 260, 30, 30);

        c182.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c182ActionPerformed(evt);
            }
        });
        paneljugador.add(c182);
        c182.setBounds(60, 260, 30, 30);

        c183.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c183.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c183ActionPerformed(evt);
            }
        });
        paneljugador.add(c183);
        c183.setBounds(90, 260, 30, 30);

        c184.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c184.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c184ActionPerformed(evt);
            }
        });
        paneljugador.add(c184);
        c184.setBounds(120, 260, 30, 30);

        c185.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c185.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c185ActionPerformed(evt);
            }
        });
        paneljugador.add(c185);
        c185.setBounds(150, 260, 30, 30);

        c186.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c186.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c186ActionPerformed(evt);
            }
        });
        paneljugador.add(c186);
        c186.setBounds(180, 260, 30, 30);

        c187.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c187.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c187ActionPerformed(evt);
            }
        });
        paneljugador.add(c187);
        c187.setBounds(210, 260, 30, 30);

        c188.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c188.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c188ActionPerformed(evt);
            }
        });
        paneljugador.add(c188);
        c188.setBounds(240, 260, 30, 30);

        c189.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c189.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c189ActionPerformed(evt);
            }
        });
        paneljugador.add(c189);
        c189.setBounds(270, 260, 30, 30);

        c190.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c190.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c190ActionPerformed(evt);
            }
        });
        paneljugador.add(c190);
        c190.setBounds(300, 260, 30, 30);

        c191.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c191.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c191ActionPerformed(evt);
            }
        });
        paneljugador.add(c191);
        c191.setBounds(30, 290, 30, 30);

        c192.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c192.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c192ActionPerformed(evt);
            }
        });
        paneljugador.add(c192);
        c192.setBounds(60, 290, 30, 30);

        c193.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c193.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c193ActionPerformed(evt);
            }
        });
        paneljugador.add(c193);
        c193.setBounds(90, 290, 30, 30);

        c194.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c194.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c194ActionPerformed(evt);
            }
        });
        paneljugador.add(c194);
        c194.setBounds(120, 290, 30, 30);

        c195.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c195.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c195ActionPerformed(evt);
            }
        });
        paneljugador.add(c195);
        c195.setBounds(150, 290, 30, 30);

        c196.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c196.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c196ActionPerformed(evt);
            }
        });
        paneljugador.add(c196);
        c196.setBounds(180, 290, 30, 30);

        c197.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c197.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c197ActionPerformed(evt);
            }
        });
        paneljugador.add(c197);
        c197.setBounds(210, 290, 30, 30);

        c198.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c198.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c198ActionPerformed(evt);
            }
        });
        paneljugador.add(c198);
        c198.setBounds(240, 290, 30, 30);

        c199.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c199.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c199ActionPerformed(evt);
            }
        });
        paneljugador.add(c199);
        c199.setBounds(270, 290, 30, 30);

        c200.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c200ActionPerformed(evt);
            }
        });
        paneljugador.add(c200);
        c200.setBounds(300, 290, 30, 30);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("1\n\n2\n\n3\n\n4\n\n5\n\n6\n\n7\n\n8\n\n9\n\n10");
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        paneljugador.add(jScrollPane1);
        jScrollPane1.setBounds(0, 20, 30, 300);

        jLabel9.setText("  A         B        C       D         E        F        G        H       I        J");
        paneljugador.add(jLabel9);
        jLabel9.setBounds(30, 0, 300, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 0));
        jLabel2.setText("Tablero del jugador");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CANTIDAD");

        jLabel4.setText("DE");

        cant1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cant2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cant3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cant4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setText("1");

        jLabel6.setText("2");

        jLabel7.setText("3");

        jLabel8.setText("4");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CANTIDAD");

        jLabel12.setText("DE");

        jLabel13.setText("1");

        jLabel14.setText("2");

        jLabel15.setText("3");

        jLabel16.setText("4");

        avisos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel18.setText("Avisos");

        jLabel17.setText("JUGADAS DE LA MAQ.");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Columna");

        columnam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        columnam.setForeground(new java.awt.Color(204, 0, 0));
        columnam.setEnabled(false);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Fila");

        filam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        filam.setForeground(new java.awt.Color(204, 0, 0));
        filam.setEnabled(false);

        buttonGroup1.add(agua);
        agua.setText("Agua");
        agua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aguaActionPerformed(evt);
            }
        });

        buttonGroup1.add(tocado);
        tocado.setText("Tocado");
        tocado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tocadoActionPerformed(evt);
            }
        });

        buttonGroup1.add(hundido);
        hundido.setText("Hundido");
        hundido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hundidoActionPerformed(evt);
            }
        });

        tetoca.setText("Te toca");
        tetoca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tetocaActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cant4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cant2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cant1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cant3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paneljugador, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(27, 27, 27))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cantjuga1)
                                    .addComponent(cantjuga2)
                                    .addComponent(cantjuga3)
                                    .addComponent(cantjuga4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel20))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(filam)
                                            .addComponent(columnam))))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tetoca)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tocado)
                                .addComponent(agua)
                                .addComponent(hundido)))
                        .addGap(18, 18, 18))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel18)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(avisos, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(219, 219, 219))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(avisos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paneljugador, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cantjuga1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(40, 40, 40))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cantjuga2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(34, 34, 34))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cantjuga3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantjuga4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(columnam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(filam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(agua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tocado))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cant1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addComponent(cant2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                            .addComponent(cant3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                            .addComponent(cant4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hundido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tetoca)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c101ActionPerformed
        Color cbt=c101.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c101.setBackground(Color.WHITE);
        }else c101.setBackground(Color.red);
        
    }//GEN-LAST:event_c101ActionPerformed

    private void c102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c102ActionPerformed
        Color cbt=c102.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c102.setBackground(Color.WHITE);
        }else c102.setBackground(Color.red);
    }//GEN-LAST:event_c102ActionPerformed

    private void c103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c103ActionPerformed
        Color cbt=c103.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c103.setBackground(Color.WHITE);
        }else c103.setBackground(Color.red);
    }//GEN-LAST:event_c103ActionPerformed

    private void c110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c110ActionPerformed
        Color cbt=c110.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c110.setBackground(Color.WHITE);
        }else c110.setBackground(Color.red);
    }//GEN-LAST:event_c110ActionPerformed

    private void c117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c117ActionPerformed
        Color cbt=c117.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c117.setBackground(Color.WHITE);
        }else c117.setBackground(Color.red);
    }//GEN-LAST:event_c117ActionPerformed

    private void c104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c104ActionPerformed
        Color cbt=c104.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c104.setBackground(Color.WHITE);
        }else c104.setBackground(Color.red);
    }//GEN-LAST:event_c104ActionPerformed

    private void c105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c105ActionPerformed
        Color cbt=c105.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c105.setBackground(Color.WHITE);
        }else c105.setBackground(Color.red);
    }//GEN-LAST:event_c105ActionPerformed

    private void c106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c106ActionPerformed
        Color cbt=c106.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c106.setBackground(Color.WHITE);
        }else c106.setBackground(Color.red);
    }//GEN-LAST:event_c106ActionPerformed

    private void c107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c107ActionPerformed
        Color cbt=c107.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c107.setBackground(Color.WHITE);
        }else c107.setBackground(Color.red);
    }//GEN-LAST:event_c107ActionPerformed

    private void c108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c108ActionPerformed
        Color cbt=c108.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c108.setBackground(Color.WHITE);
        }else c108.setBackground(Color.red);
    }//GEN-LAST:event_c108ActionPerformed

    private void c109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c109ActionPerformed
       Color cbt=c109.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c109.setBackground(Color.WHITE);
        }else c109.setBackground(Color.red);
    }//GEN-LAST:event_c109ActionPerformed

    private void c112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c112ActionPerformed
        Color cbt=c112.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c112.setBackground(Color.WHITE);
        }else c112.setBackground(Color.red);
    }//GEN-LAST:event_c112ActionPerformed

    private void c111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c111ActionPerformed
        Color cbt=c111.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c111.setBackground(Color.WHITE);
        }else c111.setBackground(Color.red);
    }//GEN-LAST:event_c111ActionPerformed

    private void c113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c113ActionPerformed
        Color cbt=c113.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c113.setBackground(Color.WHITE);
        }else c113.setBackground(Color.red);
    }//GEN-LAST:event_c113ActionPerformed

    private void c114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c114ActionPerformed
        Color cbt=c114.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c114.setBackground(Color.WHITE);
        }else c114.setBackground(Color.red);
    }//GEN-LAST:event_c114ActionPerformed

    private void c115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c115ActionPerformed
        Color cbt=c115.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c115.setBackground(Color.WHITE);
        }else c115.setBackground(Color.red);
    }//GEN-LAST:event_c115ActionPerformed

    private void c116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c116ActionPerformed
        Color cbt=c116.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c116.setBackground(Color.WHITE);
        }else c116.setBackground(Color.red);
    }//GEN-LAST:event_c116ActionPerformed

    private void c118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c118ActionPerformed
        Color cbt=c118.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c118.setBackground(Color.WHITE);
        }else c118.setBackground(Color.red);
    }//GEN-LAST:event_c118ActionPerformed

    private void c119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c119ActionPerformed
        Color cbt=c119.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c119.setBackground(Color.WHITE);
        }else c119.setBackground(Color.red);
    }//GEN-LAST:event_c119ActionPerformed

    private void c120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c120ActionPerformed
       Color cbt=c120.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c120.setBackground(Color.WHITE);
        }else c120.setBackground(Color.red);
    }//GEN-LAST:event_c120ActionPerformed

    private void c121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c121ActionPerformed
        Color cbt=c121.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c121.setBackground(Color.WHITE);
        }else c121.setBackground(Color.red);
    }//GEN-LAST:event_c121ActionPerformed

    private void c122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c122ActionPerformed
        Color cbt=c122.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c122.setBackground(Color.WHITE);
        }else c122.setBackground(Color.red);
    }//GEN-LAST:event_c122ActionPerformed

    private void c123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c123ActionPerformed
        Color cbt=c123.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c123.setBackground(Color.WHITE);
        }else c123.setBackground(Color.red);
    }//GEN-LAST:event_c123ActionPerformed

    private void c124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c124ActionPerformed
        Color cbt=c124.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c124.setBackground(Color.WHITE);
        }else c124.setBackground(Color.red);
    }//GEN-LAST:event_c124ActionPerformed

    private void c125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c125ActionPerformed
        Color cbt=c125.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c125.setBackground(Color.WHITE);
        }else c125.setBackground(Color.red);
    }//GEN-LAST:event_c125ActionPerformed

    private void c126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c126ActionPerformed
        Color cbt=c126.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c126.setBackground(Color.WHITE);
        }else c126.setBackground(Color.red);
    }//GEN-LAST:event_c126ActionPerformed

    private void c127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c127ActionPerformed
        Color cbt=c127.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c127.setBackground(Color.WHITE);
        }else c127.setBackground(Color.red);
    }//GEN-LAST:event_c127ActionPerformed

    private void c128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c128ActionPerformed
        Color cbt=c128.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c128.setBackground(Color.WHITE);
        }else c128.setBackground(Color.red);
    }//GEN-LAST:event_c128ActionPerformed

    private void c129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c129ActionPerformed
        Color cbt=c129.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c129.setBackground(Color.WHITE);
        }else c129.setBackground(Color.red);
    }//GEN-LAST:event_c129ActionPerformed

    private void c130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c130ActionPerformed
        Color cbt=c130.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c130.setBackground(Color.WHITE);
        }else c130.setBackground(Color.red);
    }//GEN-LAST:event_c130ActionPerformed

    private void jButton111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton111ActionPerformed
                
        crea_barcos();// llamo a funcion que determina los barcos
        for(int x=0;x<jPanel2.getComponentCount();x++){
            if(jPanel2.getComponent(x) instanceof JButton){
                JButton jb = (JButton) jPanel2.getComponent(x);
                jb.setEnabled(true);
                jb.setBackground(Color.GRAY);
            }
        }
    }//GEN-LAST:event_jButton111ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        
        int th=0;
        th=tipocasi(0, 0);
        if(th==0){
            c1.setBackground(Color.BLUE);
        }else if(th==1){
            c1.setBackground(Color.red);
        }else{ 
            c1.setBackground(Color.red);
        }
    }//GEN-LAST:event_c1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        int th=0;
        th=tipocasi(1, 0);
        if(th==0){
            c2.setBackground(Color.BLUE);
        }else if(th==1){
            c2.setBackground(Color.red);
        }else c2.setBackground(Color.red);
        
    }//GEN-LAST:event_c2ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        int th=0;
        th=tipocasi(2, 0);
        if(th==0){
            c3.setBackground(Color.BLUE);
        }else if(th==1){
            c3.setBackground(Color.red);
        }else c3.setBackground(Color.red);
       
    }//GEN-LAST:event_c3ActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
       int th=0;
        th=tipocasi(3, 0);
        if(th==0){
            c4.setBackground(Color.BLUE);
        }else if(th==1){
            c4.setBackground(Color.red);
        }else c4.setBackground(Color.red);
        
    }//GEN-LAST:event_c4ActionPerformed

    private void c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c5ActionPerformed
      int th=0;
        th=tipocasi(4, 0);
        if(th==0){
            c5.setBackground(Color.BLUE);
        }else if(th==1){
            c5.setBackground(Color.red);
        }else c5.setBackground(Color.red);
        
    }//GEN-LAST:event_c5ActionPerformed

    private void c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c6ActionPerformed
        int th=0;
        th=tipocasi(5, 0);
        if(th==0){
            c6.setBackground(Color.BLUE);
        }else if(th==1){
            c6.setBackground(Color.red);
        }else c6.setBackground(Color.red);
        
    }//GEN-LAST:event_c6ActionPerformed

    private void c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c7ActionPerformed
       int th=0;
        th=tipocasi(6, 0);
        if(th==0){
            c7.setBackground(Color.BLUE);
        }else if(th==1){
            c7.setBackground(Color.red);
        }else c7.setBackground(Color.red);
        
    }//GEN-LAST:event_c7ActionPerformed

    private void c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c8ActionPerformed
        int th=0;
        th=tipocasi(7, 0);
        if(th==0){
            c8.setBackground(Color.BLUE);
        }else if(th==1){
            c8.setBackground(Color.red);
        }else c8.setBackground(Color.red);
        
    }//GEN-LAST:event_c8ActionPerformed

    private void c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c9ActionPerformed
       int th=0;
        th=tipocasi(8, 0);
        if(th==0){
            c9.setBackground(Color.BLUE);
        }else if(th==1){
            c9.setBackground(Color.red);
        }else c9.setBackground(Color.red);
        
    }//GEN-LAST:event_c9ActionPerformed

    private void c10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c10ActionPerformed
        int th=0;
        th=tipocasi(9, 0);
        if(th==0){
            c10.setBackground(Color.BLUE);
        }else if(th==1){
            c10.setBackground(Color.red);
        }else c10.setBackground(Color.red);
        
    }//GEN-LAST:event_c10ActionPerformed

    private void c11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c11ActionPerformed
        int th=0;
        th=tipocasi(0, 1);
        if(th==0){
            c11.setBackground(Color.BLUE);
        }else if(th==1){
            c11.setBackground(Color.red);
        }else c11.setBackground(Color.red);
        
    }//GEN-LAST:event_c11ActionPerformed

    private void c12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c12ActionPerformed
        int th=0;
        th=tipocasi(1, 1);
        if(th==0){
            c12.setBackground(Color.BLUE);
        }else if(th==1){
            c12.setBackground(Color.red);
        }else c12.setBackground(Color.red);
        
    }//GEN-LAST:event_c12ActionPerformed

    private void c13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c13ActionPerformed
        int th=0;
        th=tipocasi(2, 1);
        if(th==0){
            c13.setBackground(Color.BLUE);
        }else if(th==1){
            c13.setBackground(Color.red);
        }else c13.setBackground(Color.red);
        
    }//GEN-LAST:event_c13ActionPerformed

    private void c14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c14ActionPerformed
        int th=0;
        th=tipocasi(3, 1);
        if(th==0){
            c14.setBackground(Color.BLUE);
        }else if(th==1){
            c14.setBackground(Color.red);
        }else c14.setBackground(Color.red);
        
    }//GEN-LAST:event_c14ActionPerformed

    private void c15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c15ActionPerformed
        int th=0;
        th=tipocasi(4, 1);
        if(th==0){
            c15.setBackground(Color.BLUE);
        }else if(th==1){
            c15.setBackground(Color.red);
        }else c15.setBackground(Color.red);
        
    }//GEN-LAST:event_c15ActionPerformed

    private void c16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c16ActionPerformed
        int th=0;
        th=tipocasi(5, 1);
        if(th==0){
            c16.setBackground(Color.BLUE);
        }else if(th==1){
            c16.setBackground(Color.red);
        }else c16.setBackground(Color.red);
        
    }//GEN-LAST:event_c16ActionPerformed

    private void c17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c17ActionPerformed
        int th=0;
        th=tipocasi(6, 1);
        if(th==0){
            c17.setBackground(Color.BLUE);
        }else if(th==1){
            c17.setBackground(Color.red);
        }else c17.setBackground(Color.red);
        
    }//GEN-LAST:event_c17ActionPerformed

    private void c18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c18ActionPerformed
        int th=0;
        th=tipocasi(7, 1);
        if(th==0){
            c18.setBackground(Color.BLUE);
        }else if(th==1){
            c18.setBackground(Color.red);
        }else c18.setBackground(Color.red);
        
    }//GEN-LAST:event_c18ActionPerformed

    private void c19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c19ActionPerformed
        int th=0;
        th=tipocasi(8, 1);
        if(th==0){
            c19.setBackground(Color.BLUE);
        }else if(th==1){
            c19.setBackground(Color.red);
        }else c19.setBackground(Color.red);
        
    }//GEN-LAST:event_c19ActionPerformed

    private void c20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c20ActionPerformed
        
        int th=0;
        th=tipocasi(9, 1);
        if(th==0){
            c20.setBackground(Color.BLUE);
        }else if(th==1){
            c20.setBackground(Color.red);
        }else c20.setBackground(Color.red);
       
    }//GEN-LAST:event_c20ActionPerformed

    private void c21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c21ActionPerformed
        int th=0;
        th=tipocasi(0, 2);
        if(th==0){
            c21.setBackground(Color.BLUE);
        }else if(th==1){
            c21.setBackground(Color.red);
        }else c21.setBackground(Color.red);
    }//GEN-LAST:event_c21ActionPerformed

    private void c22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c22ActionPerformed
        int th=0;        
        th=tipocasi(1, 2);        
        if(th==0){            
            c22.setBackground(Color.BLUE);        }else if(th==1){            c22.setBackground(Color.red);        }else c22.setBackground(Color.red);
    }//GEN-LAST:event_c22ActionPerformed

    private void c23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c23ActionPerformed
        int th=0;        th=tipocasi(2,2);        if(th==0){            c23.setBackground(Color.BLUE);        
        }else if(th==1){            c23.setBackground(Color.red);        }else c23.setBackground(Color.red);
    }//GEN-LAST:event_c23ActionPerformed

    private void c24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c24ActionPerformed
        int th=0;        th=tipocasi(3, 2);        if(th==0){            c24.setBackground(Color.BLUE);        }else if(th==1){            
            c24.setBackground(Color.red);        }else c24.setBackground(Color.red);
    }//GEN-LAST:event_c24ActionPerformed

    private void c25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c25ActionPerformed
        int th=0;        th=tipocasi(4,2);        
        if(th==0){            c25.setBackground(Color.BLUE);        }else if(th==1){            
            c25.setBackground(Color.red);        }else c25.setBackground(Color.red);
    }//GEN-LAST:event_c25ActionPerformed

    private void c26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c26ActionPerformed
        int th=0;        th=tipocasi(5,2);        if(th==0){            
            c26.setBackground(Color.BLUE);        }else if(th==1){            
                c26.setBackground(Color.red);        }else c26.setBackground(Color.red);
    }//GEN-LAST:event_c26ActionPerformed

    private void c27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c27ActionPerformed
        int th=0;        th=tipocasi(6, 2);        if(th==0){            c27.setBackground(Color.BLUE);        
        }else if(th==1){            c27.setBackground(Color.red);        }else c27.setBackground(Color.red);
    }//GEN-LAST:event_c27ActionPerformed

    private void c28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c28ActionPerformed
        int th=0;        th=tipocasi(7, 2);        if(th==0){            c28.setBackground(Color.BLUE);        
        }else if(th==1){            c28.setBackground(Color.red);        }else c28.setBackground(Color.red);
    }//GEN-LAST:event_c28ActionPerformed

    private void c29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c29ActionPerformed
        int th=0;        th=tipocasi(8, 2);        if(th==0){            c29.setBackground(Color.BLUE);        
        }else if(th==1){            c29.setBackground(Color.red);        }else c29.setBackground(Color.red);
    }//GEN-LAST:event_c29ActionPerformed

    private void c30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c30ActionPerformed
        int th=0;        th=tipocasi(9, 2);        if(th==0){            c30.setBackground(Color.BLUE);       
        }else if(th==1){            c30.setBackground(Color.red);        }else c30.setBackground(Color.red);
    }//GEN-LAST:event_c30ActionPerformed

    private void c31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c31ActionPerformed
        int th=0;        th=tipocasi(0, 3);        if(th==0){            c31.setBackground(Color.BLUE);        
        }else if(th==1){            c31.setBackground(Color.red);        }else c31.setBackground(Color.red);
    }//GEN-LAST:event_c31ActionPerformed

    private void c32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c32ActionPerformed
        int th=0;        th=tipocasi(1,3);        if(th==0){            c32.setBackground(Color.BLUE);        
        }else if(th==1){            c32.setBackground(Color.red);        }else c32.setBackground(Color.red);
    }//GEN-LAST:event_c32ActionPerformed

    private void c33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c33ActionPerformed
        int th=0;        th=tipocasi(2,3);        if(th==0){            c33.setBackground(Color.BLUE);        
        }else if(th==1){            c33.setBackground(Color.red);        }else c33.setBackground(Color.red);
    }//GEN-LAST:event_c33ActionPerformed

    private void c34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c34ActionPerformed
        int th=0;        th=tipocasi(3,3);        if(th==0){            c34.setBackground(Color.BLUE);       
        }else if(th==1){            c34.setBackground(Color.red);        }else c34.setBackground(Color.red);
    }//GEN-LAST:event_c34ActionPerformed

    private void c35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c35ActionPerformed
        int th=0;        th=tipocasi(4,3);        if(th==0){            c35.setBackground(Color.BLUE);       
        }else if(th==1){            c35.setBackground(Color.red);        }else c35.setBackground(Color.red);
    }//GEN-LAST:event_c35ActionPerformed

    private void c36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c36ActionPerformed
        int th=0;        th=tipocasi(5,3);        if(th==0){            c36.setBackground(Color.BLUE);       
        }else if(th==1){            c36.setBackground(Color.red);        }else c36.setBackground(Color.red);
    }//GEN-LAST:event_c36ActionPerformed

    private void c37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c37ActionPerformed
        int th=0;        
        th=tipocasi(6,3);        
        if(th==0){            
            c37.setBackground(Color.BLUE);       
        }else if(th==1){            
            c37.setBackground(Color.red);        
        }else c37.setBackground(Color.red);
    }//GEN-LAST:event_c37ActionPerformed

    private void c38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c38ActionPerformed
        int th=0;        th=tipocasi(7,3);        if(th==0){            c38.setBackground(Color.BLUE);        
        }else if(th==1){            c38.setBackground(Color.red);        }else c38.setBackground(Color.red);
    }//GEN-LAST:event_c38ActionPerformed

    private void c39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c39ActionPerformed
        int th=0;        th=tipocasi(8,3);        if(th==0){            c39.setBackground(Color.BLUE);        
        }else if(th==1){            c39.setBackground(Color.red);        }else c39.setBackground(Color.red);
    }//GEN-LAST:event_c39ActionPerformed

    private void c40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c40ActionPerformed
        int th=0;        th=tipocasi(9,3);        if(th==0){            c40.setBackground(Color.BLUE);        
        }else if(th==1){            c40.setBackground(Color.red);        }else c40.setBackground(Color.red);
    }//GEN-LAST:event_c40ActionPerformed

    private void c41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c41ActionPerformed
        int th=0;        th=tipocasi(0, 4);        if(th==0){            c41.setBackground(Color.BLUE);        
        }else if(th==1){            c41.setBackground(Color.red);        }else c41.setBackground(Color.red);
    }//GEN-LAST:event_c41ActionPerformed

    private void c42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c42ActionPerformed
        int th=0;        th=tipocasi(1,4);        if(th==0){            c42.setBackground(Color.BLUE);        
        }else if(th==1){            c42.setBackground(Color.red);        }else c42.setBackground(Color.red);
    }//GEN-LAST:event_c42ActionPerformed

    private void c43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c43ActionPerformed
        int th=0;        th=tipocasi(2,4);        if(th==0){            c43.setBackground(Color.BLUE);       
        }else if(th==1){            c43.setBackground(Color.red);        }else c43.setBackground(Color.red);
    }//GEN-LAST:event_c43ActionPerformed

    private void c44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c44ActionPerformed
        int th=0;        th=tipocasi(3,4);        if(th==0){            c44.setBackground(Color.BLUE);        
        }else if(th==1){            c44.setBackground(Color.red);        }else c44.setBackground(Color.red);
    }//GEN-LAST:event_c44ActionPerformed

    private void c45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c45ActionPerformed
        int th=0;        th=tipocasi(4,4);        if(th==0){            c45.setBackground(Color.BLUE);       
        }else if(th==1){            c45.setBackground(Color.red);        }else c45.setBackground(Color.red);
    }//GEN-LAST:event_c45ActionPerformed

    private void c46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c46ActionPerformed
        int th=0;        th=tipocasi(5,4);        if(th==0){            c46.setBackground(Color.BLUE);      
        }else if(th==1){            c46.setBackground(Color.red);        }else c46.setBackground(Color.red);
    }//GEN-LAST:event_c46ActionPerformed

    private void c47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c47ActionPerformed
        int th=0;        th=tipocasi(6,4);        if(th==0){            c47.setBackground(Color.BLUE);        
        }else if(th==1){            c47.setBackground(Color.red);        }else c47.setBackground(Color.red);
    }//GEN-LAST:event_c47ActionPerformed

    private void c48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c48ActionPerformed
        int th=0;        th=tipocasi(7,4);        if(th==0){            c48.setBackground(Color.BLUE);       
        }else if(th==1){            c48.setBackground(Color.red);        }else c48.setBackground(Color.red);
    }//GEN-LAST:event_c48ActionPerformed

    private void c49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c49ActionPerformed
        int th=0;        th=tipocasi(8,4);        if(th==0){            c49.setBackground(Color.BLUE);       
        }else if(th==1){            c49.setBackground(Color.red);        }else c49.setBackground(Color.red);
    }//GEN-LAST:event_c49ActionPerformed

    private void c50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c50ActionPerformed
        int th=0;        th=tipocasi(9,4);        if(th==0){            c50.setBackground(Color.BLUE);       
        }else if(th==1){            c50.setBackground(Color.red);        }else c50.setBackground(Color.red);
    }//GEN-LAST:event_c50ActionPerformed

    private void c51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c51ActionPerformed
        int th=0;        th=tipocasi(0,5);        if(th==0){            c51.setBackground(Color.BLUE);       
        }else if(th==1){            c51.setBackground(Color.red);        }else c51.setBackground(Color.red);
    }//GEN-LAST:event_c51ActionPerformed

    private void c52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c52ActionPerformed
        int th=0;        th=tipocasi(1, 5);        if(th==0){            c52.setBackground(Color.BLUE);     
        }else if(th==1){            c52.setBackground(Color.red);        }else c52.setBackground(Color.red);
    }//GEN-LAST:event_c52ActionPerformed

    private void c53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c53ActionPerformed
        int th=0;        th=tipocasi(2,5);        if(th==0){            c53.setBackground(Color.BLUE);        }else if(th==1){            c53.setBackground(Color.red);        }else c53.setBackground(Color.red);
    }//GEN-LAST:event_c53ActionPerformed

    private void c54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c54ActionPerformed
        int th=0;        th=tipocasi(3,5);        if(th==0){            c54.setBackground(Color.BLUE);        }else if(th==1){            c54.setBackground(Color.red);        }else c54.setBackground(Color.red);
    }//GEN-LAST:event_c54ActionPerformed

    private void c55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c55ActionPerformed
        int th=0;        th=tipocasi(4,5);        if(th==0){            c55.setBackground(Color.BLUE);        }else if(th==1){            c55.setBackground(Color.red);        }else c55.setBackground(Color.red);
    }//GEN-LAST:event_c55ActionPerformed

    private void c56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c56ActionPerformed
        int th=0;        th=tipocasi(5,5);        if(th==0){            c56.setBackground(Color.BLUE);        }else if(th==1){            c56.setBackground(Color.red);        }else c56.setBackground(Color.red);
    }//GEN-LAST:event_c56ActionPerformed

    private void c57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c57ActionPerformed
        int th=0;        th=tipocasi(6,5);        if(th==0){            c57.setBackground(Color.BLUE);        }else if(th==1){            c57.setBackground(Color.red);        }else c57.setBackground(Color.red);
    }//GEN-LAST:event_c57ActionPerformed

    private void c58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c58ActionPerformed
        int th=0;        th=tipocasi(7,5);        if(th==0){            c58.setBackground(Color.BLUE);        }else if(th==1){            c58.setBackground(Color.red);        }else c58.setBackground(Color.red);
    }//GEN-LAST:event_c58ActionPerformed

    private void c59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c59ActionPerformed
        int th=0;        th=tipocasi(8,5);        if(th==0){            c59.setBackground(Color.BLUE);        }else if(th==1){            c59.setBackground(Color.red);        }else c59.setBackground(Color.red);
    }//GEN-LAST:event_c59ActionPerformed

    private void c60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c60ActionPerformed
        int th=0;        th=tipocasi(9,5);        if(th==0){            c60.setBackground(Color.BLUE);        }else if(th==1){            c60.setBackground(Color.red);        }else c60.setBackground(Color.red);
    }//GEN-LAST:event_c60ActionPerformed

    private void c61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c61ActionPerformed
        int th=0;        th=tipocasi(0,6);        if(th==0){            c61.setBackground(Color.BLUE);        }else if(th==1){            c61.setBackground(Color.red);        }else c61.setBackground(Color.red);
    }//GEN-LAST:event_c61ActionPerformed

    private void c62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c62ActionPerformed
        int th=0;        th=tipocasi(1,6);        if(th==0){            c62.setBackground(Color.BLUE);        }else if(th==1){            c62.setBackground(Color.red);        }else c62.setBackground(Color.red);
    }//GEN-LAST:event_c62ActionPerformed

    private void c63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c63ActionPerformed
        int th=0;        th=tipocasi(2,6);        if(th==0){            c63.setBackground(Color.BLUE);        }else if(th==1){            c63.setBackground(Color.red);        }else c63.setBackground(Color.red);
    }//GEN-LAST:event_c63ActionPerformed

    private void c64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c64ActionPerformed
        int th=0;        th=tipocasi(3,6);        if(th==0){            c64.setBackground(Color.BLUE);        }else if(th==1){            c64.setBackground(Color.red);        }else c64.setBackground(Color.red);
    }//GEN-LAST:event_c64ActionPerformed

    private void c65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c65ActionPerformed
        int th=0;        th=tipocasi(4,6);        if(th==0){            c65.setBackground(Color.BLUE);        }else if(th==1){            c65.setBackground(Color.red);        }else c65.setBackground(Color.red);
    }//GEN-LAST:event_c65ActionPerformed

    private void c66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c66ActionPerformed
        int th=0;        th=tipocasi(5,6);        if(th==0){            c66.setBackground(Color.BLUE);        }else if(th==1){            c66.setBackground(Color.red);        }else c66.setBackground(Color.red);
    }//GEN-LAST:event_c66ActionPerformed

    private void c67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c67ActionPerformed
        int th=0;        th=tipocasi(6,6);        if(th==0){            c67.setBackground(Color.BLUE);        }else if(th==1){            c67.setBackground(Color.red);        }else c67.setBackground(Color.red);
    }//GEN-LAST:event_c67ActionPerformed

    private void c68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c68ActionPerformed
        int th=0;        th=tipocasi(7,6);        if(th==0){            c68.setBackground(Color.BLUE);        }else if(th==1){            c68.setBackground(Color.red);        }else c68.setBackground(Color.red);
    }//GEN-LAST:event_c68ActionPerformed

    private void c69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c69ActionPerformed
        int th=0;        th=tipocasi(8,6);        if(th==0){            c69.setBackground(Color.BLUE);        }else if(th==1){            c69.setBackground(Color.red);        }else c69.setBackground(Color.red);
    }//GEN-LAST:event_c69ActionPerformed

    private void c70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c70ActionPerformed
        int th=0;        th=tipocasi(9,6);        if(th==0){            c70.setBackground(Color.BLUE);        }else if(th==1){            c70.setBackground(Color.red);        }else c70.setBackground(Color.red);
    }//GEN-LAST:event_c70ActionPerformed

    private void c71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c71ActionPerformed
        int th=0;        th=tipocasi(0,7);        if(th==0){            c71.setBackground(Color.BLUE);        }else if(th==1){            c71.setBackground(Color.red);        }else c71.setBackground(Color.red);
    }//GEN-LAST:event_c71ActionPerformed

    private void c72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c72ActionPerformed
        int th=0;        th=tipocasi(1,7);        if(th==0){            c72.setBackground(Color.BLUE);        }else if(th==1){            c72.setBackground(Color.red);        }else c72.setBackground(Color.red);
    }//GEN-LAST:event_c72ActionPerformed

    private void c73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c73ActionPerformed
        int th=0;        th=tipocasi(2,7);        if(th==0){            c73.setBackground(Color.BLUE);        }else if(th==1){            c73.setBackground(Color.red);        }else c73.setBackground(Color.red);
    }//GEN-LAST:event_c73ActionPerformed

    private void c74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c74ActionPerformed
        int th=0;        th=tipocasi(3,7);        if(th==0){            c74.setBackground(Color.BLUE);        }else if(th==1){            c74.setBackground(Color.red);        }else c74.setBackground(Color.red);
    }//GEN-LAST:event_c74ActionPerformed

    private void c75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c75ActionPerformed
        int th=0;        th=tipocasi(4,7);        if(th==0){            c75.setBackground(Color.BLUE);        }else if(th==1){            c75.setBackground(Color.red);        }else c75.setBackground(Color.red);
    }//GEN-LAST:event_c75ActionPerformed

    private void c76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c76ActionPerformed
        int th=0;        th=tipocasi(5,7);        if(th==0){            c76.setBackground(Color.BLUE);        }else if(th==1){            c76.setBackground(Color.red);        }else c76.setBackground(Color.red);
    }//GEN-LAST:event_c76ActionPerformed

    private void c77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c77ActionPerformed
        int th=0;        th=tipocasi(6,7);        if(th==0){            c77.setBackground(Color.BLUE);        }else if(th==1){            c77.setBackground(Color.red);        }else c77.setBackground(Color.red);
    }//GEN-LAST:event_c77ActionPerformed

    private void c78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c78ActionPerformed
        int th=0;        th=tipocasi(7,7);        if(th==0){            c78.setBackground(Color.BLUE);        }else if(th==1){            c78.setBackground(Color.red);        }else c78.setBackground(Color.red);
    }//GEN-LAST:event_c78ActionPerformed

    private void c79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c79ActionPerformed
        int th=0;        th=tipocasi(8,7);        if(th==0){            c79.setBackground(Color.BLUE);        }else if(th==1){            c79.setBackground(Color.red);        }else c79.setBackground(Color.red);
    }//GEN-LAST:event_c79ActionPerformed

    private void c80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c80ActionPerformed
        int th=0;        th=tipocasi(9,7);        if(th==0){            c80.setBackground(Color.BLUE);        }else if(th==1){            c80.setBackground(Color.red);        }else c80.setBackground(Color.red);
    }//GEN-LAST:event_c80ActionPerformed

    private void c81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c81ActionPerformed
        int th=0;        th=tipocasi(0,8);        if(th==0){            c81.setBackground(Color.BLUE);        }else if(th==1){            c81.setBackground(Color.red);        }else c81.setBackground(Color.red);
    }//GEN-LAST:event_c81ActionPerformed

    private void c82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c82ActionPerformed
        int th=0;        th=tipocasi(1,8);        if(th==0){            c82.setBackground(Color.BLUE);        }else if(th==1){            c82.setBackground(Color.red);        }else c82.setBackground(Color.red);
    }//GEN-LAST:event_c82ActionPerformed

    private void c83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c83ActionPerformed
        int th=0;        th=tipocasi(2,8);        if(th==0){            c83.setBackground(Color.BLUE);        }else if(th==1){            c83.setBackground(Color.red);        }else c83.setBackground(Color.red);
    }//GEN-LAST:event_c83ActionPerformed

    private void c84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c84ActionPerformed
        int th=0;        th=tipocasi(3,8);        if(th==0){            c84.setBackground(Color.BLUE);        }else if(th==1){            c84.setBackground(Color.red);        }else c84.setBackground(Color.red);
    }//GEN-LAST:event_c84ActionPerformed

    private void c85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c85ActionPerformed
        int th=0;        th=tipocasi(4,8);        if(th==0){            c85.setBackground(Color.BLUE);        }else if(th==1){            c85.setBackground(Color.red);        }else c85.setBackground(Color.red);
    }//GEN-LAST:event_c85ActionPerformed

    private void c86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c86ActionPerformed
        int th=0;        th=tipocasi(5,8);        if(th==0){            c86.setBackground(Color.BLUE);        }else if(th==1){            c86.setBackground(Color.red);        }else c86.setBackground(Color.red);
    }//GEN-LAST:event_c86ActionPerformed

    private void c87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c87ActionPerformed
        int th=0;        th=tipocasi(6,8);        if(th==0){            c87.setBackground(Color.BLUE);        }else if(th==1){            c87.setBackground(Color.red);        }else c87.setBackground(Color.red);
    }//GEN-LAST:event_c87ActionPerformed

    private void c88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c88ActionPerformed
        int th=0;        th=tipocasi(7,8);        if(th==0){            c88.setBackground(Color.BLUE);        }else if(th==1){            c88.setBackground(Color.red);        }else c88.setBackground(Color.red);
    }//GEN-LAST:event_c88ActionPerformed

    private void c89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c89ActionPerformed
        int th=0;        th=tipocasi(9,8);        if(th==0){            c89.setBackground(Color.BLUE);        }else if(th==1){            c89.setBackground(Color.red);        }else c89.setBackground(Color.red);
    }//GEN-LAST:event_c89ActionPerformed

    private void c90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c90ActionPerformed
        int th=0;        th=tipocasi(9, 9);        if(th==0){            c90.setBackground(Color.BLUE);        }else if(th==1){            c90.setBackground(Color.red);        }else c90.setBackground(Color.red);
    }//GEN-LAST:event_c90ActionPerformed

    private void c91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c91ActionPerformed
        int th=0;        th=tipocasi(0,9);        if(th==0){            c91.setBackground(Color.BLUE);        }else if(th==1){            c91.setBackground(Color.red);        }else c91.setBackground(Color.red);
    }//GEN-LAST:event_c91ActionPerformed

    private void c92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c92ActionPerformed
        int th=0;        th=tipocasi(1,9);        if(th==0){            c92.setBackground(Color.BLUE);        }else if(th==1){            c92.setBackground(Color.red);        }else c92.setBackground(Color.red);
    }//GEN-LAST:event_c92ActionPerformed

    private void c93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c93ActionPerformed
        int th=0;        th=tipocasi(2,9);        if(th==0){            c93.setBackground(Color.BLUE);        }else if(th==1){            c93.setBackground(Color.red);        }else c93.setBackground(Color.red);
    }//GEN-LAST:event_c93ActionPerformed

    private void c94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c94ActionPerformed
        int th=0;        th=tipocasi(3,9);        if(th==0){            c94.setBackground(Color.BLUE);        }else if(th==1){            c94.setBackground(Color.red);        }else c94.setBackground(Color.red);
    }//GEN-LAST:event_c94ActionPerformed

    private void c95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c95ActionPerformed
        int th=0;        th=tipocasi(4,9);        if(th==0){            c95.setBackground(Color.BLUE);        }else if(th==1){            c95.setBackground(Color.red);        }else c95.setBackground(Color.red);
    }//GEN-LAST:event_c95ActionPerformed

    private void c96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c96ActionPerformed
        int th=0;        th=tipocasi(5,9);        if(th==0){            c96.setBackground(Color.BLUE);        }else if(th==1){            c96.setBackground(Color.red);        }else c96.setBackground(Color.red);
    }//GEN-LAST:event_c96ActionPerformed

    private void c97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c97ActionPerformed
        int th=0;        th=tipocasi(6,9);        if(th==0){            c97.setBackground(Color.BLUE);        }else if(th==1){            c97.setBackground(Color.red);        }else c97.setBackground(Color.red);
    }//GEN-LAST:event_c97ActionPerformed

    private void c98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c98ActionPerformed
        int th=0;        th=tipocasi(7,9);        if(th==0){            c98.setBackground(Color.BLUE);        }else if(th==1){            c98.setBackground(Color.red);        }else c98.setBackground(Color.red);
    }//GEN-LAST:event_c98ActionPerformed

    private void c99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c99ActionPerformed
        int th=0;        th=tipocasi(8,9);        if(th==0){            c99.setBackground(Color.BLUE);        }else if(th==1){            c99.setBackground(Color.red);        }else c99.setBackground(Color.red);
    }//GEN-LAST:event_c99ActionPerformed

    private void c100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c100ActionPerformed
        int th=0;        th=tipocasi(9,9);        if(th==0){            c100.setBackground(Color.BLUE);        }else if(th==1){            c100.setBackground(Color.red);        }else c100.setBackground(Color.red);
    }//GEN-LAST:event_c100ActionPerformed

    private void aguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aguaActionPerformed
        midisparo=1;
    }//GEN-LAST:event_aguaActionPerformed

    private void tocadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tocadoActionPerformed
        midisparo=2;
    }//GEN-LAST:event_tocadoActionPerformed

    private void hundidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hundidoActionPerformed
        midisparo=3;
    }//GEN-LAST:event_hundidoActionPerformed

    private void tetocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tetocaActionPerformed
        habilito();
    }//GEN-LAST:event_tetocaActionPerformed

    private void c131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c131ActionPerformed
         Color cbt=c131.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c131.setBackground(Color.WHITE);
        }else c131.setBackground(Color.red);
    }//GEN-LAST:event_c131ActionPerformed

    private void c132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c132ActionPerformed
         Color cbt=c132.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c132.setBackground(Color.WHITE);
        }else c132.setBackground(Color.red);
    }//GEN-LAST:event_c132ActionPerformed

    private void c133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c133ActionPerformed
         Color cbt=c133.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c133.setBackground(Color.WHITE);
        }else c133.setBackground(Color.red);
    }//GEN-LAST:event_c133ActionPerformed

    private void c134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c134ActionPerformed
         Color cbt=c134.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c134.setBackground(Color.WHITE);
        }else c134.setBackground(Color.red);
    }//GEN-LAST:event_c134ActionPerformed

    private void c135ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c135ActionPerformed
         Color cbt=c135.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c135.setBackground(Color.WHITE);
        }else c135.setBackground(Color.red);
    }//GEN-LAST:event_c135ActionPerformed

    private void c136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c136ActionPerformed
         Color cbt=c136.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c136.setBackground(Color.WHITE);
        }else c136.setBackground(Color.red);
    }//GEN-LAST:event_c136ActionPerformed

    private void c137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c137ActionPerformed
         Color cbt=c137.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c137.setBackground(Color.WHITE);
        }else c137.setBackground(Color.red);
    }//GEN-LAST:event_c137ActionPerformed

    private void c138ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c138ActionPerformed
         Color cbt=c138.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c138.setBackground(Color.WHITE);
        }else c138.setBackground(Color.red);
    }//GEN-LAST:event_c138ActionPerformed

    private void c139ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c139ActionPerformed
         Color cbt=c139.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c139.setBackground(Color.WHITE);
        }else c139.setBackground(Color.red);
    }//GEN-LAST:event_c139ActionPerformed

    private void c140ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c140ActionPerformed
         Color cbt=c140.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c140.setBackground(Color.WHITE);
        }else c140.setBackground(Color.red);
    }//GEN-LAST:event_c140ActionPerformed

    private void c141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c141ActionPerformed
         Color cbt=c141.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c141.setBackground(Color.WHITE);
        }else c141.setBackground(Color.red);
    }//GEN-LAST:event_c141ActionPerformed

    private void c142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c142ActionPerformed
         Color cbt=c142.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c142.setBackground(Color.WHITE);
        }else c142.setBackground(Color.red);
    }//GEN-LAST:event_c142ActionPerformed

    private void c143ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c143ActionPerformed
         Color cbt=c143.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c143.setBackground(Color.WHITE);
        }else c143.setBackground(Color.red);
    }//GEN-LAST:event_c143ActionPerformed

    private void c144ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c144ActionPerformed
         Color cbt=c144.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c144.setBackground(Color.WHITE);
        }else c144.setBackground(Color.red);
    }//GEN-LAST:event_c144ActionPerformed

    private void c145ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c145ActionPerformed
         Color cbt=c145.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c145.setBackground(Color.WHITE);
        }else c145.setBackground(Color.red);
    }//GEN-LAST:event_c145ActionPerformed

    private void c146ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c146ActionPerformed
         Color cbt=c146.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c146.setBackground(Color.WHITE);
        }else c146.setBackground(Color.red);
    }//GEN-LAST:event_c146ActionPerformed

    private void c147ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c147ActionPerformed
         Color cbt=c147.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c147.setBackground(Color.WHITE);
        }else c147.setBackground(Color.red);
    }//GEN-LAST:event_c147ActionPerformed

    private void c148ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c148ActionPerformed
         Color cbt=c148.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c148.setBackground(Color.WHITE);
        }else c148.setBackground(Color.red);
    }//GEN-LAST:event_c148ActionPerformed

    private void c149ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c149ActionPerformed
         Color cbt=c149.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c149.setBackground(Color.WHITE);
        }else c149.setBackground(Color.red);
    }//GEN-LAST:event_c149ActionPerformed

    private void c150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c150ActionPerformed
         Color cbt=c150.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c150.setBackground(Color.WHITE);
        }else c150.setBackground(Color.red);
    }//GEN-LAST:event_c150ActionPerformed

    private void c151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c151ActionPerformed
        Color cbt=c151.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c151.setBackground(Color.WHITE);
        }else c151.setBackground(Color.red);
    }//GEN-LAST:event_c151ActionPerformed

    private void c152ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c152ActionPerformed
         Color cbt=c152.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c152.setBackground(Color.WHITE);
        }else c152.setBackground(Color.red);
    }//GEN-LAST:event_c152ActionPerformed

    private void c153ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c153ActionPerformed
         Color cbt=c153.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c153.setBackground(Color.WHITE);
        }else c153.setBackground(Color.red);
    }//GEN-LAST:event_c153ActionPerformed

    private void c154ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c154ActionPerformed
         Color cbt=c154.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c154.setBackground(Color.WHITE);
        }else c154.setBackground(Color.red);
    }//GEN-LAST:event_c154ActionPerformed

    private void c155ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c155ActionPerformed
         Color cbt=c155.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c155.setBackground(Color.WHITE);
        }else c155.setBackground(Color.red);
    }//GEN-LAST:event_c155ActionPerformed

    private void c156ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c156ActionPerformed
         Color cbt=c156.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c156.setBackground(Color.WHITE);
        }else c156.setBackground(Color.red);
    }//GEN-LAST:event_c156ActionPerformed

    private void c157ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c157ActionPerformed
         Color cbt=c157.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c157.setBackground(Color.WHITE);
        }else c157.setBackground(Color.red);
    }//GEN-LAST:event_c157ActionPerformed

    private void c158ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c158ActionPerformed
         Color cbt=c158.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c158.setBackground(Color.WHITE);
        }else c158.setBackground(Color.red);
    }//GEN-LAST:event_c158ActionPerformed

    private void c159ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c159ActionPerformed
         Color cbt=c159.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c159.setBackground(Color.WHITE);
        }else c159.setBackground(Color.red);
    }//GEN-LAST:event_c159ActionPerformed

    private void c160ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c160ActionPerformed
         Color cbt=c160.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c160.setBackground(Color.WHITE);
        }else c160.setBackground(Color.red);
    }//GEN-LAST:event_c160ActionPerformed

    private void c161ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c161ActionPerformed
        Color cbt=c161.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c161.setBackground(Color.WHITE);
        }else c161.setBackground(Color.red);
    }//GEN-LAST:event_c161ActionPerformed

    private void c162ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c162ActionPerformed
         Color cbt=c162.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c162.setBackground(Color.WHITE);
        }else c162.setBackground(Color.red);
    }//GEN-LAST:event_c162ActionPerformed

    private void c163ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c163ActionPerformed
         Color cbt=c163.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c163.setBackground(Color.WHITE);
        }else c163.setBackground(Color.red);
    }//GEN-LAST:event_c163ActionPerformed

    private void c164ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c164ActionPerformed
         Color cbt=c164.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c164.setBackground(Color.WHITE);
        }else c164.setBackground(Color.red);
    }//GEN-LAST:event_c164ActionPerformed

    private void c165ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c165ActionPerformed
         Color cbt=c165.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c165.setBackground(Color.WHITE);
        }else c165.setBackground(Color.red);
    }//GEN-LAST:event_c165ActionPerformed

    private void c166ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c166ActionPerformed
         Color cbt=c166.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c166.setBackground(Color.WHITE);
        }else c166.setBackground(Color.red);
    }//GEN-LAST:event_c166ActionPerformed

    private void c167ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c167ActionPerformed
         Color cbt=c167.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c167.setBackground(Color.WHITE);
        }else c167.setBackground(Color.red);
    }//GEN-LAST:event_c167ActionPerformed

    private void c168ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c168ActionPerformed
        Color cbt=c168.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c168.setBackground(Color.WHITE);
        }else c168.setBackground(Color.red);
    }//GEN-LAST:event_c168ActionPerformed

    private void c169ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c169ActionPerformed
        Color cbt=c169.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c169.setBackground(Color.WHITE);
        }else c169.setBackground(Color.red);
    }//GEN-LAST:event_c169ActionPerformed

    private void c170ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c170ActionPerformed
         Color cbt=c170.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c170.setBackground(Color.WHITE);
        }else c170.setBackground(Color.red);
    }//GEN-LAST:event_c170ActionPerformed

    private void c171ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c171ActionPerformed
        Color cbt=c171.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c171.setBackground(Color.WHITE);
        }else c171.setBackground(Color.red);
    }//GEN-LAST:event_c171ActionPerformed

    private void c172ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c172ActionPerformed
        Color cbt=c172.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c172.setBackground(Color.WHITE);
        }else c172.setBackground(Color.red);
    }//GEN-LAST:event_c172ActionPerformed

    private void c173ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c173ActionPerformed
        Color cbt=c173.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c173.setBackground(Color.WHITE);
        }else c173.setBackground(Color.red);
    }//GEN-LAST:event_c173ActionPerformed

    private void c174ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c174ActionPerformed
        Color cbt=c174.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c174.setBackground(Color.WHITE);
        }else c174.setBackground(Color.red);
    }//GEN-LAST:event_c174ActionPerformed

    private void c175ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c175ActionPerformed
        Color cbt=c175.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c175.setBackground(Color.WHITE);
        }else c175.setBackground(Color.red);
    }//GEN-LAST:event_c175ActionPerformed

    private void c176ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c176ActionPerformed
        Color cbt=c176.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c176.setBackground(Color.WHITE);
        }else c176.setBackground(Color.red);
    }//GEN-LAST:event_c176ActionPerformed

    private void c177ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c177ActionPerformed
        Color cbt=c177.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c177.setBackground(Color.WHITE);
        }else c177.setBackground(Color.red);
    }//GEN-LAST:event_c177ActionPerformed

    private void c178ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c178ActionPerformed
        Color cbt=c178.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c178.setBackground(Color.WHITE);
        }else c178.setBackground(Color.red);
    }//GEN-LAST:event_c178ActionPerformed

    private void c179ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c179ActionPerformed
        Color cbt=c179.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c179.setBackground(Color.WHITE);
        }else c179.setBackground(Color.red);
    }//GEN-LAST:event_c179ActionPerformed

    private void c180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c180ActionPerformed
        Color cbt=c180.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c180.setBackground(Color.WHITE);
        }else c180.setBackground(Color.red);
    }//GEN-LAST:event_c180ActionPerformed

    private void c181ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c181ActionPerformed
        Color cbt=c181.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c181.setBackground(Color.WHITE);
        }else c181.setBackground(Color.red);
    }//GEN-LAST:event_c181ActionPerformed

    private void c182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c182ActionPerformed
        Color cbt=c182.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c182.setBackground(Color.WHITE);
        }else c182.setBackground(Color.red);
    }//GEN-LAST:event_c182ActionPerformed

    private void c183ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c183ActionPerformed
        Color cbt=c183.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c183.setBackground(Color.WHITE);
        }else c183.setBackground(Color.red);
    }//GEN-LAST:event_c183ActionPerformed

    private void c184ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c184ActionPerformed
        Color cbt=c184.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c184.setBackground(Color.WHITE);
        }else c184.setBackground(Color.red);
    }//GEN-LAST:event_c184ActionPerformed

    private void c185ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c185ActionPerformed
        Color cbt=c185.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c185.setBackground(Color.WHITE);
        }else c185.setBackground(Color.red);
    }//GEN-LAST:event_c185ActionPerformed

    private void c186ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c186ActionPerformed
        Color cbt=c186.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c186.setBackground(Color.WHITE);
        }else c186.setBackground(Color.red);
    }//GEN-LAST:event_c186ActionPerformed

    private void c187ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c187ActionPerformed
        Color cbt=c187.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c187.setBackground(Color.WHITE);
        }else c187.setBackground(Color.red);
    }//GEN-LAST:event_c187ActionPerformed

    private void c188ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c188ActionPerformed
        Color cbt=c188.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c188.setBackground(Color.WHITE);
        }else c188.setBackground(Color.red);
    }//GEN-LAST:event_c188ActionPerformed

    private void c189ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c189ActionPerformed
        Color cbt=c189.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c189.setBackground(Color.WHITE);
        }else c189.setBackground(Color.red);
    }//GEN-LAST:event_c189ActionPerformed

    private void c190ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c190ActionPerformed
        Color cbt=c190.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c190.setBackground(Color.WHITE);
        }else c190.setBackground(Color.red);
    }//GEN-LAST:event_c190ActionPerformed

    private void c191ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c191ActionPerformed
        Color cbt=c191.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c191.setBackground(Color.WHITE);
        }else c191.setBackground(Color.red);
    }//GEN-LAST:event_c191ActionPerformed

    private void c192ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c192ActionPerformed
        Color cbt=c192.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c192.setBackground(Color.WHITE);
        }else c192.setBackground(Color.red);
    }//GEN-LAST:event_c192ActionPerformed

    private void c193ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c193ActionPerformed
        Color cbt=c193.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c193.setBackground(Color.WHITE);
        }else c193.setBackground(Color.red);
    }//GEN-LAST:event_c193ActionPerformed

    private void c194ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c194ActionPerformed
        Color cbt=c194.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c194.setBackground(Color.WHITE);
        }else c194.setBackground(Color.red);
    }//GEN-LAST:event_c194ActionPerformed

    private void c195ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c195ActionPerformed
        Color cbt=c195.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c195.setBackground(Color.WHITE);
        }else c195.setBackground(Color.red);
    }//GEN-LAST:event_c195ActionPerformed

    private void c196ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c196ActionPerformed
       Color cbt=c196.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c196.setBackground(Color.WHITE);
        }else c196.setBackground(Color.red);
    }//GEN-LAST:event_c196ActionPerformed

    private void c197ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c197ActionPerformed
        Color cbt=c197.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c197.setBackground(Color.WHITE);
        }else c197.setBackground(Color.red);
    }//GEN-LAST:event_c197ActionPerformed

    private void c198ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c198ActionPerformed
        Color cbt=c198.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c198.setBackground(Color.WHITE);
        }else c198.setBackground(Color.red);
    }//GEN-LAST:event_c198ActionPerformed

    private void c199ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c199ActionPerformed
        Color cbt=c199.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c199.setBackground(Color.WHITE);
        }else c199.setBackground(Color.red);
    }//GEN-LAST:event_c199ActionPerformed

    private void c200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c200ActionPerformed
        Color cbt=c200.getBackground();
        Color cbd=Color.red;
        if(cbt==cbd){
            c200.setBackground(Color.WHITE);
        }else c200.setBackground(Color.red);
    }//GEN-LAST:event_c200ActionPerformed

 
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
            java.util.logging.Logger.getLogger(BatallaNaval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BatallaNaval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BatallaNaval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BatallaNaval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BatallaNaval().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton agua;
    private javax.swing.JLabel avisos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton c1;
    private javax.swing.JButton c10;
    private javax.swing.JButton c100;
    private javax.swing.JButton c101;
    private javax.swing.JButton c102;
    private javax.swing.JButton c103;
    private javax.swing.JButton c104;
    private javax.swing.JButton c105;
    private javax.swing.JButton c106;
    private javax.swing.JButton c107;
    private javax.swing.JButton c108;
    private javax.swing.JButton c109;
    private javax.swing.JButton c11;
    private javax.swing.JButton c110;
    private javax.swing.JButton c111;
    private javax.swing.JButton c112;
    private javax.swing.JButton c113;
    private javax.swing.JButton c114;
    private javax.swing.JButton c115;
    private javax.swing.JButton c116;
    private javax.swing.JButton c117;
    private javax.swing.JButton c118;
    private javax.swing.JButton c119;
    private javax.swing.JButton c12;
    private javax.swing.JButton c120;
    private javax.swing.JButton c121;
    private javax.swing.JButton c122;
    private javax.swing.JButton c123;
    private javax.swing.JButton c124;
    private javax.swing.JButton c125;
    private javax.swing.JButton c126;
    private javax.swing.JButton c127;
    private javax.swing.JButton c128;
    private javax.swing.JButton c129;
    private javax.swing.JButton c13;
    private javax.swing.JButton c130;
    private javax.swing.JButton c131;
    private javax.swing.JButton c132;
    private javax.swing.JButton c133;
    private javax.swing.JButton c134;
    private javax.swing.JButton c135;
    private javax.swing.JButton c136;
    private javax.swing.JButton c137;
    private javax.swing.JButton c138;
    private javax.swing.JButton c139;
    private javax.swing.JButton c14;
    private javax.swing.JButton c140;
    private javax.swing.JButton c141;
    private javax.swing.JButton c142;
    private javax.swing.JButton c143;
    private javax.swing.JButton c144;
    private javax.swing.JButton c145;
    private javax.swing.JButton c146;
    private javax.swing.JButton c147;
    private javax.swing.JButton c148;
    private javax.swing.JButton c149;
    private javax.swing.JButton c15;
    private javax.swing.JButton c150;
    private javax.swing.JButton c151;
    private javax.swing.JButton c152;
    private javax.swing.JButton c153;
    private javax.swing.JButton c154;
    private javax.swing.JButton c155;
    private javax.swing.JButton c156;
    private javax.swing.JButton c157;
    private javax.swing.JButton c158;
    private javax.swing.JButton c159;
    private javax.swing.JButton c16;
    private javax.swing.JButton c160;
    private javax.swing.JButton c161;
    private javax.swing.JButton c162;
    private javax.swing.JButton c163;
    private javax.swing.JButton c164;
    private javax.swing.JButton c165;
    private javax.swing.JButton c166;
    private javax.swing.JButton c167;
    private javax.swing.JButton c168;
    private javax.swing.JButton c169;
    private javax.swing.JButton c17;
    private javax.swing.JButton c170;
    private javax.swing.JButton c171;
    private javax.swing.JButton c172;
    private javax.swing.JButton c173;
    private javax.swing.JButton c174;
    private javax.swing.JButton c175;
    private javax.swing.JButton c176;
    private javax.swing.JButton c177;
    private javax.swing.JButton c178;
    private javax.swing.JButton c179;
    private javax.swing.JButton c18;
    private javax.swing.JButton c180;
    private javax.swing.JButton c181;
    private javax.swing.JButton c182;
    private javax.swing.JButton c183;
    private javax.swing.JButton c184;
    private javax.swing.JButton c185;
    private javax.swing.JButton c186;
    private javax.swing.JButton c187;
    private javax.swing.JButton c188;
    private javax.swing.JButton c189;
    private javax.swing.JButton c19;
    private javax.swing.JButton c190;
    private javax.swing.JButton c191;
    private javax.swing.JButton c192;
    private javax.swing.JButton c193;
    private javax.swing.JButton c194;
    private javax.swing.JButton c195;
    private javax.swing.JButton c196;
    private javax.swing.JButton c197;
    private javax.swing.JButton c198;
    private javax.swing.JButton c199;
    private javax.swing.JButton c2;
    private javax.swing.JButton c20;
    private javax.swing.JButton c200;
    private javax.swing.JButton c21;
    private javax.swing.JButton c22;
    private javax.swing.JButton c23;
    private javax.swing.JButton c24;
    private javax.swing.JButton c25;
    private javax.swing.JButton c26;
    private javax.swing.JButton c27;
    private javax.swing.JButton c28;
    private javax.swing.JButton c29;
    private javax.swing.JButton c3;
    private javax.swing.JButton c30;
    private javax.swing.JButton c31;
    private javax.swing.JButton c32;
    private javax.swing.JButton c33;
    private javax.swing.JButton c34;
    private javax.swing.JButton c35;
    private javax.swing.JButton c36;
    private javax.swing.JButton c37;
    private javax.swing.JButton c38;
    private javax.swing.JButton c39;
    private javax.swing.JButton c4;
    private javax.swing.JButton c40;
    private javax.swing.JButton c41;
    private javax.swing.JButton c42;
    private javax.swing.JButton c43;
    private javax.swing.JButton c44;
    private javax.swing.JButton c45;
    private javax.swing.JButton c46;
    private javax.swing.JButton c47;
    private javax.swing.JButton c48;
    private javax.swing.JButton c49;
    private javax.swing.JButton c5;
    private javax.swing.JButton c50;
    private javax.swing.JButton c51;
    private javax.swing.JButton c52;
    private javax.swing.JButton c53;
    private javax.swing.JButton c54;
    private javax.swing.JButton c55;
    private javax.swing.JButton c56;
    private javax.swing.JButton c57;
    private javax.swing.JButton c58;
    private javax.swing.JButton c59;
    private javax.swing.JButton c6;
    private javax.swing.JButton c60;
    private javax.swing.JButton c61;
    private javax.swing.JButton c62;
    private javax.swing.JButton c63;
    private javax.swing.JButton c64;
    private javax.swing.JButton c65;
    private javax.swing.JButton c66;
    private javax.swing.JButton c67;
    private javax.swing.JButton c68;
    private javax.swing.JButton c69;
    private javax.swing.JButton c7;
    private javax.swing.JButton c70;
    private javax.swing.JButton c71;
    private javax.swing.JButton c72;
    private javax.swing.JButton c73;
    private javax.swing.JButton c74;
    private javax.swing.JButton c75;
    private javax.swing.JButton c76;
    private javax.swing.JButton c77;
    private javax.swing.JButton c78;
    private javax.swing.JButton c79;
    private javax.swing.JButton c8;
    private javax.swing.JButton c80;
    private javax.swing.JButton c81;
    private javax.swing.JButton c82;
    private javax.swing.JButton c83;
    private javax.swing.JButton c84;
    private javax.swing.JButton c85;
    private javax.swing.JButton c86;
    private javax.swing.JButton c87;
    private javax.swing.JButton c88;
    private javax.swing.JButton c89;
    private javax.swing.JButton c9;
    private javax.swing.JButton c90;
    private javax.swing.JButton c91;
    private javax.swing.JButton c92;
    private javax.swing.JButton c93;
    private javax.swing.JButton c94;
    private javax.swing.JButton c95;
    private javax.swing.JButton c96;
    private javax.swing.JButton c97;
    private javax.swing.JButton c98;
    private javax.swing.JButton c99;
    private javax.swing.JLabel cant1;
    private javax.swing.JLabel cant2;
    private javax.swing.JLabel cant3;
    private javax.swing.JLabel cant4;
    private javax.swing.JTextField cantjuga1;
    private javax.swing.JTextField cantjuga2;
    private javax.swing.JTextField cantjuga3;
    private javax.swing.JTextField cantjuga4;
    private javax.swing.JTextField columnam;
    private javax.swing.JTextField filam;
    private javax.swing.JRadioButton hundido;
    private javax.swing.JButton jButton111;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel paneljugador;
    private javax.swing.JButton tetoca;
    private javax.swing.JRadioButton tocado;
    // End of variables declaration//GEN-END:variables

    private void crea_barcos() {
        // recorro matriz inicializando la matriz indicando que cada nodo no esta usado
        matriz=new NodoCelda[10][10];
        for(int i=0;i<10;i++){
            for(int x=0;x<10;x++){
                NodoCelda nodo=new NodoCelda();
                matriz[x][i]=nodo;
                matriz[x][i].setusa(false);
                matriz[x][i].settoc(false);
                matriz[x][i].sethund(false);
                matriz[x][i].setcanti(0);
                matriz[x][i].setxanti(-1);
                matriz[x][i].setyanti(-1);
                matriz[x][i].setxposte(-1);
                matriz[x][i].setyposte(-1);
                matriz[x][i].setxx(x);
                matriz[x][i].setyy(i);
                        
            }
        }
        // creo los de 1
        creolosdeuno();
        creolosdedos();
        creolosdetres();
        creolosdecuatro();
        columnam.setText("-");
        filam.setText("-");
        for(int i=0;i<10;i++){
            for(int x=0;x<10;x++){
                NodoCelda nodo=new NodoCelda();
                matrizj[x][i]=nodo;
                matrizj[x][i].setusa(false);
                matrizj[x][i].setcanti(0);
                matrizj[x][i].sethund(false);
                matrizj[x][i].settoc(false);
                matrizj[x][i].setxanti(-1);
                matrizj[x][i].setyanti(-1);
                matrizj[x][i].setxx(x);
                matrizj[x][i].setyy(i);
                matrizj[x][i].setxposte(-1);
                matrizj[x][i].setyposte(-1);
            }
        }
    }

    private void creolosdeuno() {
        int n=(int)Math.floor(Math.random()*4);//
        n=n+2; // tengo un nro aleatorio entre 2 y 7, o sea, la cantidad minima y maxima de barcos de 1.
        
        int i=0;
        do{
            int x=(int)Math.floor(Math.random()*9);//
            
            int y=(int)Math.floor(Math.random()*9);//
            
            boolean hago=true;
            // controlo que en la misma celda o en cualquiera de alrededor ya no haya puesto algo.
                               
                                                    
             if(!matriz[x][y].getusado()){
                 NodoCelda nodo=new NodoCelda();
                 nodo.setcanti(1);
                 nodo.setxanti(0);
                 nodo.setyanti(0);
                 nodo.setxx(x);
                 nodo.setyy(y);
                 nodo.setxposte(-1);
                 nodo.setyposte(-1);
                 nodo.settoc(false);
                 nodo.sethund(false);
                 nodo.setusa(true);
                 matriz[x][y]=nodo;
                
                 cant1.setText(Integer.toString(n));
             }  
            i++;
            
        }while(i<n);
    }

    @SuppressWarnings("empty-statement")
    private void creolosdedos() {
        int n=(int)Math.floor(Math.random()*3);//
        n=n+1; // tengo un nro aleatorio entre 1 y 4, o sea, la cantidad minima y maxima de barcos de 2.
        
        cant2.setText(Integer.toString(n));
        int i=0;
        NodoCelda nodo=new NodoCelda();
        NodoCelda nodo2=new NodoCelda();
        nodo2=null;
        int x=0;
        int y=0;
        do{// estructura repetitiva para crear tantos barcos de 2 como determine el math random, o sea, un maximo de 4
            nodo2=null;
            while(nodo2==null){
                x=(int)Math.floor(Math.random()*9);//
                
                y=(int)Math.floor(Math.random()*9);//
                
                nodo=matriz[x][y];
                if(!nodo.getusado()){// si no está usado el nodo.
                
                    nodo2=new NodoCelda();
                    nodo2=traigonodolibre(x,y);// traigo otro nodo de un lugar libre alrededor
                    if(nodo2!=null){// si trajo nodo guardo todo y luego termina la repetitiva. 
                        // guardo en la matriz el nodo2
                        matriz[nodo2.getx()][nodo2.gety()]=nodo2;
                        //actualizo el nodo actual con los datos del siguiente y anterior
                        nodo=new NodoCelda();
                        nodo.setcanti(2);
                        nodo.setxposte(nodo2.getx());
                        nodo.setyposte(nodo2.gety());
                        nodo.setxanti(0);
                        nodo.setyanti(0);
                        nodo.setusa(true);
                        nodo.settoc(false);
                        nodo.sethund(false);
                        matriz[x][y]=nodo;
                        
                    }
                }   
            }
            
            i++;
        }while(i<n);
        
    }

    private void creolosdetres() {
        BtNavalLog.logica.BatNavLogica bnl =new BtNavalLog.logica.BatNavLogica();
        bnl.creolosdetres(matriz);
        matriz=bnl.matriz1;
        cant3.setText(Integer.toString(bnl.n));
    }

    private void creolosdecuatro() {
        
    }


    private NodoCelda traigonodolibre(int x, int y) {
        NodoCelda nodo=new NodoCelda();
        
        try{
            // si diagonal arriba a la derecha esta libre lo uso
            if(!matriz[x+1][y-1].getusado()){
                
                nodo.setcanti(2);
                nodo.sethund(false);
                nodo.setusa(true);
                nodo.settoc(false);
                nodo.setxanti(x);
                nodo.setyanti(y);
                nodo.setxposte(-1);
                nodo.setyposte(-1);
                nodo.setxx(x+1);
                nodo.setyy(y-1);
                return nodo;
            }
        }catch(Exception ex){
            // el catch es por si estoy en primera fila o ultima columna, da error, asi que busco otro
        }
        try{
            // si diagonal abajo a la izquierda esta libre lo uso
            if(!matriz[x-1][y+1].getusado()){
                
                nodo.setcanti(2);
                nodo.sethund(false);
                nodo.setusa(true);
                nodo.settoc(false);
                nodo.setxanti(x);
                nodo.setyanti(y);
                nodo.setxposte(-1);
                nodo.setyposte(-1);
                nodo.setxx(x-1);
                nodo.setyy(y+1);
                return nodo;
            }
        }catch(Exception ex){
            // el catch es por si estoy en primera fila o ultima columna, da error, asi que busco otro
        }
        // diagonal arriba a la izquierda
        try{
            // si diagonal abajo a la izquierda esta libre lo uso
            if(!matriz[x-1][y-1].getusado()){
                
                nodo.setcanti(2);
                nodo.sethund(false);
                nodo.setusa(true);
                nodo.settoc(false);
                nodo.setxanti(x);
                nodo.setyanti(y);
                nodo.setxposte(-1);
                nodo.setyposte(-1);
                nodo.setxx(x-1);
                nodo.setyy(y-1);
                return nodo;
            }
        }catch(Exception ex){
            // el catch es por si estoy en primera fila o ultima columna, da error, asi que busco otro
        }
        // diagonal abajo a la derecha
        try{
            
            if(!matriz[x+1][y+1].getusado()){
                
                nodo.setcanti(2);
                nodo.sethund(false);
                nodo.setusa(true);
                nodo.settoc(false);
                nodo.setxanti(x);
                nodo.setyanti(y);
                nodo.setxposte(-1);
                nodo.setyposte(-1);
                nodo.setxx(x+1);
                nodo.setyy(y+1);
                return nodo;
            }
        }catch(Exception ex){
            // el catch es por si estoy en primera fila o ultima columna, da error, asi que busco otro
        }
        //  no hay ninguna diagonal, busco arriba misma columna
        
        try{
            // si diagonal abajo a la izquierda esta libre lo uso
            if(!matriz[x][y-1].getusado()){
                
                nodo.setcanti(2);
                nodo.sethund(false);
                nodo.setusa(true);
                nodo.settoc(false);
                nodo.setxanti(x);
                nodo.setyanti(y);
                nodo.setxposte(-1);
                nodo.setyposte(-1);
                nodo.setxx(x);
                nodo.setyy(y-1);
                return nodo;
            }
        }catch(Exception ex){
            // el catch es por si estoy en primera fila o ultima columna, da error, asi que busco otro
        }
        // misma columna abajo
        try{
            // si diagonal abajo a la izquierda esta libre lo uso
            if(!matriz[x][y+1].getusado()){
                
                nodo.setcanti(2);
                nodo.sethund(false);
                nodo.setusa(true);
                nodo.settoc(false);
                nodo.setxanti(x);
                nodo.setyanti(y);
                nodo.setxposte(-1);
                nodo.setyposte(-1);
                nodo.setxx(x);
                nodo.setyy(y+1);
                return nodo;
            }
        }catch(Exception ex){
            // el catch es por si estoy en primera fila o ultima columna, da error, asi que busco otro
        }
        // misma fila a la izquierda
        try{
            // si diagonal abajo a la izquierda esta libre lo uso
            if(!matriz[x-1][y].getusado()){
                
                nodo.setcanti(2);
                nodo.sethund(false);
                nodo.setusa(true);
                nodo.settoc(false);
                nodo.setxanti(x);
                nodo.setyanti(y);
                nodo.setxposte(-1);
                nodo.setyposte(-1);
                nodo.setxx(x-1);
                nodo.setyy(y);
                return nodo;
            }
        }catch(Exception ex){
            // el catch es por si estoy en primera fila o ultima columna, da error, asi que busco otro
        }
        // misma fila derecha
        try{
           
            if(!matriz[x+1][y].getusado()){
                
                nodo.setcanti(2);
                nodo.sethund(false);
                nodo.setusa(true);
                nodo.settoc(false);
                nodo.setxanti(x);
                nodo.setyanti(y);
                nodo.setxposte(-1);
                nodo.setyposte(-1);
                nodo.setxx(x+1);
                nodo.setyy(y);
                return nodo;
            }
        }catch(Exception ex){
            // el catch es por si estoy en primera fila o ultima columna, da error, asi que busco otro
        }
        nodo=null;// si no hay libre devuelve null
        return nodo;
    }

    
    private int tipocasi(int x, int y){
          // funcion que devuelve 1 si el barco es tocado o 2 si es hundido. Avisa al jugador.
        int th=0;
        BtNavalLog.logica.BatNavLogica bnl=new BtNavalLog.logica.BatNavLogica();
        if(matriz[x][y].getusado()){
            
            int c=0;
            switch(matriz[x][y].getcant()){
                case 1: matriz[x][y].settoc(true);
                        matriz[x][y].sethund(true);
                        c=Integer.parseInt(cant1.getText());
                        c--;
                        cant1.setText(String.valueOf(c));
                        avisos.setText("TOCADO Y HUNDIDO");
                        th=2;
                        break;
                case 2: th=bnl.caso2(x, y, matriz);
                        if(th==1) avisos.setText("TOCADO");
                        else {
                            avisos.setText("TOCADO Y HUNDIDO");
                            c=Integer.parseInt(cant2.getText());
                            c--;
                            cant2.setText(String.valueOf(c));
                        }
                        break;
                case 3: th=bnl.caso3_1(x, y, matriz);
                        if(th==1) avisos.setText("TOCADO");
                        else{
                            avisos.setText("TOCADO Y HUNDIDO");
                            c=Integer.parseInt(cant3.getText());
                            c--;
                            cant3.setText(String.valueOf(c));
                        }
                        break;
            }
        }
        if(th==0){
            avisos.setText("AGUA");
        }
        int c1=Integer.parseInt(cant1.getText());
        int c2=Integer.parseInt(cant2.getText());
        int c3=Integer.parseInt(cant3.getText());
//        int c4=Integer.parseInt(cant4.getText());
        if(c1==0 && c2==0 && c3==0){
            avisos.setText("WINNER!! GANADOR!! GANASTE!!");
             // recorro los botones del panel de la maquina y los inhabilito todos
            inhabilito();
        }else{// le toca jugar a la maquina
            // 
            inhabilito();
            // cargo las propiedades del objeto para que juege la maquina.
            bnl.matrizj=matrizj;
            bnl.arrtoc=arrtoc;
            bnl.arrjugada=arrjugada;
            bnl.juegamaquina(columnam.getText(), filam.getText(), midisparo);// mi disparo tiene 1=agua, 2=tocado, 3=hundido
            
            switch(bnl.columna){
                case 1: columnam.setText("A");break;
                case 2: columnam.setText("B");break;
                case 3: columnam.setText("C");break;
                case 4: columnam.setText("D");break;
                case 5: columnam.setText("E");break;
                case 6: columnam.setText("F");break;
                case 7: columnam.setText("G");break;
                case 8: columnam.setText("H");break;
                case 9: columnam.setText("I");break;
                case 10: columnam.setText("J");break;
            }
            
            filam.setText(String.valueOf(bnl.fila));
           
            matrizj=bnl.matrizj;
        }
        return th;
    }
    private void inhabilito(){
        for(int x2=0;x2<jPanel2.getComponentCount();x2++){
                if(jPanel2.getComponent(x2) instanceof JButton){
                    JButton jb = (JButton) jPanel2.getComponent(x2);
                    jb.setEnabled(false);

                }
            }
    }

    private void habilito() {
        for(int x2=0;x2<jPanel2.getComponentCount();x2++){
                if(jPanel2.getComponent(x2) instanceof JButton){
                    JButton jb = (JButton) jPanel2.getComponent(x2);
                    jb.setEnabled(true);

                }
            }
    }

    
}