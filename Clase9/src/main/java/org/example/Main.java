package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Main {
    public static void main(String[] args) {
        probar();
    }
    @Test
    static void probar() {
        assertEquals(240,  Calculadora.multiplicar(80, 3));
        assertEquals(110, Calculadora.dividir(
                Calculadora.sumar(150, 180), 3
        ));
        assertNotEquals(605, Calculadora.multiplicar(
                Calculadora.restar(90, 50), 15
        ));
        assertNotEquals(2700, Calculadora.multiplicar(
                Calculadora.sumar(70, 40), 25
        ));
    }
}