import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Profesor profesor = IngresarProfesor.ingresarProfesor(scanner);
            if (profesor == null) break;
        }

        Profesor.mostrarProfesores();
        scanner.close();
    }
}