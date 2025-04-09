/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package compuworkhr.presentacion;

import compuworkhr.controlador.DepartamentoControlador;
import compuworkhr.controlador.EmpleadoControlador;
import compuworkhr.logica.Departamento;
import compuworkhr.logica.Empleado;
import compuworkhr.logica.EmpleadoIndefinido;
import compuworkhr.logica.EmpleadoTemporal;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Laura.Garcia
 */
public class ActualizarEmpleadoDialog extends javax.swing.JDialog {

    private EmpleadoControlador empleadoCtrl;
    private Empleado empleadoSeleccionado;
    private DepartamentoControlador departamentoControlador;


    public ActualizarEmpleadoDialog(java.awt.Frame parent, boolean modal, EmpleadoControlador empleadoCtrl, Empleado empleadoSeleccionado, DepartamentoControlador departamentoControlador) {
        super(parent, modal);
        this.empleadoCtrl = empleadoCtrl;
        this.empleadoSeleccionado = empleadoSeleccionado;
        this.departamentoControlador = departamentoControlador;
        initComponents();
        
        txtId.setText(String.valueOf(empleadoSeleccionado.getId()));
        txtNombre.setText(empleadoSeleccionado.getNombre());
        txtCargo.setText(empleadoSeleccionado.getCargo());
        txtSalario.setText(String.valueOf(empleadoSeleccionado.getSalario()));
        cargarDepartamentos();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelNombreModulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDepartamento = new javax.swing.JLabel();
        comboTipoContrato = new javax.swing.JComboBox<>();
        comboDepartamentos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtFechaTfijo = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtId.setText("Id");

        txtNombre.setText("Nombre");

        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });

        txtCargo.setText("Cargo");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        labelNombreModulo.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        labelNombreModulo.setText("Empleados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(labelNombreModulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(labelNombreModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        lblNombre.setText("Nombre:");

        lblCargo.setText("Cargo:");

        jLabel2.setText("Tipo Contrato:");

        lblDepartamento.setText("Departamento:");

        comboTipoContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Término Indefinido", "Termino Fijo" }));
        comboTipoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoContratoActionPerformed(evt);
            }
        });

        comboDepartamentos.setModel(new javax.swing.DefaultComboBoxModel<compuworkhr.logica.Departamento>());
        comboDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDepartamentosActionPerformed(evt);
            }
        });

        jLabel1.setText("Salario:");

        txtFechaTfijo.setEditable(false);
        comboTipoContrato.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String tipo = (String) comboTipoContrato.getSelectedItem();
                if ("Término Fijo".equals(tipo)) {
                    txtFechaTfijo.setVisible(true);
                } else {
                    txtFechaTfijo.setVisible(false);
                }
            }
        });
        txtFechaTfijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaTfijoActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha Contrato");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblCargo)
                            .addComponent(jLabel2)
                            .addComponent(lblDepartamento))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(158, 158, 158)
                                        .addComponent(jLabel1)
                                        .addGap(28, 28, 28)
                                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboTipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(97, 97, 97)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFechaTfijo))))))
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(89, 89, 89)
                .addComponent(btnCancelar)
                .addGap(182, 182, 182))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaTfijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnCancelar))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(18, 18, 18)
                        .addComponent(lblCargo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboTipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDepartamento)
                            .addComponent(comboDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
        int id = Integer.parseInt(txtId.getText().trim());
        String nombre = txtNombre.getText().trim();
        String cargo = txtCargo.getText().trim();
        double salario = Double.parseDouble(txtSalario.getText().trim());
        
        String tipoContrato = (String) comboTipoContrato.getSelectedItem();
        Empleado empleadoActualizado;
        
            if ("Término Fijo".equals(tipoContrato)) {
                java.time.LocalDate fechaTermino = java.time.LocalDate.parse(txtFechaTfijo.getText().trim());
                empleadoActualizado = new EmpleadoTemporal(id, nombre, cargo, salario, fechaTermino);
            } else {
                empleadoActualizado = new EmpleadoIndefinido(id, nombre, cargo, salario);
            }

            empleadoCtrl.actualizarEmpleado(empleadoActualizado);
            Departamento deptSeleccionado = (Departamento) comboDepartamentos.getSelectedItem();
            if(deptSeleccionado != null) {
 
                departamentoControlador.asignarEmpleado(deptSeleccionado.getId(), empleadoActualizado);
            }

            ((EmpleadoLandingPage)getParent()).cargarDatos();
            dispose();

        } catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Error en el formato de los datos: " + nfe.getMessage());
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void comboTipoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoContratoActionPerformed

    private void comboDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDepartamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDepartamentosActionPerformed

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

    private void txtFechaTfijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaTfijoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaTfijoActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<compuworkhr.logica.Departamento> comboDepartamentos;
    private javax.swing.JComboBox<String> comboTipoContrato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNombreModulo;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblDepartamento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JFormattedTextField txtFechaTfijo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables

    private void cargarDepartamentos() {
        comboDepartamentos.removeAllItems();
        for (Departamento dept : departamentoControlador.getAllDepartamentos()){
            comboDepartamentos.addItem(dept);
                if (dept.getEmpleados().contains(empleadoSeleccionado)) {
                    comboDepartamentos.setSelectedItem(dept);
                }
        }
        
    }
}
