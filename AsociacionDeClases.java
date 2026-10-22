import java.util.ArrayList;

class Estudiante {
    private String nombre;
    private ArrayList<Curso> cursos;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void inscribirse(Curso curso) {
        cursos.add(curso);
        curso.agregarEstudiante(this);
    }

    public void mostrarCursos() {
        System.out.println("Cursos de " + nombre + ":");
        for (Curso c : cursos) {
            System.out.println("- " + c.getNombre());
        }
    }
}

class Curso {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarEstudiantes() {
        System.out.println("Estudiantes de " + nombre + ":");
        for (Estudiante e : estudiantes) {
            System.out.println("- " + e.getNombre());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante ana = new Estudiante("Ana");
        Estudiante luis = new Estudiante("Luis");
        Curso poo = new Curso("POO");
        Curso datos = new Curso("Estructuras de Datos");

        ana.inscribirse(poo);
        ana.inscribirse(datos);
        luis.inscribirse(poo);

        ana.mostrarCursos();
        poo.mostrarEstudiantes();
    }
}