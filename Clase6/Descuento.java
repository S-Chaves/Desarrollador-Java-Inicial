package Clase6;

public abstract class Descuento {
    private float valor;

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public abstract float valorFinal(float valorIni);
}
