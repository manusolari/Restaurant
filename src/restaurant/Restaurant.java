package restaurant;

import accesoAdatos.MesaData;
import accesoAdatos.ProductoData;
import entidades.Mesa;
import entidades.Producto;

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
        
        Producto p1 = new Producto(1, "coca", 1, 500, true);
        Producto p2 = new Producto(2, "sprite", 1, 500, true);
        ProductoData pd = new ProductoData();

        //pd.agregarProducto(p1);
        //pd.modificarProducto(p2);
        //System.out.println(pd.listarProducto());
        //pd.eliminarProducto("sprite");
    }

}
