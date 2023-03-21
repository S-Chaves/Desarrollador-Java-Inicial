package Clase7;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private int cantProd = 0;
    public Persona persona;
    public List<Producto> productos = new ArrayList<Producto>();
    public LocalDateTime fechaCompra;
    public Descuento descuento;
    public Carrito(Persona persona, Descuento descuento) {
        this.persona = persona;
        this.descuento = descuento;
        this.fechaCompra = LocalDateTime.now();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public float precio() throws ResultadoNegativoException {
        float sum = 0;
        for (Producto prod : this.productos) {
            sum += prod.precio;
        }
        return this.descuento.valorFinal(sum);
    }
}
