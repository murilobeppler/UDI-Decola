package mainPackage;

import java.util.ArrayList;
import java.util.Objects;

public class DadosCliente {

    private ArrayList<Cliente> dados = new ArrayList<>();

    public void cadastrar(Cliente cliente) {
        dados.add(cliente);
    }

    public Cliente consultar(String cpf) {
        for (Cliente cliente : dados) {
            if (Objects.equals(cliente.getCPF(), cpf)) {
                return cliente;
            }
        }
        return null;
    }

    public boolean excluir(String cpf) {
        Cliente cliente = consultar(cpf);
        if (cliente != null) {
            dados.remove(cliente);
            return true;
        }
        return false;
    }

}
