package javaswingdev.form;

import inventario_quimico.BD;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Inventario_Actualizar extends javax.swing.JPanel {

    JFileChooser archivo;
    String rutaDelArchivo = "";
    String nombre_archivo = "";
    DefaultTableModel modelo_materiales = new DefaultTableModel();
    Boolean bandera = false;

    public Inventario_Actualizar(String name) {
        initComponents();
        jTextFieldRound1.setEnabled(false);
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
        table1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int selectedRow = table1.getSelectedRow();
                    if (selectedRow != -1) {
                        jLabel7.setIcon(null);
                        Object value1 = table1.getValueAt(selectedRow, 0);
                        Object value2 = table1.getValueAt(selectedRow, 1);
                        Object value3 = table1.getValueAt(selectedRow, 2);
                        Object value4 = table1.getValueAt(selectedRow, 3);
                        Object value5 = table1.getValueAt(selectedRow, 4);
                        Object value6 = table1.getValueAt(selectedRow, 5);
                        Object value7 = table1.getValueAt(selectedRow, 6);
                        Object value8 = table1.getValueAt(selectedRow, 7);
                        Object value9 = table1.getValueAt(selectedRow, 8);
                        Object value10 = table1.getValueAt(selectedRow, 9);
                        jTextFieldRound1.setText(value1.toString());
                        jTextFieldRound3.setText(value2.toString());
                        jComboBox1.setSelectedItem(value3.toString());
                        jTextFieldRound4.setText(value4.toString());
                        jTextFieldRound5.setText(value5.toString());
                        jTextFieldRound6.setText(value6.toString());
                        jTextFieldRound7.setText(value7.toString());
                        jComboBox2.setSelectedItem(value8.toString());
                        jTextField1.setText(value9.toString());
                        BD bd = new BD();
                        byte[] arreglo = bd.recuperar_imagen(Integer.parseInt(value1.toString()));
                        Colocar_imagen(arreglo);
                    }
                }
            }
        });
    }

    public void Colocar_imagen(byte[] imageBytes) {
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(imageBytes);
            BufferedImage image = ImageIO.read(bis);
            int labelWidth = jLabel7.getWidth();
            int labelHeight = jLabel7.getHeight();
            Image scaledImage = image.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(scaledImage);
            jLabel7.setIcon(icon);
        } catch (Exception e) {
        }
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javaswingdev.swing.table.Table();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldRound1 = new jtextfieldround.JTextFieldRound();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldRound3 = new jtextfieldround.JTextFieldRound();
        jLabel16 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldRound4 = new jtextfieldround.JTextFieldRound();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldRound5 = new jtextfieldround.JTextFieldRound();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldRound6 = new jtextfieldround.JTextFieldRound();
        jLabel22 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextFieldRound7 = new jtextfieldround.JTextFieldRound();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldRound2 = new jtextfieldround.JTextFieldRound();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(155, 14, 62));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ACTUALIZAR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 226, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 12, 3, new java.awt.Color(204, 51, 0)));
        jPanel2.setToolTipText("");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setToolTipText("");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Tipo", "Marca", "Modelo", "Serie", "Cantidad", "Ubicación", "Foto", "Estado"
            }
        ));
        jScrollPane2.setViewportView(table1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1024, 440));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(0, 51, 102));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel14.setText("ID");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 30));
        jPanel4.add(jTextFieldRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 110, 40));

        jLabel15.setBackground(new java.awt.Color(0, 51, 102));
        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel15.setText("Nombre");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 100, 30));
        jPanel4.add(jTextFieldRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 260, 40));

        jLabel16.setBackground(new java.awt.Color(0, 51, 102));
        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel16.setText("Tipo");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cristal", "Metal_Gas", "Polimero", "Porcela", "Equipo_Electrico", "Material_Imantado", "Seguridad", "Sustancias", "Limpieza", "Consumibles" }));
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 260, 37));

        jLabel17.setBackground(new java.awt.Color(0, 51, 102));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel17.setText("Marca");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 100, 30));
        jPanel4.add(jTextFieldRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 270, 40));

        jLabel18.setBackground(new java.awt.Color(0, 51, 102));
        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel18.setText("Modelo");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 100, 30));
        jPanel4.add(jTextFieldRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 270, 40));

        jLabel19.setBackground(new java.awt.Color(0, 51, 102));
        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel19.setText("Serie");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 80, 30));
        jPanel4.add(jTextFieldRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 270, 40));

        jLabel22.setBackground(new java.awt.Color(0, 51, 102));
        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel22.setText("Ubicación");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 110, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LABORATORIO DE QUIMICA", "ALMACEN" }));
        jPanel4.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 280, 40));
        jPanel4.add(jTextFieldRound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 270, 40));

        jLabel21.setBackground(new java.awt.Color(0, 51, 102));
        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel21.setText("Cantidad");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 110, 30));

        jLabel20.setBackground(new java.awt.Color(0, 51, 102));
        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel20.setText("Especificaciones");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 170, 30));
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 270, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 51, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(0, 51, 102));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel13.setText("Foto");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, 30));

        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 277, 206));
        jPanel5.add(jTextFieldRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 20, 281, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Eliminar_Normal.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Eliminar_Presionado.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 286, 157, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Buscar_Nomral.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Buscar_Presionado.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 286, 161, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 530, 350));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Actualizar_Normal.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Actualizar_Presionado.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 160, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jScrollPane3.setViewportView(jPanel2);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1100, 660));
    }// </editor-fold>//GEN-END:initComponents

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
            bandera = true;
        } else if (resultado == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "No se selecciono una fotografia");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int choice = JOptionPane.showConfirmDialog(
            null,
            "¿Estas seguro de realizar la acción?",
            "Mensaje de Confirmación",
            JOptionPane.YES_NO_CANCEL_OPTION
        );
        if (choice == JOptionPane.YES_OPTION) {
            try {
                int ID = Integer.parseInt(jTextFieldRound1.getText());
                BD bd = new BD();
                boolean bandera_eliminar_elemento = bd.Eliminar_Producto(ID);
                if (bandera_eliminar_elemento) {
                    JOptionPane.showMessageDialog(null, "Se elimino el material correctamente");
                    Mostrar_materiales();
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurrio un error");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Selecciona un material de la tabla primero");
            }
        } else if (choice == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Operacion de eliminar cancelada");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // codigo actualizar
        try {
            int ID = Integer.parseInt(jTextFieldRound1.getText());
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
                    if (bandera == true) {
                        File imageFile = new File(rutaDelArchivo);
                        FileInputStream Imagen_insertar = new FileInputStream(imageFile);
                        boolean Actualizacion_foto = bd.Actualizar_Foto_Producto(ID, Imagen_insertar, imageFile);
                        if (Actualizacion_foto == false) {
                            JOptionPane.showMessageDialog(null, "Elemento de imagen no valido, ingrese otra imagen compatible");
                        }
                        bandera = false;
                    }
                    boolean bandera_actualizacion = bd.Actualizar_Producto(Nombre, Tipo, Marca, Modelo, Serie, Cantidad, Ubicacion, Especificaciones, ID);
                    if (bandera_actualizacion == true) {
                        JOptionPane.showMessageDialog(null, "Elemento actualizado correctamente");
                        Mostrar_materiales();
                    } else {
                        JOptionPane.showMessageDialog(null, "Ocurrio un error, intentelo de nuevo");
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
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private jtextfieldround.JTextFieldRound jTextFieldRound1;
    private jtextfieldround.JTextFieldRound jTextFieldRound2;
    private jtextfieldround.JTextFieldRound jTextFieldRound3;
    private jtextfieldround.JTextFieldRound jTextFieldRound4;
    private jtextfieldround.JTextFieldRound jTextFieldRound5;
    private jtextfieldround.JTextFieldRound jTextFieldRound6;
    private jtextfieldround.JTextFieldRound jTextFieldRound7;
    private javaswingdev.swing.table.Table table1;
    // End of variables declaration//GEN-END:variables
}
