/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoAdatos;

import java.sql.Connection;

/**
 *
 * @author mariana
 */
public class PedidoProductoData {
     private Connection con = null;

    public PedidoProductoData() {
        con = Conexion.conectarse();
    }
    
    

    
}
