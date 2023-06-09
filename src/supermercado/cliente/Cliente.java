package supermercado.cliente;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private int totalProductos;
    private List<String> cestaDeCompra;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.totalProductos = 0;
        this.cestaDeCompra = new ArrayList<>();
    }

    public void agregarProducto(String producto) {
        cestaDeCompra.add(producto);
        totalProductos++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTotalProductos() {
        return totalProductos;
    }

    public List<String> getCestaDeCompra() {
        return cestaDeCompra;
    }

    @Override
    public String toString() {
        String resultado = "Cliente\n";
        resultado += "===================================\n";
        resultado += "* Nombre: " + nombre + "\n";
        resultado += "* Total de productos: " + totalProductos + "\n";
        resultado += "* Lista de artículos en la cesta:\n";
        for (String producto : cestaDeCompra) {
            resultado += producto + "\n";
        }
        resultado += "===================================\n";
        return resultado;
    }
}
