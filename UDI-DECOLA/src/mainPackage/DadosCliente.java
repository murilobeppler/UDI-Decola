package mainPackage;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class DadosCliente implements Serializable {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public static void inicializaClientes() {
        ArrayList<Cliente> clientes =
                (ArrayList<Cliente>) Persist.recuperar("clientes.dat");
        if (clientes == null)
            clientes = new ArrayList<Cliente>();
    }


    public void cadastrar(Cliente cliente) {

        clientes.add(cliente);
        boolean r = Persist.gravar(clientes, "clientes.dat");
    }

    public int consultar(String cpf) {
        for (Cliente cliente : clientes) {
            if (Objects.equals(cliente.getCPF(), cpf)) {
                return 1;
            }
        }
        return 0;
    }

    public boolean excluir(String cpf) {
        int cliente = consultar(cpf);
        if (cliente != 0) {
            clientes.remove(cliente);
            return true;
        }
        return false;
    }


    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
}
