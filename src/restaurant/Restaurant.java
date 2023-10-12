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
        MesaData mesa = new MesaData();

        //mesa.agregarMesa(m1);
        //mesa.agregarMesa(m2);
        // mesa.ocuparMesa(1);
        //mesa.liberarMesa(1);
        //mesa.cambiarCapacidad(1, 6);
        //mesa.quitarMesa(1);
        //System.out.println(mesa.mesasLibres());
        
        //Producto pr1 = new Producto(1, "coca", 1, 500, true);
        //Producto p2 = new Producto(2, "sprite", 1, 500, true);
        Producto p3 = new Producto(3, "hamburguesa", 10, 1000, true);
        ProductoData pd = new ProductoData();

        //pd.agregarProducto(p3);
//        pd.modificarProducto(p2);
//        System.out.println(pd.listarProducto());
        //pd.eliminarProducto("sprite");
        
       // System.out.println(pd.consultarStock(p2));
      Pedido p = new Pedido(m1, "Carlos", LocalDate.now(ZoneId.systemDefault()));
      PedidoData pedData= new PedidoData();
//      pedData.iniciarPedido(p);
//       pd.agregarProducto(p1);
//       pd.agregarProducto(p3);
        //PedidoProducto pdProd= new PedidoProducto (p3, p, 5);
        
       // pedData.calcularImporte(3);
       
    Pedido p1 = new Pedido(m2, "Pepe", LocalDate.now(ZoneId.systemDefault()));
    //
       // System.out.println(pedData.pedidoXIdMesa(m2));
    //pedData.iniciarPedido(p);
    
PedidoProducto pdProd= new PedidoProducto (p3, p1, 1);
PedidoProductoData ppd = new PedidoProductoData();
ppd.iniciarPedidoProducto(pdProd);
       
    }

}
