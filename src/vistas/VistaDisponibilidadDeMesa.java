/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import accesoAdatos.MesaData;
import accesoAdatos.ProductoData;
import entidades.Mesa;
import entidades.Pedido;
import entidades.Producto;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EXO
 */
public class VistaDisponibilidadDeMesa extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaDisponibilidadDeMesa
     */
    private MesaData md = new MesaData();
    private DefaultTableModel modelo = new DefaultTableModel();
    FondoPanel fondo = new FondoPanel();
    public VistaDisponibilidadDeMesa() {
        initComponents();
        modelarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoMesas = new javax.swing.ButtonGroup();
        jPanel1 = new FondoPanel();
        radioMNoDisponible = new javax.swing.JRadioButton();
        radioMDisponible = new javax.swing.JRadioButton();
        radioMTodas = new javax.swing.JRadioButton();
        botonActivarB = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaM = new javax.swing.JTable();
        jtNumeroM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        radioMNoDisponible.setBackground(new java.awt.Color(204, 204, 204));
        GrupoMesas.add(radioMNoDisponible);
        radioMNoDisponible.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radioMNoDisponible.setForeground(new java.awt.Color(255, 255, 255));
        radioMNoDisponible.setText("Mesas no Disponibles");
        radioMNoDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMNoDisponibleActionPerformed(evt);
            }
        });

        radioMDisponible.setBackground(new java.awt.Color(204, 204, 204));
        GrupoMesas.add(radioMDisponible);
        radioMDisponible.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radioMDisponible.setForeground(new java.awt.Color(255, 255, 255));
        radioMDisponible.setText("Mesas Disponibles");
        radioMDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMDisponibleActionPerformed(evt);
            }
        });

        radioMTodas.setBackground(new java.awt.Color(204, 204, 204));
        GrupoMesas.add(radioMTodas);
        radioMTodas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radioMTodas.setForeground(new java.awt.Color(255, 255, 255));
        radioMTodas.setText("Todas las Mesas");
        radioMTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMTodasActionPerformed(evt);
            }
        });

        botonActivarB.setText("Activar Busqueda");
        botonActivarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActivarBActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtTablaM.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtTablaM);

        jtNumeroM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNumeroMActionPerformed(evt);
            }
        });
        jtNumeroM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNumeroMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNumeroMKeyTyped(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar Mesa por Numero :");

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listas de Mesas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addComponent(jtNumeroM, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioMNoDisponible)
                            .addComponent(radioMDisponible)
                            .addComponent(radioMTodas)
                            .addComponent(botonActivarB))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(radioMNoDisponible)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioMDisponible)
                .addGap(18, 18, 18)
                .addComponent(radioMTodas)
                .addGap(18, 18, 18)
                .addComponent(botonActivarB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNumeroM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void radioMNoDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMNoDisponibleActionPerformed
        activarBoton();
        llenarMesasOcupadas();
    }//GEN-LAST:event_radioMNoDisponibleActionPerformed

    private void radioMDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMDisponibleActionPerformed
        activarBoton();
        llenarMesasLibres();
    }//GEN-LAST:event_radioMDisponibleActionPerformed

    private void radioMTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMTodasActionPerformed
        activarBoton();
        llenarMesasTodas();
    }//GEN-LAST:event_radioMTodasActionPerformed

    private void botonActivarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActivarBActionPerformed
        limpiarTabla();
       GrupoMesas.clearSelection();
        jtNumeroM.setEnabled(true);
        jtNumeroM.setText("");


    }//GEN-LAST:event_botonActivarBActionPerformed

    private void jtNumeroMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNumeroMKeyTyped
        char letra = evt.getKeyChar();
        if (!Character.isDigit(letra)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtNumeroMKeyTyped

    private void jtNumeroMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNumeroMActionPerformed
        
    }//GEN-LAST:event_jtNumeroMActionPerformed

    private void jtNumeroMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNumeroMKeyReleased
      limpiarTabla();
        Mesa m;

        try {
            System.out.println(m = md.buscarMesaPorNumero(Integer.parseInt(jtNumeroM.getText())));

            if (m.getNumeroMesa() == (Integer.parseInt(jtNumeroM.getText()))) {
                String estado;
                if (m.isEstadoMesa()) {
                    estado = "Activo";
                } else {
                    estado = "Inactivo";
                }
                modelo.addRow(new Object[]{m.getIdMesa(), m.getNumeroMesa(), m.getCapacidad(), estado});
                return;
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Recuerde Eliminar los Espacios, solo Numeros");
        }
    }//GEN-LAST:event_jtNumeroMKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoMesas;
    private javax.swing.JButton botonActivarB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtNumeroM;
    private javax.swing.JTable jtTablaM;
    private javax.swing.JRadioButton radioMDisponible;
    private javax.swing.JRadioButton radioMNoDisponible;
    private javax.swing.JRadioButton radioMTodas;
    // End of variables declaration//GEN-END:variables

    public void limpiarTabla() {
        int f = jtTablaM.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    public void modelarTabla() {
        modelo.addColumn("ID Mesa");
        modelo.addColumn("Numero de Mesa");
        modelo.addColumn("Capacidad");
        modelo.addColumn("Estado de Mesa");
        jtTablaM.setModel(modelo);
    }

    private void llenarMesasTodas() {
        limpiarTabla();
        List<Mesa> listaTodas = md.listarMesas();
        for (Mesa m : listaTodas) {
            String estado;
            if (m.isEstadoMesa()) {
                estado = "Activo";
            } else {
                estado = "Inactivo";
            }
            modelo.addRow(new Object[]{m.getIdMesa(), m.getNumeroMesa(), m.getCapacidad(), estado});
        }
    }

    private void llenarMesasLibres() {
        limpiarTabla();
        List<Mesa> listaTodas = md.mesasLibres();
        for (Mesa m : listaTodas) {
            String estado;
            if (m.isEstadoMesa()) {
                estado = "Activo";
            } else {
                estado = "Inactivo";
            }
            modelo.addRow(new Object[]{m.getIdMesa(), m.getNumeroMesa(), m.getCapacidad(), estado});
        }
    }

    private void llenarMesasOcupadas() {
        limpiarTabla();
        List<Mesa> listaTodas = md.mesasOcupadas();
        for (Mesa m : listaTodas) {
            String estado;
            if (m.isEstadoMesa()) {
                estado = "Activo";
            } else {
                estado = "Inactivo";
            }
            modelo.addRow(new Object[]{m.getIdMesa(), m.getNumeroMesa(), m.getCapacidad(), estado});
        }
    }

    private void activarBoton() {
        if (radioMDisponible.isSelected() || radioMNoDisponible.isSelected() || radioMTodas.isSelected()) {
            jtNumeroM.setEnabled(false);
        } else {
            jtNumeroM.setEnabled(true);
        }

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
