package Clase7;

public class DescuentoPorcentajeConTope extends DescuentoPorcentaje {
    private int tope = 0;
    public DescuentoPorcentajeConTope(float valor, int tope) throws DescuentoCeroException {
        super(valor);
        this.tope = tope;
    }

    public float valorFinal(float valorIni) throws ResultadoNegativoException{
        float porcentaje = this.getValor() * valorIni;
        float result;

        if (porcentaje > this.tope) {
            result = valorIni - this.tope;
        } else {
            result = valorIni - porcentaje;
        }

        if (result < 0) {
            throw new ResultadoNegativoException(result);
        }
        return result;
    }
}
