package Clase6;

public class Producto {
    public String nombre;
    public String codigo;
    public float precio;

    public Producto(String nombre, String codigo, float precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public float costoFinal(int cuotas) {
        return precio / cuotas;
    }
}
