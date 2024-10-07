package composicion.productos;

/**
 * Clase que representa un producto simple.
 */
public class ConfiguracionSimpleProducto extends AbstraccionProducto {
    protected String marca;

    public ConfiguracionSimpleProducto(String nombre, double precio, int cantidad, double tasaImpuesto, String marca) {
        super(nombre, precio, cantidad, tasaImpuesto);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public double getPrecio() {
        return this.precio * this.cantidad;
    }

    @Override
    public double calcularImpuesto() {
        return this.getPrecio() * this.tasaImpuesto;
    }
}
