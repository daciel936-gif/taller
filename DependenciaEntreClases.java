class Documento {
    private String titulo;
    private String contenido;

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }
}

class Impresora {

    public void imprimir(Documento doc) {
        System.out.println("Imprimiendo: " + doc.getTitulo());
        System.out.println(doc.getContenido());
    }
}

public class Main {
    public static void main(String[] args) {
        Documento tarea = new Documento("Tarea POO", "Ejercicios de herencia");
        Impresora impresora = new Impresora();

        impresora.imprimir(tarea);
    }
}