package javaswingdev.form;

import inventario_quimico.BD;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Inventario_Agregar extends javax.swing.JPanel {

    JFileChooser archivo;
    String rutaDelArchivo = "";
    String nombre_archivo = "";
    DefaultTableModel modelo_materiales = new DefaultTableModel();
    boolean bandera_foto = false;

    public Inventario_Agregar(String name) {
        initComponents();
        modelo_materiales.setColumnCount(0);
        modelo_materiales.addColumn("ID");
        modelo_materiales.addColumn("Nombre");
        modelo_materiales.addColumn("Tipo");
        modelo_materiales.addColumn("Marca");
        modelo_materiales.addColumn("Modelo");
        modelo_materiales.addColumn("Serie");
        modelo_materiales.addColumn("Cantidad");
        modelo_materiales.addColumn("Ubicacion");
        modelo_materiales.addColumn("Especificaciones");
        modelo_materiales.addColumn("Codigo_foto");
        table1.setModel(modelo_materiales);
        Mostrar_materiales();
    }

    public void Mostrar_materiales() {
        modelo_materiales.setRowCount(0);
        BD bd = new BD();
        modelo_materiales = bd.mostrar_materiales(modelo_materiales);
        table1.setModel(modelo_materiales);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javaswingdev.swing.table.Table();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldRound2 = new jtextfieldround.JTextFieldRound();
        jTextFieldRound3 = new jtextfieldround.JTextFieldRound();
        jTextFieldRound4 = new jtextfieldround.JTextFieldRound();
        jTextFieldRound5 = new jtextfieldround.JTextFieldRound();
        jTextFieldRound6 = new jtextfieldround.JTextFieldRound();
        jTextFieldRound7 = new jtextfieldround.JTextFieldRound();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(155, 14, 62));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AGREGAR PRODUCTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(jLabel2)
                .addContainerGap(388, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 3, 3, new java.awt.Color(204, 51, 0)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setToolTipText("");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Tipo", "Marca", "Modelo", "Serie", "Cantidad", "Ubicación", "Foto", "Estado"
            }
        ));
        jScrollPane2.setViewportView(table1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cristal", "Metal_Gas", "Polimero", "Porcela", "Equipo_Electrico", "Material_Imantado", "Seguridad", "Sustancias", "Limpieza", "Consumibles" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 280, 37));

        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 330, 190));
        jPanel2.add(jTextFieldRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 300, 40));
        jPanel2.add(jTextFieldRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 290, 40));
        jPanel2.add(jTextFieldRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 280, 40));
        jPanel2.add(jTextFieldRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 280, 40));
        jPanel2.add(jTextFieldRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 280, 40));
        jPanel2.add(jTextFieldRound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 290, 40));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LABORATORIO DE QUIMICA", "ALMACEN" }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 290, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Agregar_Normal.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Agregar_Presionado.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 170, 60));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 290, 40));

        jLabel13.setBackground(new java.awt.Color(0, 51, 102));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel13.setText("Nombre");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, -1));

        jLabel14.setBackground(new java.awt.Color(0, 51, 102));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel14.setText("Tipo");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, -1));

        jLabel15.setBackground(new java.awt.Color(0, 51, 102));
        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel15.setText("Marca");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 100, -1));

        jLabel16.setBackground(new java.awt.Color(0, 51, 102));
        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel16.setText("Modelo");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 100, -1));

        jLabel8.setBackground(new java.awt.Color(0, 51, 102));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Foto");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 90, -1));

        jLabel9.setBackground(new java.awt.Color(0, 51, 102));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setText("Serie");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 100, -1));

        jLabel17.setBackground(new java.awt.Color(0, 51, 102));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel17.setText("Especificaciones");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 180, -1));

        jLabel18.setBackground(new java.awt.Color(0, 51, 102));
        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel18.setText("Cantidad");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 180, -1));

        jLabel19.setBackground(new java.awt.Color(0, 51, 102));
        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel19.setText("Ubicación");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 180, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 51, 0)));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Buscar_Nomral.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Buscar_Presionado.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(270, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(265, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 550, 330));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE))
                .addGap(56, 56, 56))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1110, 1030));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //agregar un producto (funciona)
        try {
            String Nombre = jTextFieldRound3.getText();
            String Tipo = jComboBox1.getSelectedItem().toString();
            String Marca = jTextFieldRound4.getText();
            String Modelo = jTextFieldRound5.getText();
            String Serie = jTextFieldRound6.getText();
            int Cantidad = Integer.parseInt(jTextFieldRound7.getText());
            String Ubicacion = jComboBox1.getSelectedItem().toString();
            String Especificaciones = jTextField1.getText();
            if (Comprobar_datos_faltantes(Nombre, Tipo, Marca, Modelo, Serie, Cantidad, Ubicacion)) {
                try {
                    BD bd = new BD();
                    boolean bandera = bd.Ingresar_Producto(Nombre, Tipo, Marca, Modelo,
                            Serie, Cantidad, Ubicacion, Especificaciones);
                    if (bandera) {
                        JOptionPane.showMessageDialog(null, "Se inserto un elemento");
                        if (bandera_foto) {
                            File imageFile = new File(rutaDelArchivo);
                            FileInputStream Imagen_insertar = new FileInputStream(imageFile);
                            int ID = bd.buscar_id_material(Nombre);
                            if (ID == 0) {
                                JOptionPane.showMessageDialog(null, "Ocurrio un error con el material y no se guardo la foto");
                            } else {
                                boolean Actualizacion_foto = bd.Actualizar_Foto_Producto(ID, Imagen_insertar, imageFile);
                                if (Actualizacion_foto == false) {
                                    JOptionPane.showMessageDialog(null, "Elemento de imagen no valido, ingrese otra imagen compatible");
                                }
                                bandera_foto = false;
                            }
                        }
                        Mostrar_materiales();
                    } else {
                        JOptionPane.showMessageDialog(null, "Ocurrio un error");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Elemento de imagen no valido, ingrese otra imagen compatible");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Falta de ingresar datos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingresa los datos de forma correcta");
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        archivo = new JFileChooser(System.getProperty("base.png"));
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Archivos de Imagen", "jpg", "jpeg", "png");
        archivo.setFileFilter(imageFilter);
        int resultado = archivo.showOpenDialog(null);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            rutaDelArchivo = archivo.getSelectedFile().getAbsolutePath();
            nombre_archivo = archivo.getSelectedFile().getName();
            jTextFieldRound2.setText(nombre_archivo);
            ImageIcon icono_seleccionado = new ImageIcon(rutaDelArchivo);
            Image imagen = icono_seleccionado.getImage();
            Image imagenRedimensionada = imagen.getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);
            jLabel7.setIcon(iconoRedimensionado);
            bandera_foto = true;
        } else if (resultado == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "No se selecciono una fotografia");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public boolean Comprobar_datos_faltantes(String nombre, String Tipo, String Marca, String Modelo,
            String Serie, int cantidad, String Ubicacion) {
        if (nombre.equals("")) {
            return false;
        }
        if (Tipo.equals("")) {
            return false;
        }
        if (Marca.equals("")) {
            return false;
        }
        if (Modelo.equals("")) {
            return false;
        }
        if (Serie.equals("")) {
            return false;
        }
        if (cantidad < 0) {
            return false;
        }
        if (Ubicacion.equals("")) {
            return false;
        }
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private jtextfieldround.JTextFieldRound jTextFieldRound2;
    private jtextfieldround.JTextFieldRound jTextFieldRound3;
    private jtextfieldround.JTextFieldRound jTextFieldRound4;
    private jtextfieldround.JTextFieldRound jTextFieldRound5;
    private jtextfieldround.JTextFieldRound jTextFieldRound6;
    private jtextfieldround.JTextFieldRound jTextFieldRound7;
    private javaswingdev.swing.table.Table table1;
    // End of variables declaration//GEN-END:variables
}
