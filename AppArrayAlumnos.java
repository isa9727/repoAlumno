import java.util.Scanner;

public class AppArrayAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creamos un array para 5 objetos de la clase AlumnoG
        AlumnoG[] listaAlumnos = new AlumnoG[5];
        double sumaMedias = 0;

        System.out.println("=== Registro de 5 Alumnos ===");

        for (int i = 0; i < listaAlumnos.length; i++) {
            System.out.println("\nDatos del alumno " + (i + 1) + ":");
            
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            
            System.out.print("Teléfono: ");
            String telefono = sc.nextLine();

            // Creamos el objeto y lo guardamos en la posición 'i' del array
            listaAlumnos[i] = new AlumnoG(nombre, telefono);
            
            // Sumamos la media de este alumno al total
            sumaMedias += listaAlumnos[i].getMedia();
        }

        // Mostramos los resultados
        System.out.println("\n=== Listado de Alumnos Registrados ===");
        for (AlumnoG al : listaAlumnos) {
            System.out.println(al);
        }

        // Calculamos la media de la clase
        double mediaClase = sumaMedias / listaAlumnos.length;
        System.out.printf("\nMedia global de la clase: %.2f\n", mediaClase);

        sc.close();
    }
}
