package mainPackage;

public class Voo extends Empresa_Aerea {
	//atributos
	private String codigoIden; //3 letras(origem) e 5 números(3 primeiros são os assentos do avião, os dois últimos o id da empresa aérea)
	private String lclOrigem; //saopaulo.sp.br
	private String lclDestino; //belohorizonte.bh.br
	private String horaSaida;
	private String horaChegada;
	private float preco;
	private int numVagas;
	private float multiVerao;
	private float multiInverno;
	private float multiPrimavera;
	private float multiOutono;
	private String dataVoo;
	private int epocaAno;

//Construtores
public Voo(String codigoIden, String lclOrigem, String dataVoo, String lclDestino, String horaSaida, String horaChegada, float preco, int numVagas, float multiInverno,float multiVerao, float multiPrimavera, float multiOutono, String CNPJ, String nome, String nomeDiv, String dataCriacao, int epocaAno){
	super(CNPJ, nome, nomeDiv, dataCriacao);
	this.codigoIden = codigoIden;
	this.lclOrigem = lclOrigem;
	this.lclDestino = lclDestino;
	this.horaSaida = horaSaida;
	this.horaChegada = horaChegada;
	this.preco = preco;
	this.numVagas = numVagas;
	this.dataVoo = dataVoo;
	this.multiInverno = multiInverno;
	this.multiVerao = multiVerao;
	this.multiOutono = multiOutono;
	this.multiPrimavera = multiPrimavera;
	this.epocaAno = epocaAno;
}
//gets e sets
public String getCodigoIden() {
	return codigoIden;
}
public void setCodigoIden(String codigoIden) {
	this.codigoIden = codigoIden;
}
public String getLclOrigem() {
	return lclOrigem;
}
public void setLclOrigem(String lclOrigem) {
	this.lclOrigem = lclOrigem;
}
public String getLclDestino() {
	return lclDestino;
}
public void setLclDestino(String lclDestino) {
	this.lclDestino = lclDestino;
}
public String getHoraSaida() {
	return horaSaida;
}
public void setHoraSaida(String horaSaida) {
	this.horaSaida = horaSaida;
}
public String getHoraChegada() {
	return horaChegada;
}
public void setHoraChegada(String horaChegada) {
	this.horaChegada = horaChegada;
}
public float getPreco() {
	return preco;
}
public void setPreco(float preco) {
	this.preco = preco;
}
public int getNumVagas() {
	return numVagas;
}
public void setNumVagas(int numVagas) {
	this.numVagas = numVagas;
}





public String getDataVoo() {
	return dataVoo;
}
public void setDataVoo(String dataVoo) {
	this.dataVoo = dataVoo;
}

	public float getMultiInverno() {
		return multiInverno;
	}

	public float getMultiOutono() {
		return multiOutono;
	}

	public float getMultiPrimavera() {
		return multiPrimavera;
	}

	public float getMultiVerao() {
		return multiVerao;
	}
	public void setMultiInverno(float valor){
		this.multiInverno = valor;
	}
	public void setMultiPrimavera(float valor){
		this.multiPrimavera = valor;
	}
	public void setMultiOutono(float valor){
		this.multiOutono = valor;
	}

	public float calculaPreco(){
		if(epocaAno == 1){
			return preco*multiVerao;
		}
		if(epocaAno == 2){
			return preco*multiInverno;
		}
		if(epocaAno == 3){
			return preco*multiPrimavera;
		}
		if(epocaAno == 4){
			return preco*multiOutono;
		} else {
			return preco;
		}
	}
	//metodos
//construtores


}
