public class Clase_1 {
    public static void main(String[] args) {
        // 1.
        int numeroInicio = 5;
        int numeroFin = 14;
        boolean tipoNum = false;

        function1a(numeroInicio, numeroFin);
        function1b(numeroInicio, numeroFin);
        function1c(numeroInicio, numeroFin, tipoNum);
        function1d(numeroInicio, numeroFin);

        // 2.
        float ingMensuales = 500000;
        int cantAutoMenor5 = 3;
        int cantInmu = 5;
        boolean tieneEmbar = false;
        boolean tieneAero = true;
        boolean tituActivo = true;

        if ((ingMensuales >= 489083) &&
                (cantAutoMenor5 >= 3) &&
                (cantInmu >= 3) &&
                (tieneEmbar || tieneAero || tituActivo)) {
            System.out.println("Pertenece al segmento de altos ingresos.");
        } else {
            System.out.println("No pertenece al segmento de altos ingresos.");
        }
    }

    // a)
    static void function1a(int num1, int num2) {
        while (num1 <= num2) {
            System.out.println(num1);
            num1++;
        }
        System.out.println();
    }

    // b)
    static void function1b(int num1, int num2) {
        if (num1 % 2 != 0) num1++;
        while (num1 <= num2) {
            System.out.println(num1);
            num1 += 2;
        }
        System.out.println();
    }

    // c)
    static void function1c(int num1, int num2, boolean tipoNum) {
        // True = par, False = impar
        if (tipoNum) {
            if (num1 % 2 != 0) num1++;
        } else {
            if (num1 % 2 == 0) num1++;
        }

        while (num1 <= num2) {
            System.out.println(num1);
            num1 += 2;
        }
        System.out.println();
    }

    //d
    static void function1d(int num1, int num2) {
        if (num2 % 2 != 0) num2--;
        for (int i = num2; i >= num1; i -= 2) {
            System.out.println(i);
        }
        System.out.println();
    }
}