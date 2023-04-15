package org.example;

import java.sql.*;
public class Main {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/databaseprueba","user457","password457");
            Statement stmt = conn.createStatement();
            ResultSet rs = null;

            stmt.executeUpdate("INSERT INTO " +
                    "empleado (id, dni, nombre, apellido, nacionalidad, departamento_fk) VALUES\n" +
                    "(NULL, '24783534', 'Juan', 'Perez', 'Argentina', 2),\n" +
                    "(NULL, '30245173', 'Carlos', 'Gomez', 'Colombia', 4);");

            stmt.executeUpdate("UPDATE empleado\n" +
                    "SET nacionalidad = 'Uruguay'\n" +
                    "WHERE id = 1;");

            stmt.executeUpdate("DELETE FROM departamento\n" +
                    "WHERE id = 3;");

            rs = stmt.executeQuery("SELECT * FROM empleado\n" +
                    "WHERE departamento_fk = (SELECT id FROM departamento WHERE nombre = 'Logistica');");
            printResSet(rs);

            System.out.println();
            rs = stmt.executeQuery("SELECT * FROM departamento\n" +
                    "ORDER BY nombre;");
            printResSet(rs);

            stmt.close();
            rs.close();
            conn.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    static void printResSet(ResultSet rs) {
        try {
            while(rs.next()) {
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}