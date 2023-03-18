package Clase6;

public class DescuentoPorcentajeConTope extends DescuentoPorcentaje {
    private int tope = 0;
    public DescuentoPorcentajeConTope(float valor, int tope) {
        super(valor);
        this.tope = tope;
    }

    public float valorFinal(float valorIni) {
        float porcentaje = this.getValor() * valorIni;
        if (porcentaje > this.tope) {
            return valorIni - this.tope;
        }
        return valorIni - porcentaje;
    }
}
