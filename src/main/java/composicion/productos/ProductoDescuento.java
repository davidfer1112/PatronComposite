package composicion.productos;

/**
 * Clase que representa un producto de descuento.
 */
public class ProductoDescuento extends AbstraccionProducto {

    public ProductoDescuento(String nombre, double descuento) {
        super(nombre, descuento, 1, 0);  // El descuento es un precio negativo, y no tiene impuesto
    }

    @Override
    public double calcularImpuesto() {
        return 0; // No tiene impuesto
    }
}
