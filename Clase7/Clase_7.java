package Clase7;

import java.time.LocalDateTime;

public class Clase_7 {
    public static void main(String[] args) throws DescuentoCeroException, ResultadoNegativoException {
        // Inicializo la persona
        Persona persona = new Persona("Juan", "Gomez", LocalDateTime.now());
        // Inicializo productos
        Producto[] productos = {
                new Producto("Pan", "342", 200),
                new Producto("Jabón", "743", 300),
                new Producto("Carne", "847", 500),
                new Producto("Fideos", "942", 150),
                new Producto("Arroz", "142", 250),
        };
        // Inicializo descuentos
        Descuento descuentoFijo = new DescuentoFijo(200);
        Descuento descuentoPorcentaje = new DescuentoPorcentaje(0.4f);
        Descuento descuentoPorcentajeConTope = new DescuentoPorcentajeConTope(0.3f, 150);

        // Inicializo carritos
        Carrito carrito1 = new Carrito(persona, descuentoFijo);
        Carrito carrito2 = new Carrito(persona, descuentoPorcentaje);
        Carrito carrito3 = new Carrito(persona, descuentoPorcentajeConTope);
        // Agrego los productos
        agregarProductos(carrito1, productos);
        agregarProductos(carrito2, productos);
        agregarProductos(carrito3, productos);

        // Imprimo el valor de los carritos
        System.out.println(carrito1.precio());
        System.out.println(carrito2.precio());
        System.out.println(carrito3.precio());
    }

    public static void agregarProductos(Carrito carr, Producto[] prods) {
        for (Producto prod : prods) {
            carr.agregarProducto(prod);
        }
    }
}
