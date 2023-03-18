package Clase6;

public class DescuentoPorcentaje extends Descuento {
    public DescuentoPorcentaje(float valor) {
        this.setValor(valor);
    }
    public float valorFinal(float valorIni) {
        return valorIni - (valorIni * this.getValor());
    }
}
