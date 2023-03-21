package Clase7;

public class DescuentoCeroException extends Exception{
    private final float valor;

    public DescuentoCeroException(float valor) {
        this.valor = valor;
    }
}
