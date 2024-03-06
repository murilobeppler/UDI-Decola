package udi_decola;

/* // Construtor
    public Pessoa(String nome, String cpf) {
        this.nome = nome;

        // Verifica se o CPF é válido antes de atribuir
        if (validarCPF(cpf)) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido");
        }
    }*/

/* private boolean validarCPF(String cpf) {
        return cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");*/



public class Pessoa {
//atributos
	private String nome;
	private String CPF;
	private String endereco;


	//Construtores
	public Pessoa();
	public Pessoa(String nome, String CPF, String endereco){
		this.nome = nome;
		this.CPF = CPF;
		this.endereco = endereco;
	}
	
	//gets e sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	//metodos
	
	
	
}
