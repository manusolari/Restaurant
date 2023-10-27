/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import accesoAdatos.MesaData;
import accesoAdatos.PedidoData;
import entidades.Mesa;
import entidades.Pedido;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EXO
 */
public class VistasEstadoDePedidos extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    public boolean isCellEditable(int f, int c) {
        return false;
    }
    PedidoData pd = new PedidoData();

    public VistasEstadoDePedidos() {
        initComponents();
        armarCabecera();
        llenarCombo1();
        llenarCombo2();
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        Grupo1 = new javax.swing.ButtonGroup();
        Grupo2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jRBPedidosCobrados = new javax.swing.JRadioButton();
        jRBPedidosXcobrar = new javax.swing.JRadioButton();
        jRBnumMesa = new javax.swing.JRadioButton();
        jRBMesero = new javax.swing.JRadioButton();
        jCBMesa = new javax.swing.JComboBox<>();
        jCBMesero = new javax.swing.JComboBox<>();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Estado de Pedidos");

        jTablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTablePedidos);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Grupo1.add(jRBPedidosCobrados);
        jRBPedidosCobrados.setText("Pedidos Cobrados");
        jRBPedidosCobrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBPedidosCobradosActionPerformed(evt);
            }
        });

        Grupo1.add(jRBPedidosXcobrar);
        jRBPedidosXcobrar.setText("Pedidos por Cobrar");
        jRBPedidosXcobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBPedidosXcobrarActionPerformed(evt);
            }
        });

        Grupo2.add(jRBnumMesa);
        jRBnumMesa.setText("Buscar por numero de Mesa");

        Grupo2.add(jRBMesero);
        jRBMesero.setText("Buscar nombre de Mesero");

        jCBMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMesaActionPerformed(evt);
            }
        });

        jCBMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMeseroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRBPedidosCobrados)
                                    .addComponent(jRBnumMesa)
                                    .addComponent(jRBMesero))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jRBPedidosXcobrar)
                                        .addGap(0, 67, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jCBMesa, 0, 221, Short.MAX_VALUE)
                                            .addComponent(jCBMesero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(23, 23, 23))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel1)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBPedidosCobrados)
                    .addComponent(jRBPedidosXcobrar))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRBnumMesa)
                    .addComponent(jCBMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBMesero)
                    .addComponent(jCBMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRBPedidosCobradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBPedidosCobradosActionPerformed
        // TODO add your handling code here:borrarFilas();
        borrarFilas();
        ArrayList<Pedido> lista = new ArrayList<>();
        lista = pd.buscarPedidosCobrados();
        for (Pedido p : lista) {
            modelo.addRow(new Object[]{p.getIdPedido(), p.getMesa().getIdMesa(), p.getImporte(), p.isCobrada(), p.getFechaHora(), p.getNombreMesero()});
        }
    }//GEN-LAST:event_jRBPedidosCobradosActionPerformed

    private void jRBPedidosXcobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBPedidosXcobrarActionPerformed
        borrarFilas();
        ArrayList<Pedido> lista = new ArrayList<>();
        lista = pd.buscarPedidosPorCobrar();
        for (Pedido p : lista) {
            modelo.addRow(new Object[]{p.getIdPedido(), p.getMesa().getIdMesa(), p.getImporte(), p.isCobrada(), p.getFechaHora(), p.getNombreMesero()});
        }
    }//GEN-LAST:event_jRBPedidosXcobrarActionPerformed

    private void jCBMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMesaActionPerformed
        try{
        Mesa ms = (Mesa) jCBMesa.getSelectedItem();
        int numeroMesa= ms.getNumeroMesa();
        if(jRBnumMesa.isSelected()){
            if (jRBPedidosCobrados.isSelected()) {
                borrarFilas();
                ArrayList<Pedido> lista = new ArrayList<>();
                lista = pd.buscarPedidosCobrados();

                for (Pedido p : lista) {

                    if (numeroMesa == p.getMesa().getNumeroMesa()) {
                 modelo.addRow(new Object[]{p.getIdPedido(), p.getMesa().getIdMesa(), p.getImporte(), p.isCobrada(), p.getFechaHora(), p.getNombreMesero()});   
                    }
                }
            }
            if (jRBPedidosXcobrar.isSelected()) {
                borrarFilas();
                ArrayList<Pedido> listaXcobrar = new ArrayList<>();
                listaXcobrar = pd.buscarPedidosPorCobrar();
                for (Pedido p : listaXcobrar) {

                    if (numeroMesa == p.getMesa().getNumeroMesa()) {
                 modelo.addRow(new Object[]{p.getIdPedido(), p.getMesa().getIdMesa(), p.getImporte(), p.isCobrada(), p.getFechaHora(), p.getNombreMesero()});   
                    }
                }
            }
        }
        }catch(NullPointerException nc){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una mesa");
        }
    }//GEN-LAST:event_jCBMesaActionPerformed

    private void jCBMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMeseroActionPerformed
        try{
        String mozoS =  (String) jCBMesero.getSelectedItem();
           
        if(jRBMesero.isSelected()){
            if (jRBPedidosCobrados.isSelected()) {
                borrarFilas();
                ArrayList<Pedido> lista = new ArrayList<>();
                lista = pd.buscarPedidosCobrados();
                for (Pedido p : lista) {
                    
                    if (mozoS == p.getNombreMesero()) {     
                    modelo.addRow(new Object[]{p.getIdPedido(), p.getMesa().getIdMesa(), p.getImporte(), p.isCobrada(), p.getFechaHora(), p.getNombreMesero()});   
                    }
                }
            }
            if (jRBPedidosXcobrar.isSelected()) {
                borrarFilas();
                ArrayList<Pedido> listaXcobrar = new ArrayList<>();
                listaXcobrar = pd.buscarPedidosPorCobrar();
                for (Pedido p : listaXcobrar) {
                    if (mozoS.equals(p.getNombreMesero())) {
                    modelo.addRow(new Object[]{p.getIdPedido(), p.getMesa().getIdMesa(), p.getImporte(), p.isCobrada(), p.getFechaHora(), p.getNombreMesero()});   
                    }
                }
            }
        }
        }catch(NullPointerException nc){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un mesero");
            
        }
    }//GEN-LAST:event_jCBMeseroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo1;
    private javax.swing.ButtonGroup Grupo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Mesa> jCBMesa;
    private javax.swing.JComboBox<String> jCBMesero;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRBMesero;
    private javax.swing.JRadioButton jRBPedidosCobrados;
    private javax.swing.JRadioButton jRBPedidosXcobrar;
    private javax.swing.JRadioButton jRBnumMesa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePedidos;
    // End of variables declaration//GEN-END:variables

    public void armarCabecera() {
        modelo.addColumn("IdPedido");
        modelo.addColumn("IdMesa");
        modelo.addColumn("Importe");
        modelo.addColumn("Cobrada");
        modelo.addColumn("fecha_hora");
        modelo.addColumn("nombreMesero");
        jTablePedidos.setModel(modelo);
    }

    public void borrarFilas() {
        int f = jTablePedidos.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void llenarCombo1() {
        MesaData md = new MesaData();
        jCBMesa.addItem(null);
        ArrayList<Mesa> lista = md.listarMesas();
        for (Mesa m : lista) {
            jCBMesa.addItem(m);
        }
    }

    private void llenarCombo2() {
        jCBMesero.addItem("");
       
        List<Pedido> lista = pd.listarPedido();
        
        HashSet<String> meseros = new HashSet<>();
        for (Pedido p : lista) {
            String mozo = p.getNombreMesero();
            meseros.add(mozo);
        }
        for (String mozo : meseros) {
            jCBMesero.addItem(mozo);
        }

    }

}
