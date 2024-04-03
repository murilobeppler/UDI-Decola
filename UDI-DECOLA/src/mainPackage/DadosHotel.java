package mainPackage;

import java.util.ArrayList;
import java.util.Objects;

public class DadosHotel {
    private ArrayList<Hotel> dados = new ArrayList<>();

    public void cadastrar(Hotel hotel) {
        dados.add(hotel);
    }

    public Hotel consultar(String cnpj) {
        for (Hotel hotel : dados) {
            if (Objects.equals(hotel.getCNPJ(), cnpj)) {
                return hotel;
            }
        }
        return null;
    }

    public boolean excluir(String cnpj) {
        Hotel hotel = consultar(cnpj);
        if (hotel != null) {
            dados.remove(hotel);
            return true;
        }
        return false;
    }
}