package mainPackage;

import java.util.ArrayList;
import java.util.Objects;

public class DadosFuncionario {
    private ArrayList<Funcionario> dados = new ArrayList<>();

    public void cadastrar(Funcionario funcionario) {
        dados.add(funcionario);
    }

    public Funcionario consultar(String cpf) {
        for (Funcionario funcionario : dados) {
            if (Objects.equals(funcionario.getCPF(), cpf.toUpperCase())) {
                return funcionario;
            }
        }
        return null;
    }

    public boolean excluir(String cpf) {
        Funcionario funcionario = consultar(cpf);
        if (funcionario != null) {
            dados.remove(funcionario);
            return true;
        }
        return false;
    }
}