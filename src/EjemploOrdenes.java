import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        // Crear clientes
        Cliente cliente1 = new Cliente("Gustavo", "Bautista");

        OrdenCompra orden1 = new OrdenCompra("Compra de producto 1");
        orden1.setCliente(cliente1);
        orden1.setFecha(new Date());

        // Crear productos para cada orden
        Producto[] productosOrden1 = {
                new Producto("Producto 1A", "Fabricante 1", 10),
                new Producto("Producto 1B", "Fabricante 1", 15),
                new Producto("Producto 1C", "Fabricante 1", 20),
                new Producto("Producto 1D", "Fabricante 1", 25)
        };

        // Agregar productos a las órdenes
        for (Producto producto : productosOrden1) {
            orden1.addProducto(producto);
        }

        imprimirDetallesOrden(orden1);
    }

    public static void imprimirDetallesOrden(OrdenCompra orden) {
        System.out.println("Orden ID: " + orden.getIdentificador());
        System.out.println("Descripción: " + orden.getDescripcion());
        System.out.println("Fecha: " + orden.getFecha());
        System.out.println("Cliente: " + orden.getCliente().getNombre());
        System.out.println("Productos:");

        for (Producto producto : orden.getProductos()) {
            if (producto != null) {
                System.out.println("  Nombre: " + producto.getNombre());
                System.out.println("  Fabricante: " + producto.getFabricante());
                System.out.println("  Precio: " + producto.getPrecio());
            }
        }
        System.out.println("Gran Total: " + orden.calcularGranTotal());
        System.out.println();
    }

}
