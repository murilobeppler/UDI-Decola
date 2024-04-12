package mainPackage;

public class Empresa_Aerea {
	//atributos
	private static String CNPJ;
	private static String nome;
	private static String nomeDiv;
	private static String dataCriacao;

//constantes
public static float precoUDI = 700;

//Construtores
public Empresa_Aerea(String CNPJ, String nome, String nomeDiv, String dataCriacao){
	this.CNPJ = CNPJ;
	this.nome = nome;
	this.nomeDiv = nomeDiv;
	this.dataCriacao = dataCriacao;
}

//gets e sets
public String getCNPJ() {
	return CNPJ;
}

public void setCNPJ(String cNPJ) {
	CNPJ = cNPJ;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getNomeDiv() {
	return nomeDiv;
}

public void setNomeDiv(String nomeDiv) {
	this.nomeDiv = nomeDiv;
}

public String getDataCriacao() {
	return dataCriacao;
}

public void setDataCriacao(String dataCriacao) {
	this.dataCriacao = dataCriacao;
}

//metodos
//construtores

}
