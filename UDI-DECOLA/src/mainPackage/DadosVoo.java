package mainPackage;

import java.util.ArrayList;
import java.util.Objects;
import java.io.Serializable;

public class DadosVoo implements Serializable {
    private ArrayList<Voo> dados = new ArrayList<>();

    public void cadastrar(Voo trechoVoo){
        dados.add(trechoVoo);
    }



    public Voo consultar(String codigoId) {
        for (Voo trechoVoo : dados) {
            if (Objects.equals(trechoVoo.getCodigoIden(), codigoId)) {
                return trechoVoo;
            }
        }
        return null;
    }

    public boolean excluir(String codigoId){
        Voo trechoVoo = consultar(codigoId);
        if(trechoVoo != null) {
            dados.remove(trechoVoo);
            return true;
        }
        return false;
    }
}

