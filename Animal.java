class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }

    public void moverCola() {
        System.out.println(getNombre() + " mueve la cola");
    }
}

class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }

    public void ronronear() {
        System.out.println(getNombre() + " ronronea");
    }
}

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Rocky", 3);
        Gato gato = new Gato("Luna", 2);

        perro.mostrarInfo();
        perro.hacerSonido();
        perro.moverCola();

        gato.mostrarInfo();
        gato.hacerSonido();
        gato.ronronear();
    }
}