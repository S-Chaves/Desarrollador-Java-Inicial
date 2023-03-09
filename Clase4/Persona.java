package Clase4;

import java.time.LocalDateTime;

public class Persona {
    public String nombre;
    public String apellido;
    public LocalDateTime fechaNacimiento;

    public Persona(String nombre, String apellido, LocalDateTime fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int obtenerEdad() {
        return LocalDateTime.now().getYear() - this.fechaNacimiento.getYear();
    }
}
