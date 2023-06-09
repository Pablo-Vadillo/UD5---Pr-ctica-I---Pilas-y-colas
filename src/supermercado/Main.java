package supermercado;

import supermercado.cliente.Cliente;
import supermercado.cajeros.Cajero;
import supermercado.utilidades.Utilidades;

import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cajero cajero = new Cajero(1);
        Scanner scanner = new Scanner(System.in);
        boolean supermercadoAbierto = true;

        while (supermercadoAbierto) {
            System.out.println("=== Menú ===");
            System.out.println("1. Abrir caja");
            System.out.println("2. Añadir nuevo cliente a la cola");
            System.out.println("3. Atender un cliente");
            System.out.println("4. Ver clientes pendientes");
            System.out.println("5. Cerrar supermercado");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    if (cajero.getTotalClientes() == 0) {
                        System.out.println("Caja abierta correctamente.");
                    } else {
                        System.out.println("La caja ya está abierta y tiene clientes en espera.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el número de productos del cliente: ");
                    int numProductos = scanner.nextInt();
                    if (numProductos > 0) {
                        Cliente cliente = new Cliente(Utilidades.obtenerNombreAleatorio());
                        for (int i = 0; i < numProductos; i++) {
                            String producto = Utilidades.obtenerProductoAleatorio();
                            cliente.agregarProducto(producto);
                        }
                        cajero.agregarCliente(cliente);
                        System.out.println("Nuevo cliente agregado a la cola:");
                        System.out.println(cliente);
                    } else {
                        System.out.println("El número de productos debe ser mayor a cero.");
                    }
                    break;

                case 3:
                    Cliente clienteAtendido = cajero.atenderCliente();
                    if (clienteAtendido != null) {
                        System.out.println("Se atendió el siguiente cliente:");
                        System.out.println(clienteAtendido);
                    } else {
                        System.out.println("No se puede atender más.");
                    }
                    break;

                case 4:
                    System.out.println("Clientes pendientes en la cola:");
                    Queue<Cliente> colaClientes = cajero.getColaClientes();
                    if (colaClientes.isEmpty()) {
                        System.out.println("No hay clientes en espera.");
                    } else {
                        for (Cliente cliente : colaClientes) {
                            System.out.println(cliente);
                        }
                    }
                    break;

                case 5:
                    supermercadoAbierto = false;
                    System.out.println("Supermercado cerrado.");
                    break;
                default:
                    System.out.println("Opción no valida. Seleccione opción valida.");
            }
        }
    }
}
