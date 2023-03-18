package Clase6;

public class DescuentoFijo extends Descuento {
    public DescuentoFijo(float valor) {
        this.setValor(valor);
    }

    public float valorFinal(float valorIni) {
        return valorIni - this.getValor();
    }
}
