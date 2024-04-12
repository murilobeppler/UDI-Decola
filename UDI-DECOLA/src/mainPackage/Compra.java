package mainPackage;

public class Compra {
	//atributos
private String nomeCliente;
private String horaCompra;
private int numPessoas;

//passagem aerea
//diaria em hoteis

//Construtores
public Compra(String nomeCliente, String hora, int numPessoas){
	this.horaCompra = hora;
	this.nomeCliente = nomeCliente;
	this.numPessoas = numPessoas;
}

//gets e sets
public String getNomeCliente() {
	return nomeCliente;
}
public void setNomeCliente(String nomeCliente) {
	this.nomeCliente = nomeCliente;
}
public float calcularCompraVIP(VIP vip, Voo voo, Double duplo,Triple triplo,Single single){
	float desconto = vip.getDesconto();
	float precoVoo = voo.calculaPreco();
	float precoSingle = single.calculaPreco();
	float precoDuplo = duplo.calculaPreco();
	float precoTriplo = triplo.calculaPreco();
	int vagasVoo = voo.getNumVagas();
	voo.setNumVagas(vagasVoo-numPessoas);

	return (precoDuplo + precoSingle + precoTriplo + precoVoo*(numPessoas) - desconto);
}

	public float calcularCompra(Cliente cliente, Voo voo, Double duplo,Triple triplo,Single single){
		int contCompra = cliente.getContCompra();
		cliente.setContCompra(contCompra + 1);
		float precoVoo = voo.calculaPreco();
		float precoSingle = single.calculaPreco();
		float precoDuplo = duplo.calculaPreco();
		float precoTriplo = triplo.calculaPreco();
		int vagasVoo = voo.getNumVagas();
		voo.setNumVagas(vagasVoo-numPessoas);
		if(contCompra >= 4){
			cliente.viraVip();
		}

		return (precoDuplo + precoSingle + precoTriplo + precoVoo*(numPessoas));
	}

	public float calcularCompraFuncionario(ClienteFuncionario clienteFuncionario, Voo voo, Double duplo,Triple triplo,Single single){
		float desconto = clienteFuncionario.getDescontoFuncionario();
		float precoVoo = voo.calculaPreco();
		float precoSingle = single.calculaPreco();
		float precoDuplo = duplo.calculaPreco();
		float precoTriplo = triplo.calculaPreco();
		int vagasVoo = voo.getNumVagas();
		voo.setNumVagas(vagasVoo-numPessoas);

		return (precoDuplo + precoSingle + precoTriplo + precoVoo*(numPessoas) - desconto);
	}

	public float executarCompra(Cliente cliente, VIP vip, Voo voo, Double duplo,Triple triplo,Single single, ClienteFuncionario clienteFuncionario){
		if(cliente.isVip()){
			return calcularCompraVIP(vip,voo,duplo,triplo,single);
		}
		if(cliente.isFuncionario()){
			return calcularCompraFuncionario(clienteFuncionario,voo,duplo,triplo,single);
		}
		else {
			return calcularCompra(cliente, voo, duplo, triplo, single);
		}
	}

//metodos
//construtores


}
