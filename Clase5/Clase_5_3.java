package Clase5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Clase_5_3 {
    public static void main(String[] args) throws IOException {
        String oper = args[0]; // code y decode
        int cantDes = Integer.parseInt(args[1]);
        Path archEntrada = Paths.get(args[2]);
        Path archSalida = Paths.get(args[3]);

        String codigo = Files.readString(archEntrada);
        String codFinal = desplazarStr(codigo, oper, cantDes);

        if (!Files.exists(archSalida)) {
            Files.createFile(archSalida);
        }
        Files.write(archSalida, codFinal.getBytes());
        System.out.println("Codigo procesado correctamente!");
    }

    private static String desplazarStr(String str, String oper, int cant) {
        String abecedario = "abcdefghijklmnopqrstuvwxyz ";
        String desplazado = "";
        int abcLen = abecedario.length();
        int strLen = str.length();

        if (oper.equals("code")) {
            for (int i = 0; i < strLen; i++) {
                int charIndex = abecedario.indexOf(str.charAt(i)) + cant;
                while (charIndex > abcLen - 1) {
                    charIndex -= 27;
                }
                desplazado += abecedario.charAt(charIndex);
            }
        } else if (oper.equals("decode")) {
            for (int i = 0; i < strLen; i++) {
                int charIndex = abecedario.indexOf(str.charAt(i)) - cant;
                while (charIndex < 0) {
                    charIndex += 27;
                }
                desplazado += abecedario.charAt(charIndex);
            }
        } else {
            System.out.println("Ingrese una operacion valida (code o decode).");
        }

        return desplazado;
    }
}
