package Clase5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Clase_5_2 {
    public static void main(String[] args) throws IOException {
        Path ruta = Paths.get(args[0]);
        String operacion = args[1];
        int total = 0;

        if (operacion.equals("suma")) {
            for (String linea : Files.readAllLines(ruta)) {
                total += Integer.parseInt(linea);
            }
            System.out.println("Total: " + total);
        } else if (operacion.equals("multi")) {
            total = 1;
            for (String linea : Files.readAllLines(ruta)) {
                total *= Integer.parseInt(linea);
            }
            System.out.println("Total: " + total);
        } else {
            System.out.println("Ingrese una operacion valida (suma o multi).");
        }
    }
}
