package Clase7;

public class ResultadoNegativoException extends Exception {
    private final float result;
    public ResultadoNegativoException (float result) {
        this.result = result;
    }
}
