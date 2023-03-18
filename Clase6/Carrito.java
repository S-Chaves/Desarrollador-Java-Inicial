package Clase6;

import java.time.LocalDateTime;

public class Carrito {
    private int maxProd = 3;
    private int cantProd = 0;
    public Persona persona;
    public Producto productos[] = new Producto[maxProd];
    public LocalDateTime fechaCompra;
    public Descuento descuento = new DescuentoFijo(0);
    public Carrito(Persona persona, Descuento descuento) {
        this.persona = persona;
        this.descuento = descuento;
        this.fechaCompra = LocalDateTime.now();
    }
    public Carrito(Persona persona) {
        this.persona = persona;
        this.fechaCompra = LocalDateTime.now();
    }

    public void agregarProducto(Producto producto) {
        if (this.cantProd < this.maxProd) {
            this.productos[this.cantProd] = producto;
            cantProd++;
        }
    }

    public float precio() {
        float sum = 0;
        for (int i = 0; i < this.cantProd; i++) {
            sum += this.productos[i].precio;
        }
        return this.descuento.valorFinal(sum);
    }
}
