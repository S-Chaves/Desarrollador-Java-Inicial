/* package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        Persona persona = new Persona();

        leerPersona(persona);
        while (!persona.getNombre().equals("0")) {
            personas.add(persona);
            persona = new Persona();
            leerPersona(persona);
        }

        for (Persona per : personas) {
            System.out.println(per);
        }
    }

    public static void leerPersona(Persona p) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el nombre o 0 para terminar: ");
        p.setNombre(scan.next());
        System.out.print("Ingrese el apellido: ");
        p.setApellido(scan.next());
        p.setFechaNacimiento(LocalDate.now());
    }
}
 */