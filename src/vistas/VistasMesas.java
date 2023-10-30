package vistas;

import accesoAdatos.MesaData;
import entidades.Mesa;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VistasMesas extends javax.swing.JInternalFrame {

    private MesaData md = new MesaData();
    private Mesa m = null;
   FondoPanel fondo = new FondoPanel();
    public VistasMesas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        jbSalir = new javax.swing.JButton();
        jbAgregarYActualizar = new javax.swing.JButton();
        jtNumMesa = new javax.swing.JTextField();
        jtCapacidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlMesas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 400));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbSalir.setText("Salir");
        jbSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(153, 255, 255)));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 580, 81, -1));

        jbAgregarYActualizar.setText("Agregar/Actualizar");
        jbAgregarYActualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(153, 255, 255)));
        jbAgregarYActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarYActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAgregarYActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 110, -1));
        jPanel1.add(jtNumMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 121, -1));
        jPanel1.add(jtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 121, -1));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("N° de Mesa:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 199, -1));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Capacidad de asientos:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, 211, -1));

        jlMesas.setBackground(new java.awt.Color(204, 204, 204));
        jlMesas.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jlMesas.setForeground(new java.awt.Color(255, 255, 255));
        jlMesas.setText("              Mesas");
        jPanel1.add(jlMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 410, 130));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/mesa2.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbAgregarYActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarYActualizarActionPerformed

        try {
            Integer numMesa = Integer.parseInt(jtNumMesa.getText());
            Integer capacidad = Integer.parseInt(jtCapacidad.getText());
         
            Mesa m1 = md.buscarMesaPorNumero(numMesa);

            if (m == null) {
                m = new Mesa(numMesa, capacidad);
                md.agregarMesa(m);
                
                limpiar();
            } else {
                if (m.getCapacidad() == capacidad) {
                    JOptionPane.showMessageDialog(this, "La capacidad ingresada es la actual");
                    limpiar();
                    
                } else {
                    m.setCapacidad(capacidad);
                    md.cambiarCapacidad(numMesa, capacidad);
                    limpiar();
                }
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Los campos necesitan ser completados con valores numéricos");
        }
    }//GEN-LAST:event_jbAgregarYActualizarActionPerformed

    public void limpiar() {
        jtNumMesa.setText("");
        jtCapacidad.setText("");
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAgregarYActualizar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlMesas;
    private javax.swing.JTextField jtCapacidad;
    private javax.swing.JTextField jtNumMesa;
    // End of variables declaration//GEN-END:variables




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
