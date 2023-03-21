package Clase7;

public class DescuentoPorcentaje extends Descuento {
    public DescuentoPorcentaje(float valor) throws DescuentoCeroException {
        if (valor == 0) {
            throw new DescuentoCeroException(valor);
        }
        this.setValor(valor);
    }
    public float valorFinal(float valorIni) throws ResultadoNegativoException {
        float result = valorIni - (valorIni * this.getValor());
        if (result < 0) {
            throw new ResultadoNegativoException(result);
        }
        return result;
    }
}
