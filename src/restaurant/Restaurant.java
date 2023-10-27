package restaurant;

import accesoAdatos.MesaData;
import accesoAdatos.PedidoData;
import accesoAdatos.PedidoProductoData;
import accesoAdatos.ProductoData;
import entidades.Mesa;
import entidades.Pedido;
import entidades.PedidoProducto;
import entidades.Producto;
import java.time.LocalDate;
import java.time.ZoneId;

public class Restaurant {

    public static void main(String[] args) {

        Mesa m1 = new Mesa(1, 4, true);
        Mesa m2 = new Mesa(2, 6, true);
        Mesa m5 = new Mesa(7, 5, true);
        MesaData mesa = new MesaData();

        //mesa.agregarMesa(m5);
        //mesa.agregarMesa(m2);
        // mesa.ocuparMesa(1);
        //mesa.liberarMesa(1);
        //mesa.cambiarCapacidad(1, 6);
        //mesa.quitarMesa(1);
        //System.out.println(mesa.mesasLibres());
        
//       Producto p1 = new Producto(1, "coca", 1, 500, true);
//        Producto p2 = new Producto(2, "sprite", 1, 500, true);
//        Producto p3 = new Producto(3, "hamburguesa", 10, 1000, true);
        ProductoData pd = new ProductoData();
    
        //pd.agregarProducto(p2);
//        pd.modificarProducto(p2);
//        System.out.println(pd.listarProducto());
        //pd.eliminarProducto("sprite");
        
       // System.out.println(pd.consultarStock(p2));
      Pedido p = new Pedido(m1, "Carlos", LocalDate.now(ZoneId.systemDefault()));
      Pedido p23 = new Pedido(m5, "Melquiades", LocalDate.now(ZoneId.systemDefault()));
      
      PedidoData pedData= new PedidoData();
      //pedData.iniciarPedido(p23);
      //pd.agregarProducto(p1);
      //pd.agregarProducto(p3);
       //PedidoProducto pdProd= new PedidoProducto (p3, p, 5);
        
       // pedData.calcularImporte(3);
       
    Pedido ped1 = new Pedido(m2, "Pepe", LocalDate.now(ZoneId.systemDefault()));
    
    //
      // System.out.println(pedData.pedidoXIdMesa(m2));
   // pedData.iniciarPedido(p);
   //pedData.iniciarPedido(p);
//PedidoProducto pdProd= new PedidoProducto (p2, p23, 1);
//PedidoProducto pdProd1= new PedidoProducto (p3, p23, 1);
PedidoProductoData ppd = new PedidoProductoData();
    //ppd.iniciarPedidoProducto(pdProd1);
        //System.out.println(mesa.buscarMesaPorNumero(1));
        
        //System.out.println( pedData.calcularImporte(7));
        //pedData.listaXMesero("Melquiades");
        
      Producto p7= new Producto(9,"Cerveza", 10, 1000, true);
      //pd.agregarProducto(p7);
      Mesa m6= new Mesa(4, 6, true);
      //mesa.agregarMesa(m6);
      Pedido ped = new Pedido(19, m6, "Pepe",LocalDate.now(ZoneId.systemDefault()), 0, false);
      //pedData.iniciarPedido(ped);
      PedidoProducto pdProd= new PedidoProducto (p7, ped, 2);
      
     // ppd.iniciarPedidoProducto(pdProd);
      //----------Prueba de listar pedidos por id-------------
        //System.out.println( ppd.listarPedidoProductoXPedido(7));
        //System.out.println(pd.listarProducto());
        //System.out.println(mesa.buscarMesaPorNumero(8));
        //System.out.println(mesa.buscarMesaPorId());
        //mesa.agregarMesa(m6);
//------------------------ por fecha ------------------------------
//        System.out.println( pedData.listarPedidosXFecha(LocalDate.of(2023, 10, 10), LocalDate.of(2023, 10, 19)));
    System.out.println(pedData.buscarPedidoXid(16));

    }

}
