package supermercado.utilidades;

import java.util.Random;

public class Utilidades {
    private static final String[] nombres = {"pepe","Juan,","Maria"};
    private static final String[] productos = {"Fresas","Mandarinas","Manzanas","Paraguayos","Platanos","Cerezas"};

    public static String obtenerNombreAleatorio() {
        Random random = new Random();
        int indice = random.nextInt(nombres.length);
        return nombres[indice];
    }

    public static String obtenerProductoAleatorio() {
        Random random = new Random();
        int indice = random.nextInt(productos.length);
        return productos[indice];
    }
}