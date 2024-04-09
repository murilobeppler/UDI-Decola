package mainPackage;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente extends Pessoa{
	//atributos
private String dataNascimento;
private String email;
private int contCompra;
private float precoTotal;

private boolean isVip;
private boolean isFuncionario;

//constantes
public static final int numViraVP = 4;

//Construtores
	public Cliente(String dataNascimento, String email, String nome, String CPF, String endereco){
		super(nome, CPF, endereco);
		this.dataNascimento = dataNascimento;
		this.email = email;
	}

//gets e sets
public String getDataNascimento() {
	return dataNascimento;
}

public void setDataNascimento(String dataNascimento) {
	this.dataNascimento = dataNascimento;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getContCompra() {
	return contCompra;
}

public void setContCompra(int contCompra) {
	this.contCompra = contCompra;
}

public float getPrecoTotal() {
	return precoTotal;
}

public void setPrecoTotal(float precoTotal) {
	this.precoTotal = precoTotal;
}

public int getNumViraVP() {
	return numViraVP;
}

public boolean isVip() {return isVip;}
public void setVip(boolean vip){ this.isVip = vip; }
public boolean isFuncionario() {return isFuncionario;}
public void setClienteFuncionario(boolean funcionario){ this.isFuncionario = funcionario; }

	//metodos
public void adicionarCPFCliente(CadastroCliente cadastroClientes) {
		cadastroClientes.adicionarCPFCliente(this.getCPF());
	}
public static boolean validarEmail(String email) {
	String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(email);
	return matcher.matches();
	}
public VIP viraVip(){
		VIP vip1 = new VIP(getDataNascimento(),getEmail(), getNome(), getCPF(), getEndereco());
		setVip(true);
		return vip1;
}
	public ClienteFuncionario setNewClienteFuncionario(){
		ClienteFuncionario clienteFuncionario1 = new ClienteFuncionario(getDataNascimento(), getEmail(), getNome(), getCPF(), getEndereco());
		setClienteFuncionario(true);
		return clienteFuncionario1;
	}
}


