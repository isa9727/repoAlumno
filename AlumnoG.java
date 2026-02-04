import java.util.Random;

public class AlumnoG {

    private String nombre;
    private String telefono;
    private double nota1;
    private double nota2;
    private double nota3;
    private double media; // 1. El atributo nuevo

    public AlumnoG(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
       

        Random r = new Random();
        this.nota1 = 1 + r.nextInt(10);
        this.nota2 = 1 + r.nextInt(10);
        this.nota3 = 1 + r.nextInt(10);

    // 2. LA LÓGICA: Calculamos y guardamos el valor
        this.media = (nota1 + nota2 + nota3) / 3.0; 
    }

    public double getMedia() {
        return media;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    //public double getMedia() {
       // return (nota1 + nota2 + nota3) / 3.0;
    //}

    @Override
    public String toString() {
        return "AlumnoG{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", media=" + String.format("%.2f", getMedia()) +
                '}';
    }
}
