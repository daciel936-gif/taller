interface Pagable {
    void pagar(double monto);
}

class TarjetaCredito implements Pagable {
    private String titular;

    public TarjetaCredito(String titular) {
        this.titular = titular;
    }

    @Override
    public void pagar(double monto) {
        System.out.println(titular + " pagó $" + monto + " con tarjeta de crédito");
    }
}

class Efectivo implements Pagable {

    @Override
    public void pagar(double monto) {
        System.out.println("Se pagó $" + monto + " en efectivo");
    }
}

public class Main {
    public static void main(String[] args) {
        Pagable[] metodos = new Pagable[2];
        metodos[0] = new TarjetaCredito("Ana");
        metodos[1] = new Efectivo();

        for (int i = 0; i < metodos.length; i++) {
            metodos[i].pagar(50000);
        }
    }
}