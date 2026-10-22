abstract class Vehiculo {
    private String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void mostrarMarca() {
        System.out.println("Marca: " + marca);
    }

    public abstract void moverse();
}

interface Recargable {
    void recargar();
}

class AutoElectrico extends Vehiculo implements Recargable {

    public AutoElectrico(String marca) {
        super(marca);
    }

    @Override
    public void moverse() {
        System.out.println(getMarca() + " se mueve con motor eléctrico");
    }

    @Override
    public void recargar() {
        System.out.println(getMarca() + " se está recargando");
    }
}

class Bicicleta extends Vehiculo {

    public Bicicleta(String marca) {
        super(marca);
    }

    @Override
    public void moverse() {
        System.out.println(getMarca() + " se mueve pedaleando");
    }
}

public class Main {
    public static void main(String[] args) {
        AutoElectrico auto = new AutoElectrico("Tesla");
        Bicicleta bici = new Bicicleta("Trek");

        auto.mostrarMarca();
        auto.moverse();
        auto.recargar();

        bici.mostrarMarca();
        bici.moverse();

        // Vehiculo v = new Vehiculo("X");  // ERROR: no se puede instanciar una clase abstracta
    }
}