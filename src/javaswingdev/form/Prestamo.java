package javaswingdev.form;

import com.raven.datechooser.SelectedDate;
import inventario_quimico.BD;
import inventario_quimico.login;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Prestamo extends javax.swing.JPanel {

    DefaultTableModel modelo_materiales = new DefaultTableModel();

    public Prestamo(String name) {
        initComponents();
        jComboBox1.removeAllItems();
        BD bd = new BD();
        Vector<String> productos = new Vector<String>();
        productos = bd.mostrar_materiales();
        for (String producto : productos) {
            jComboBox1.addItem(producto);
        }
        modelo_materiales.setColumnCount(0);
        modelo_materiales.addColumn("ID");
        modelo_materiales.addColumn("Fecha_I");
        modelo_materiales.addColumn("Fecha_F");
        modelo_materiales.addColumn("Nombre");
        modelo_materiales.addColumn("Matricula");
        modelo_materiales.addColumn("Material");
        modelo_materiales.addColumn("Cantidad");
        modelo_materiales.addColumn("Devolucion");
        table1.setModel(modelo_materiales);
        Mostrar_materiales();

        table1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int selectedRow = table1.getSelectedRow();
                    if (selectedRow != -1) {
                        Object value1 = table1.getValueAt(selectedRow, 0);
                        Object value2 = table1.getValueAt(selectedRow, 1);
                        Object value3 = table1.getValueAt(selectedRow, 2);
                        Object value4 = table1.getValueAt(selectedRow, 3);
                        Object value5 = table1.getValueAt(selectedRow, 4);
                        Object value6 = table1.getValueAt(selectedRow, 5);
                        Object value7 = table1.getValueAt(selectedRow, 6);
                        Object value8 = table1.getValueAt(selectedRow, 7);
                        jTextField1.setText(value1.toString());
                        String Fecha_I = value2.toString();
                        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                        //////////////////////////////////
                        String Fecha_F = (value3 != null) ? value3.toString() : "sin valor";
                        try {
                            Date Fecha_Inicial = formato.parse(Fecha_I);
                            dateChooser1.setSelectedDate(Fecha_Inicial);
                            if (!Fecha_F.equals("sin valor")) {
                                Date Fecha_Final = formato.parse(Fecha_F);
                                dateChooser2.setSelectedDate(Fecha_Final);
                            }
                        } catch (Exception e) {
                            System.out.println("error en fecha 1 o 2");
                        }
                        jTextFieldRound1.setText(value4.toString());
                        jTextFieldRound2.setText(value5.toString());
                        jComboBox1.setSelectedItem(value6.toString());
                        jTextFieldRound3.setText(value7.toString());
                        jComboBox2.setSelectedItem(value8.toString());
                    }
                }
            }
        });

    }

    public void Mostrar_materiales() {
        modelo_materiales.setRowCount(0);
        BD bd = new BD();
        modelo_materiales = bd.mostrar_Prestamos(modelo_materiales);
        table1.setModel(modelo_materiales);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dateChooser1 = new com.raven.datechooser.DateChooser();
        dateChooser2 = new com.raven.datechooser.DateChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextFieldRound1 = new jtextfieldround.JTextFieldRound();
        jTextFieldRound2 = new jtextfieldround.JTextFieldRound();
        jTextFieldRound3 = new jtextfieldround.JTextFieldRound();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javaswingdev.swing.table.Table();
        jLabel14 = new javax.swing.JLabel();

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
        jLabel2.setText("PRESTAMOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(438, 438, 438)
                .addComponent(jLabel2)
                .addContainerGap(448, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1090, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(dateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));
        jPanel2.add(dateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Guardar_Normal.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Guardar_Presiondo.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 169, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Limpiar_Normal.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Limpiar_Presionado.png"))); // NOI18N
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 480, 181, -1));
        jPanel2.add(jTextFieldRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, 40));
        jPanel2.add(jTextFieldRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, -1, 40));
        jPanel2.add(jTextFieldRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, -1, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 65, 257, 38));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Actualizar_Normal.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Actualizar_Presionado.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 174, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Eliminar_Normal.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Eliminar_Presionado.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 165, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 25, 153, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Devuelto", "Devuelto" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 122, 257, 35));

        jLabel10.setBackground(new java.awt.Color(0, 51, 102));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel10.setText("Fecha de regreso");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 190, 30));

        jLabel11.setBackground(new java.awt.Color(0, 51, 102));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel11.setText("ID del Prestamo");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, -1));

        jLabel12.setBackground(new java.awt.Color(0, 51, 102));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel12.setText("Material a prestar");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 170, -1));

        jLabel15.setBackground(new java.awt.Color(0, 51, 102));
        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel15.setText("Estado");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 170, 30));

        jLabel16.setBackground(new java.awt.Color(0, 51, 102));
        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel16.setText("Nombre de la Persona");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 220, 30));

        jLabel17.setBackground(new java.awt.Color(0, 51, 102));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel17.setText("Matricula");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 140, 30));

        jLabel18.setBackground(new java.awt.Color(0, 51, 102));
        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel18.setText("Cantidad");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 140, 30));

        jLabel19.setBackground(new java.awt.Color(0, 51, 102));
        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel19.setText("Fecha de prestamo");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 190, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 104, 1050, 560));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 3, 3, new java.awt.Color(204, 51, 0)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setToolTipText("");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Material", "Cantidad", "Fecha de Egreso", "Fcha de Ingreso", "Nombre del Alumno", "Matricula"
            }
        ));
        jScrollPane2.setViewportView(table1);

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel14.setText("HISTORIAL DE PRESTAMOS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jLabel14)
                .addContainerGap(427, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(599, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 80, 1090, 1030));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Codigo guardar por defecto solo toma la primera fecha y su estado es no devuelto
        try {
            String Nombre_Material = jComboBox1.getSelectedItem().toString();
            String Nombre = jTextFieldRound1.getText();
            String Matricula = jTextFieldRound2.getText();
            int Cantidad = Integer.parseInt(jTextFieldRound3.getText());
            SelectedDate fechaSeleccionada = dateChooser1.getSelectedDate();
            String fecha_utilizar = fechaSeleccionada.getYear() + "-" + fechaSeleccionada.getMonth() + "-" + fechaSeleccionada.getDay();
            if (Comprobar_datos_faltantes(Nombre, Matricula, Cantidad)) {
                BD bd = new BD();
                int Id_Material = bd.buscar_id_material(Nombre_Material);
                int cantidad_disponible = bd.Verificar_cantidad_disponible(Id_Material, Cantidad);
                if (cantidad_disponible >= 0) {
                    bd.Actualizar_Cantidad_Material(cantidad_disponible, Id_Material);
                    if (bd.Ingresar_Prestamo(fecha_utilizar, Nombre, Matricula, Id_Material, Cantidad, 0)) {
                        JOptionPane.showMessageDialog(null, "Se agrego un prestamo con exito");
                        Mostrar_materiales();
                    } else {
                        JOptionPane.showMessageDialog(null, "Reinicie la aplicacion");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No existe tantos productos para prestar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Completa todos los datos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingresa los datos correctamente");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public boolean Comprobar_datos_faltantes(String Nombre, String Matricula, int Cantidad) {
        if (Nombre.equals("")) {
            return false;
        }
        if (Matricula.equals("")) {
            return false;
        }
        if (Cantidad <= 0) {
            return false;
        }
        return true;
    }

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Eliminar un registro
        try {
            int id = Integer.parseInt(jTextField1.getText());
            BD bd = new BD();
            boolean bandera = bd.Eliminar_Prestamo(id);
            if (bandera) {
                JOptionPane.showMessageDialog(null, "Se elimino el prestamo");
                Mostrar_materiales();
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un error");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecciona un material de la tabla primero");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //codigo actualizar
        try {
            int Id_Prestamo = Integer.parseInt(jTextField1.getText());
            String Nombre_Material = jComboBox1.getSelectedItem().toString();
            String Nombre = jTextFieldRound1.getText();
            String Matricula = jTextFieldRound2.getText();
            int Cantidad = Integer.parseInt(jTextFieldRound3.getText());
            String selectedItem = jComboBox2.getSelectedItem().toString();
            int Estado = (selectedItem.equals("No Devuelto")) ? 0 : 1;
            SelectedDate fecha_Seleccionada_1 = dateChooser1.getSelectedDate();
            String fecha_utilizar_1 = fecha_Seleccionada_1.getYear() + "-" + fecha_Seleccionada_1.getMonth()
                    + "-" + fecha_Seleccionada_1.getDay();
            SelectedDate fecha_Seleccionada_2 = dateChooser2.getSelectedDate();
            String fecha_utilizar_2 = fecha_Seleccionada_2.getYear() + "-" + fecha_Seleccionada_2.getMonth()
                    + "-" + fecha_Seleccionada_2.getDay();
            if (Comprobar_datos_faltantes(Nombre, Matricula, Cantidad)) {
                BD bd = new BD();
                int Id_Material = bd.buscar_id_material(Nombre_Material);
                boolean bandera_ingreso = bd.Actualizar_Prestamo(fecha_utilizar_1, fecha_utilizar_2,
                        Nombre, Matricula, Id_Material , Cantidad, Estado, Id_Prestamo);
                if (bandera_ingreso){
                    if (Estado == 1){
                        bd.Actualizar_Cantidad_Material_Prestamo(Cantidad, Id_Material);
                    }
                    JOptionPane.showMessageDialog(null,"Se actualizarón los datos");
                    Mostrar_materiales();
                }else{
                    JOptionPane.showMessageDialog(null, "Error al actulizar los datos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Completa todos los datos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingresa los datos correctamente");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.datechooser.DateChooser dateChooser1;
    private com.raven.datechooser.DateChooser dateChooser2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private jtextfieldround.JTextFieldRound jTextFieldRound1;
    private jtextfieldround.JTextFieldRound jTextFieldRound2;
    private jtextfieldround.JTextFieldRound jTextFieldRound3;
    private javaswingdev.swing.table.Table table1;
    // End of variables declaration//GEN-END:variables
}
