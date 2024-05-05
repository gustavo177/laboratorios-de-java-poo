import java.util.Scanner;

public class ProyectoOrdenCompra {
    public static void main(String[] args) {
        OrdenCompra orden = new OrdenCompra();

        int identificador = orden.getIdentificador();
        System.out.println("identificador = " + identificador);
        System.out.println("identificador = " + orden.getIdentificador());
    }
}
