package edu.ramirezDaniel.endes;

import edu.ramirezDaniel.endes.entities.Alumno;

/**
 * Clase principal de pruebas para el proyecto Practica2-ENDES.
 * Se encarga de verificar el correcto funcionamiento de la clase Alumno,
 * incluyendo sus constructores, encapsulación y métodos estáticos.
 * * @author Daniel Ramírez
 */
public class Main {

    /**
     * Punto de entrada principal de la aplicación.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {

        // 1. Prueba del Constructor por defecto y Setters (Encapsulación)
        Alumno a1 = new Alumno();
        a1.setNombre("Daniel");
        a1.setApellidos("Ramírez");
        a1.setEdad(19);
        a1.setNotaMedia(8.5);

        // 2. Prueba del Constructor completo (8 atributos)
        Alumno a2 = new Alumno(2, "Juan", "Pérez", 17, "juan@gmail.com", "DAW", 4.0, true);

        // 3. Demostración de Getters (Acceso a datos privados)
        System.out.println("--- DATOS DE LOS ALUMNOS ---");
        System.out.println("Alumno 1: " + a1.getNombre() + " " + a1.getApellidos() + " - Nota: " + a1.getNotaMedia());
        System.out.println("Alumno 2: " + a2.getNombre() + " " + a2.getApellidos() + " - Nota: " + a2.getNotaMedia());

        // 4. Pruebas de los Métodos Estáticos (Lógica de negocio)
        System.out.println("\n--- PRUEBAS DE MÉTODOS ESTÁTICOS ---");

        // Comprobación de mayoría de edad
        System.out.println("¿Es " + a1.getNombre() + " mayor de edad?: " + Alumno.esMayorDeEdad(a1.getEdad()));
        System.out.println("¿Es " + a2.getNombre() + " mayor de edad?: " + Alumno.esMayorDeEdad(a2.getEdad()));

        // Obtención de calificación cualitativa
        System.out.println("Calificación de " + a1.getNombre() + ": " + Alumno.obtenerCalificacionTexto(a1.getNotaMedia()));
        System.out.println("Calificación de " + a2.getNombre() + ": " + Alumno.obtenerCalificacionTexto(a2.getNotaMedia()));
    }
}