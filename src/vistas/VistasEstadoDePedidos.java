/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import accesoAdatos.MesaData;
import accesoAdatos.PedidoData;
import entidades.Mesa;
import entidades.Pedido;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
/**
 *
 * @author EXO
 */
public class VistasEstadoDePedidos extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    FondoPanel fondo = new FondoPanel();
    public boolean isCellEditable(int f, int c) {
        return false;
    }
    PedidoData pd = new PedidoData();

    public VistasEstadoDePedidos() {
        initComponents();
       
        armarCabecera();
        llenarCombo1();
        llenarCombo2();
     //this.setContentPane(fondo);
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
        jPanel1 = new FondoPanel();
        jLabel1 = new javax.swing.JLabel();
        jRBPedidosXcobrar = new javax.swing.JRadioButton();
        jRBPedidosCobrados = new javax.swing.JRadioButton();
        jRBnumMesa = new javax.swing.JRadioButton();
        jRBMesero = new javax.swing.JRadioButton();
        jCBMesa = new javax.swing.JComboBox<>();
        jCBMesero = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estado de Pedidos");

        jRBPedidosXcobrar.setBackground(new java.awt.Color(204, 204, 204));
        Grupo1.add(jRBPedidosXcobrar);
        jRBPedidosXcobrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRBPedidosXcobrar.setForeground(new java.awt.Color(255, 255, 255));
        jRBPedidosXcobrar.setText("Pedidos por Cobrar");
        jRBPedidosXcobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBPedidosXcobrarActionPerformed(evt);
            }
        });

        jRBPedidosCobrados.setBackground(new java.awt.Color(204, 204, 204));
        Grupo1.add(jRBPedidosCobrados);
        jRBPedidosCobrados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRBPedidosCobrados.setForeground(new java.awt.Color(255, 255, 255));
        jRBPedidosCobrados.setText("Pedidos Cobrados");
        jRBPedidosCobrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBPedidosCobradosActionPerformed(evt);
            }
        });

        jRBnumMesa.setBackground(new java.awt.Color(204, 204, 204));
        Grupo2.add(jRBnumMesa);
        jRBnumMesa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRBnumMesa.setForeground(new java.awt.Color(255, 255, 255));
        jRBnumMesa.setText("Buscar por numero de Mesa");
        jRBnumMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBnumMesaActionPerformed(evt);
            }
        });

        jRBMesero.setBackground(new java.awt.Color(204, 204, 204));
        Grupo2.add(jRBMesero);
        jRBMesero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRBMesero.setForeground(new java.awt.Color(255, 255, 255));
        jRBMesero.setText("Buscar nombre de Mesero");
        jRBMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBMeseroActionPerformed(evt);
            }
        });

        jCBMesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBMesaMouseClicked(evt);
            }
        });
        jCBMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMesaActionPerformed(evt);
            }
        });

        jCBMesero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBMeseroMouseClicked(evt);
            }
        });
        jCBMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMeseroActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jRBPedidosCobrados))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBnumMesa)
                            .addComponent(jRBMesero))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRBPedidosXcobrar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCBMesa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jCBMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(400, 400, 400))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(246, 246, 246))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBPedidosCobrados)
                    .addComponent(jRBPedidosXcobrar))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBnumMesa)
                    .addComponent(jCBMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBMesero)
                    .addComponent(jCBMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRBPedidosCobradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBPedidosCobradosActionPerformed
        // TODO add your handling code here:borrarFilas();
        borrarFilas();
        activarCampos();
        ArrayList<Pedido> lista = new ArrayList<>();
        lista = pd.buscarPedidosCobrados();
        for (Pedido p : lista) {
         String estado;
            if (p.isCobrada()) {
                estado = "Cobrada";
            } else {
                estado = "No Cobrada";
            }
            modelo.addRow(new Object[]{p.getIdPedido(), p.getMesa().getIdMesa(), p.getImporte(), estado, p.getFechaHora(), p.getNombreMesero()});
        }
    }//GEN-LAST:event_jRBPedidosCobradosActionPerformed

    private void jRBPedidosXcobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBPedidosXcobrarActionPerformed
        borrarFilas();
         activarCampos();
        ArrayList<Pedido> lista = new ArrayList<>();
        lista = pd.buscarPedidosPorCobrar();
        for (Pedido p : lista) {
            String estado;
            if (p.isCobrada()) {
                estado = "Cobrada";
            } else {
                estado = "No Cobrada";
            }
            modelo.addRow(new Object[]{p.getIdPedido(), p.getMesa().getIdMesa(), p.getImporte(), estado, p.getFechaHora(), p.getNombreMesero()});
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
//        else
//        {
//            JOptionPane.showMessageDialog(this, " Debe seleccionar si es un Pedido Cobrado o Pedido por Cobrado ");
//        }
        }catch(NullPointerException nc){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un mesero");
            
        }
    }//GEN-LAST:event_jCBMeseroActionPerformed

    private void jRBnumMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBnumMesaActionPerformed
       if(!jRBPedidosCobrados.isSelected() && !jRBPedidosXcobrar.isSelected()){
       JOptionPane.showMessageDialog(this, " Debe seleccionar si es un Pedido Cobrado o Pedido por Cobrado ");
       
       jCBMesa.setSelectedIndex(-1);
       
       jCBMesero.setSelectedIndex(-1);
       DesactivarCampos();
       }
    }//GEN-LAST:event_jRBnumMesaActionPerformed

    private void jRBMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBMeseroActionPerformed
        if (!jRBPedidosCobrados.isSelected() && !jRBPedidosXcobrar.isSelected()) {
            JOptionPane.showMessageDialog(this, " Debe seleccionar si es un Pedido Cobrado o Pedido por Cobrado ");
            DesactivarCampos();
            jCBMesa.setSelectedIndex(-1);
            jCBMesero.setSelectedIndex(-1);
        
        }
    }//GEN-LAST:event_jRBMeseroActionPerformed

    private void jCBMesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBMesaMouseClicked
        if(!jRBnumMesa.isSelected()){
        JOptionPane.showMessageDialog(this, " Debe seleccionar si es un Pedido Cobrado o Pedido por Cobrado ");
        jCBMesa.setSelectedIndex(-1);
            jCBMesero.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_jCBMesaMouseClicked

    private void jCBMeseroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBMeseroMouseClicked
      if(!jRBMesero.isSelected()){
        JOptionPane.showMessageDialog(this, " Debe seleccionar si es un Pedido Cobrado o Pedido por Cobrado ");
        jCBMesa.setSelectedIndex(-1);
            jCBMesero.setSelectedIndex(-1);
        }
        
    }//GEN-LAST:event_jCBMeseroMouseClicked


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
    private javax.swing.JPanel jPanel1;
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
 public void activarCampos(){
       
         jRBnumMesa.setEnabled(true);
         jRBMesero.setEnabled(true);
         jCBMesa.setEnabled(true);
         jCBMesero.setEnabled(true);
               
        
    
 }
 public void DesactivarCampos(){
    
         jRBnumMesa.setEnabled(false);
         jRBMesero.setEnabled(false);
         jCBMesa.setEnabled(false);
         jCBMesero.setEnabled(false);
         
    
    
 }
    class FondoPanel extends JPanel
    {
    private  Image imagen;
    
    @Override
    public void paint(Graphics g)
    {
     imagen = new ImageIcon(getClass().getResource("/Img/imag-interF.jpg")).getImage();
    
     g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
    setOpaque(false);
    super.paint(g);
    }
    
    }
 
}
