import java.sql.SQLOutput;
import java.util.HashMap;

public class Profesor extends Persona {
    private String materia;
    private String universidad;
    private static final int CAPACIDAD_MAXIMA = 50;
    private static HashMap<Integer, Profesor> profesores = new HashMap<>();
    private static int contador = 0;

    public Profesor(String nombre, String apellido, String fechaNacimiento, String genero, double estatura, double peso, String materia, String universidad) {
        super(nombre, apellido, fechaNacimiento, genero, estatura, peso);
        this.materia = materia;
        this.universidad = universidad;
        if (contador < CAPACIDAD_MAXIMA) {
            profesores.put(contador++, this);
        } else {
            System.out.println("Capacidad máxima alcanzada. No se pueden agregar más profesores.");
        }
    }
    public String getMateria() {
        return materia;
    }
    public String getUniversidad() {
        return universidad;
    }

    @Override
    public void mostrarInformacion() {
        System.out.printf("%-20s %-20s %-20s %-20s%n", getNombre() + " " + getApellido(), getFechaNacimiento(), getMateria(), getUniversidad());
    }


    public static void mostrarProfesores() {
        System.out.println("\nLista de Profesores ingresados:");
        System.out.printf("%-20s %-20s %-20s %-20s%n", "Profesor", "Fecha de Nacimiento", "Materia", "Universidad");
        System.out.println("----------------------------------------------------------------------------------------");
        for (Profesor profesor : profesores.values()) {
            profesor.mostrarInformacion();
        }
    }
}
