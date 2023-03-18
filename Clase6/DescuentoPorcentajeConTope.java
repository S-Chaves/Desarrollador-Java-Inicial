package Clase6;

public class DescuentoPorcentajeConTope extends DescuentoPorcentaje {
    private int tope = 0;
    public DescuentoPorcentajeConTope(float valor, int tope) {
        super(valor);
        this.tope = tope;
    }
}
