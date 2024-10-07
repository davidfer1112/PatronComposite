package composicion.productos;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un producto compuesto por varios productos.
 */
public class ConfiguracionCompuestaProducto extends AbstraccionProducto {
    private List<AbstraccionProducto> productos = new ArrayList<>();

    public ConfiguracionCompuestaProducto(String nombre, int cantidad) {
        super(nombre, 0, cantidad, 0);  // El precio e impuesto se calculan a partir de los productos contenidos
    }

    @Override
    public double getPrecio() {
        double precioTotal = 0;
        for (AbstraccionProducto producto : productos) {
            precioTotal += producto.getPrecio();
        }
        return precioTotal * this.cantidad;
    }

    @Override
    public double calcularImpuesto() {
        double impuestoTotal = 0;
        for (AbstraccionProducto producto : productos) {
            impuestoTotal += producto.calcularImpuesto();
        }
        return impuestoTotal * this.cantidad;
    }

    public void AgregarProducto(AbstraccionProducto producto) {
        this.productos.add(producto);
    }

    public boolean RemoverProductos(AbstraccionProducto producto) {
        return this.productos.remove(producto);
    }
}
