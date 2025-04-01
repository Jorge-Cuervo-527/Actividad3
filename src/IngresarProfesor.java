import java.util.Scanner;

class IngresarProfesor {
    public static Profesor ingresarProfesor(Scanner scanner) {
        System.out.println("Ingrese nombre o (s) para salir y ver la lista):");
        String nombre = scanner.nextLine();
        if (nombre.equalsIgnoreCase("s")) return null;

        System.out.println("Ingrese apellido:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese materia:");
        String materia = scanner.nextLine();

        System.out.println("Ingrese universidad:");
        String universidad = scanner.nextLine();

        System.out.println("Ingrese fecha de nacimiento (YYYY-MM-DD):");
        String fechaNacimiento = scanner.nextLine();

        System.out.println("Ingrese género:");
        String genero = scanner.nextLine();

        System.out.println("Ingrese estatura (en metros):");
        double estatura = scanner.nextDouble();

        System.out.println("Ingrese peso (en kg):");
        double peso = scanner.nextDouble();
        scanner.nextLine(); // Consumir la línea

        return new Profesor(nombre, apellido, fechaNacimiento, genero, estatura, peso, materia, universidad);
    }
}

