import java.util.Date;

public class OrdenCompra {
    private int contadorId = 0;
    private Integer identificador;

    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int indiceProducto; // Indice para llevar el control de la posición en el arreglo de productos

    public OrdenCompra(String descripcion) {
        this.identificador = ++contadorId;
        this.descripcion = descripcion;
        this.productos = new Producto[4]; // Inicializamos el arreglo con 4 elementos
        this.indiceProducto = 0; // Inicializamos el índice del producto en 0
    }
    public Integer getIdentificador() {
        return identificador;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public Date getFecha() {
        return fecha;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Producto[] getProductos() {
        return productos;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Método para agregar productos
    public void addProducto(Producto producto) {
        if (indiceProducto < productos.length) {
            productos[indiceProducto] = producto;
            indiceProducto++;
        } else {
            System.out.println("No se pueden agregar más productos, la orden está llena.");
        }
    }
}

class Cliente {
    // Atributos y métodos de la clase Cliente
}

class Producto {
    // Atributos y métodos de la clase Producto
}