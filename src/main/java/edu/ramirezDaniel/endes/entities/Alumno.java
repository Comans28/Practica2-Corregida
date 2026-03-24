package edu.ramirezDaniel.endes.entities;

/**
 * Clase que representa la entidad Alumno para la gestión académica.
 * Proporciona funcionalidad para el registro de datos y validaciones estáticas.
 * * @author Daniel Ramírez
 * @version 1.0
 */
public class Alumno {

    /** Identificador único del alumno en la base de datos */
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;
    private String email;
    private String curso;
    private double notaMedia;
    private boolean repetidor;

    /**
     * Constructor por defecto.
     * Inicializa un objeto Alumno vacío.
     */
    public Alumno() {
    }

    /**
     * Constructor completo con todos los atributos de la clase.
     * * @param id Identificador numérico
     * @param nombre Nombre de pila
     * @param apellidos Apellidos completos
     * @param edad Edad en años
     * @param email Correo electrónico institucional
     * @param curso Nombre del ciclo formativo (ej: DAW)
     * @param notaMedia Calificación media obtenida
     * @param repetidor Indica si el alumno está repitiendo curso
     */
    public Alumno(int id, String nombre, String apellidos, int edad, String email,
                  String curso, double notaMedia, boolean repetidor) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
        this.curso = curso;
        this.notaMedia = notaMedia;
        this.repetidor = repetidor;
    }

    // --- Métodos de acceso (Getters y Setters) ---

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }
    public double getNotaMedia() { return notaMedia; }
    public void setNotaMedia(double notaMedia) { this.notaMedia = notaMedia; }
    public boolean isRepetidor() { return repetidor; }
    public void setRepetidor(boolean repetidor) { this.repetidor = repetidor; }

    /**
     * Método estático que determina si un alumno tiene edad legal para trabajar.
     * * @param edad Edad del alumno a validar.
     * @return true si la edad es mayor o igual a 18 años.
     */
    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    /**
     * Método estático que convierte una nota numérica en una etiqueta de texto.
     * * @param nota Calificación media del alumno.
     * @return String con la calificación cualitativa (Sobresaliente, Notable, Aprobado o Suspenso).
     */
    public static String obtenerCalificacionTexto(double nota) {
        if (nota >= 9) return "Sobresaliente";
        if (nota >= 7) return "Notable";
        if (nota >= 5) return "Aprobado";
        return "Suspenso";
    }
}