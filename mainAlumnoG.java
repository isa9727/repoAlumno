import java.util.Scanner;

public class mainAlumnoG {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Telefono: ");
        String telefono = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        AlumnoG alumno = new AlumnoG(nombre, telefono, edad);

        System.out.println("\nAlumno creado:");
        System.out.println(alumno);

        sc.close();
    }
}
