package edu.ramirezDaniel.endes;

import edu.ramirezDaniel.endes.entities.Alumno;

/**
 * Clase principal de pruebas para el proyecto Practica2-ENDES.
 * Se encarga de verificar el correcto funcionamiento de la clase Alumno.
 *
 * @author Daniel Ramírez
 */
public class Main {

    /**
     * Punto de entrada principal de la aplicación.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {

        // 1. Uso del constructor por defecto y todos los setters
        Alumno a1 = new Alumno();
        a1.setId(1);
        a1.setNombre("Daniel");
        a1.setApellidos("Ramírez");
        a1.setEdad(19);
        a1.setEmail("dani@gmail.com");
        a1.setCurso("DAW");
        a1.setNotaMedia(8.5);
        a1.setRepetidor(false);

        // 2. Uso del constructor completo
        Alumno a2 = new Alumno(2, "Juan", "Pérez", 17, "juan@gmail.com", "DAW", 4.0, true);

        // 3. Impresión de datos (Esto activa todos los Getters)
        System.out.println("--- LISTADO DE ALUMNOS ---");
        System.out.println("ID: " + a1.getId() + " | Alumno: " + a1.getNombre() + " " + a1.getApellidos());
        System.out.println("Edad: " + a1.getEdad() + " | Email: " + a1.getEmail());
        System.out.println("Curso: " + a1.getCurso() + " | Nota: " + a1.getNotaMedia());
        System.out.println("Estado repetidor: " + a1.isRepetidor());

        // 4. Pruebas de lógica para cubrir todos los casos de las notas
        System.out.println("\n--- VALIDACIÓN DE CALIFICACIONES ---");
        System.out.println("Nota 9.5 -> " + Alumno.obtenerCalificacionTexto(9.5));
        System.out.println("Nota 7.5 -> " + Alumno.obtenerCalificacionTexto(7.5));
        System.out.println("Nota 5.5 -> " + Alumno.obtenerCalificacionTexto(5.5));
        System.out.println("Nota 3.0 -> " + Alumno.obtenerCalificacionTexto(3.0));

        // 5. Pruebas de mayoría de edad
        System.out.println("\n--- VALIDACIÓN DE EDAD ---");
        System.out.println("¿Es " + a1.getNombre() + " mayor de edad?: " + Alumno.esMayorDeEdad(a1.getEdad()));
        System.out.println("¿Es " + a2.getNombre() + " mayor de edad?: " + Alumno.esMayorDeEdad(a2.getEdad()));
    }
}