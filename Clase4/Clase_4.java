package Clase4;

import java.time.LocalDateTime;

public class Clase_4 {
    public static void main(String[] args) {
        // Instancio una persona
        Persona persona1 = new Persona("Pedro", "Gomez", LocalDateTime.now());

        // Instancio productos
        Producto producto1 = new Producto("jabón en polvo", "342342", 40);
        Producto producto2 = new Producto("esponjas", "35261", 10);
        Producto producto3 = new Producto("chocolates", "826952", 100);

        // Instancio nuevo carrito
        Carrito carrito = new Carrito(persona1);

        // Agrego los productos al carrito
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);

        // Muestro el valor del carrito
        System.out.println(carrito.precio());
    }
}
