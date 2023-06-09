package supermercado.cajeros;

import supermercado.cliente.Cliente;

import java.util.LinkedList;
import java.util.Queue;

public class Cajero {
    private int numero;
    private Queue<Cliente> colaClientes;

    public Cajero(int numero) {
        this.numero = numero;
        this.colaClientes = new LinkedList<>();
    }

    public void agregarCliente(Cliente cliente) {
        colaClientes.add(cliente);
    }

    public Cliente atenderCliente() {
        return colaClientes.poll();
    }

    public int getNumero() {
        return numero;
    }

    public int getTotalClientes() {
        return colaClientes.size();
    }

    public Queue<Cliente> getColaClientes() {
        return colaClientes;
    }

    @Override
    public String toString() {
        String resultado = "Cajero\n";
        resultado += "===================================\n";
        resultado += "* Número de caja: " + numero + "\n";
        resultado += "* Total de clientes: " + colaClientes.size() + "\n";
        resultado += "* Clientes en la fila:\n";
        for (Cliente cliente : colaClientes) {
            resultado += cliente.getNombre() + "\n";
        }
        resultado += "===================================\n";
        return resultado;
    }
}
