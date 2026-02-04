import java.util.Scanner;

public class AppAlumnoG {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Registro de Alumno ---");
        System.out.print("Introduce el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce el teléfono: ");
        String telefono = sc.nextLine();

        System.out.print("Introduce la edad: ");
        int edad = sc.nextInt();

        // Creamos el objeto Alumno (las notas se generan solas en el constructor)
        AlumnoG alumno = new AlumnoG(nombre, telefono, edad);

        // Visualizamos el objeto creado (usa el toString que ya programaste)
        System.out.println("\n--- Objeto Alumno Creado ---");
        System.out.println(alumno);

        sc.close();
    }
}
