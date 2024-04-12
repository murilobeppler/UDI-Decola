package mainPackage;

public class Triple extends Standart{
	//atributos
	private int numQuartos;
	private float preco;
	private float desconto;

//Cosntrutores
public Triple(int numQuartosSingle, float preco, float desconto, int numQuartos, Hotel hotel) {
	super(numQuartos, hotel);
	this.numQuartos = numQuartosSingle;
	this.preco = preco;
	this.desconto = desconto;
}

//gets e sets
public int getNumQuartos() {
	return numQuartos;
}
public void setNumQuartos(int numQuartos) {
	this.numQuartos = numQuartos;
}
public float getPreco() {
	return preco;
}
public void setPreco(float preco) {
	this.preco = preco;
}
public float getDesconto() {
	return desconto;
}
public void setDesconto(float desconto) {
	this.desconto = desconto;
}

	public float calculaPreco() {
		int numeroQuartos = getNumQuartos();
		setNumQuartos(numeroQuartos - numQuartos);
		return preco*numQuartos;
	}
//metodos
//construtores

}
