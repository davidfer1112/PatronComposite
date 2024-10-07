package composicion.productos;

/**
 * Clase abstracta que representa un producto.
 */
public abstract class AbstraccionProducto {
    protected String nombre;
    protected double precio;
    protected double tasaImpuesto;
    protected int cantidad;

    public AbstraccionProducto(String nombre, double precio, int cantidad, double tasaImpuesto) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.tasaImpuesto = tasaImpuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTasaImpuesto() {
        return tasaImpuesto;
    }

    public void setTasaImpuesto(double tasaImpuesto) {
        this.tasaImpuesto = tasaImpuesto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método abstracto para calcular el impuesto
    public abstract double calcularImpuesto();
}
