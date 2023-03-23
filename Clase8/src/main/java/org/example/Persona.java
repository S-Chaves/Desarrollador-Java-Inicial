package org.example;

import java.time.LocalDate;
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
    @Getter @Setter
    private String nombre, apellido;
    @Getter @Setter
    private LocalDate fechaNacimiento;
}
