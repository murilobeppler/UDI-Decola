package mainPackage;

import java.util.ArrayList;
import java.util.Objects;

public class DadosEmpresaAerea {
    private ArrayList<Empresa_Aerea> dados = new ArrayList<>();

    public void cadastrar(Empresa_Aerea empresaAerea) {
        dados.add(empresaAerea);
    }

    public Empresa_Aerea consultar(String cnpj) {
        for (Empresa_Aerea empresa : dados) {
            if (Objects.equals(empresa.getCNPJ(), cnpj)) {
                return empresa;
            }
        }
        return null;
    }

    public boolean excluir(String cnpj) {
        Empresa_Aerea empresa = consultar(cnpj);
        if (empresa != null) {
            dados.remove(empresa);
            return true;
        }
        return false;
    }
}