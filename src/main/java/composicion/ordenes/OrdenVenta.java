package composicion.ordenes;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import composicion.productos.AbstraccionProducto;

/**
 * Clase que representa una orden de venta.
 */
public class OrdenVenta {
    private long CodigoOrden;
    private String Cliente;
    private List<AbstraccionProducto> productos = new ArrayList<>();

    public OrdenVenta(long CodigoOrden, String Cliente) {
        this.CodigoOrden = CodigoOrden;
        this.Cliente = Cliente;
    }

    public double getPrecio() {
        double precioTotal = 0;
        for (AbstraccionProducto producto : productos) {
            precioTotal += producto.getPrecio();
        }
        return precioTotal;
    }

    public double calcularImpuestoTotal() {
        double impuestoTotal = 0;
        for (AbstraccionProducto producto : productos) {
            impuestoTotal += producto.calcularImpuesto();
        }
        return impuestoTotal;
    }

    public void AgregarProducto(AbstraccionProducto producto) {
        productos.add(producto);
    }

    public void ImprimirOrdenVenta() {
        NumberFormat formater = new DecimalFormat("###,##0.00");
        System.out.println("\\\n=============================================");
        System.out.println("Codigo_Orden: " + CodigoOrden + "\nCliente: " + Cliente + "\nProductos:");

        for (AbstraccionProducto prod : productos) {
            System.out.println(prod.getNombre() + "\t\t\t$ " + formater.format(prod.getPrecio()));
        }

        System.out.println("Total: " + formater.format(getPrecio()));
        System.out.println("Impuesto Total: " + formater.format(calcularImpuestoTotal()));
        System.out.println("=============================================");
    }
}
