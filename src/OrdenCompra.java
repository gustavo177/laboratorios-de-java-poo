import java.util.Date;

public class OrdenCompra {
    private int identificador;
    private String descripcion;
    private Date fecha ;
    private  Cliente cliente;
    private  Producto[] productos;
    public int getIdentificador() {
        return ++identificador;
    }
}
