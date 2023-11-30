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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javaswingdev.swing.table.Table();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextFieldRound1 = new jtextfieldround.JTextFieldRound();
        jTextFieldRound3 = new jtextfieldround.JTextFieldRound();
        jTextFieldRound4 = new jtextfieldround.JTextFieldRound();
        jTextFieldRound5 = new jtextfieldround.JTextFieldRound();
        jTextFieldRound6 = new jtextfieldround.JTextFieldRound();
        jTextFieldRound7 = new jtextfieldround.JTextFieldRound();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldRound2 = new jtextfieldround.JTextFieldRound();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();

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
        jLabel2.setText("ACTUALIZAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(426, 426, 426)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(438, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(21, 21, 21))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, -1));

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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 735, 1050, 340));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(204, 51, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cristal", "Metal_Gas", "Polimero", "Porcela", "Equipo_Electrico", "Material_Imantado", "Seguridad", "Sustancias", "Limpieza", "Consumibles" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 260, 37));
        jPanel2.add(jTextFieldRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 10, 110, 40));
        jPanel2.add(jTextFieldRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 260, 40));
        jPanel2.add(jTextFieldRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 270, 40));
        jPanel2.add(jTextFieldRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 270, 40));
        jPanel2.add(jTextFieldRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 270, 40));
        jPanel2.add(jTextFieldRound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 270, 40));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LABORATORIO DE QUIMICA", "ALMACEN" }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, 280, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Actualizar_Normal.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Actualizar_Presionado.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 160, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 270, 40));

        jLabel14.setBackground(new java.awt.Color(0, 51, 102));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel14.setText("ID");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 30));

        jLabel15.setBackground(new java.awt.Color(0, 51, 102));
        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel15.setText("Nombre");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, 30));

        jLabel16.setBackground(new java.awt.Color(0, 51, 102));
        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel16.setText("Tipo");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, 30));

        jLabel17.setBackground(new java.awt.Color(0, 51, 102));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel17.setText("Marca");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 30));

        jLabel18.setBackground(new java.awt.Color(0, 51, 102));
        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel18.setText("Modelo");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 100, 30));

        jLabel19.setBackground(new java.awt.Color(0, 51, 102));
        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel19.setText("Serie");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 80, 30));

        jLabel20.setBackground(new java.awt.Color(0, 51, 102));
        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel20.setText("Especificaciones");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 170, 30));

        jLabel21.setBackground(new java.awt.Color(0, 51, 102));
        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel21.setText("Cantidad");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 110, 30));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 51, 0)));

        jLabel13.setBackground(new java.awt.Color(0, 51, 102));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel13.setText("Foto");

        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Eliminar_Normal.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Eliminar_Presionado.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

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
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(8, 8, 8))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 530, 350));

        jLabel22.setBackground(new java.awt.Color(0, 51, 102));
        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel22.setText("Ubicación");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 110, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(383, Short.MAX_VALUE))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1080, 1030));
    }// </editor-fold>//GEN-END:initComponents

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
