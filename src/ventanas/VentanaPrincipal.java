package ventanas;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Registro de Atletas");
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cajaEdad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cajaPeso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cajaEstatura = new javax.swing.JTextField();
        btnRegistrarAtleta = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        registroAtleta = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(239, 239, 254));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 71, 71));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(71, 71, 71));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 71, 71));
        jLabel3.setText("Edad:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(71, 71, 71));
        jLabel4.setText("Peso (kg):");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(71, 71, 71));
        jLabel5.setText("Estatura (cm):");

        btnRegistrarAtleta.setBackground(new java.awt.Color(115, 12, 115));
        btnRegistrarAtleta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnRegistrarAtleta.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarAtleta.setText("Registrar Atleta");
        btnRegistrarAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAtletaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(cajaPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cajaEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(btnRegistrarAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addComponent(btnRegistrarAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jMenu1.setText("Menú");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        registroAtleta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        registroAtleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/run.png"))); // NOI18N
        registroAtleta.setText("Mostrar registro de atletas");
        registroAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroAtletaActionPerformed(evt);
            }
        });
        jMenu1.add(registroAtleta);
        jMenu1.add(jSeparator1);

        salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jMenu1.add(salir);

        menu.add(jMenu1);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarAtletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAtletaActionPerformed
        // declarar las variables donde se guardan los valores obtenidos 
        String nombre;
        int edad;
        double peso;
        int estatura;
        // obtener los valores de las Text Field y asignarlo a las variables
        nombre = cajaNombre.getText();
        edad = Integer.parseInt(cajaEdad.getText());
        peso = Double.parseDouble(cajaPeso.getText());
        estatura = Integer.parseInt(cajaEstatura.getText());
        // instanciar un objeto de atleta con sus parametros
        Atleta atleta = new Atleta(nombre, edad, peso, estatura);
        // implementar metodo para escribir en el archivo binario
        escribirBinario(atleta);
        // vaciar las Text Field luego de agregar el objeto al archivo binario
        cajaNombre.setText("");
        cajaEdad.setText("");
        cajaPeso.setText("");
        cajaEstatura.setText("");

    }//GEN-LAST:event_btnRegistrarAtletaActionPerformed

    private void registroAtletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroAtletaActionPerformed
        // con true no se puede acceder a la ventana principal si la VentanaRegistros está abierta
        VentanaRegistros registros = new VentanaRegistros(this, true);
        registros.setVisible(true);
    }//GEN-LAST:event_registroAtletaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed
    private void escribirBinario(Atleta atleta) {
        try {
            // se pone true como segundo parametro para que se agregue mas contenido
            FileOutputStream archivo = new FileOutputStream("registros.bin", true);
            /**
             * Se arroja exception si se realiza directamente con
             * ObjectOutputStream la excepcion indica que se han creado dos
             * cabeceras distintas. Solo puede ponerse una sola cabecera al
             * inicio del archibo binario. Se crea e instancia Añadir... para
             * que al ingresar un nuevo objeto no se cree una cabecera por cada
             * uno, sino que haya siempre solo una al comienzo del archivo
             */
            AñadirContenidoAtleta añadir = new AñadirContenidoAtleta(archivo);
            añadir.writeObject(atleta);
            añadir.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Error, no se pudo añadir texto " + ex);
        } catch (IOException ex) {
            System.err.println("Error, no se pudo añadir texto " + ex);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarAtleta;
    private javax.swing.JTextField cajaEdad;
    private javax.swing.JTextField cajaEstatura;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaPeso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem registroAtleta;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
