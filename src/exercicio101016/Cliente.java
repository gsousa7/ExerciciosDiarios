package exercicio101016;

public class Cliente {
	String nome;
	String morada;
	int nif;
	String contacto;
	
	
	
	
	public Cliente(String nome, String morada, int nif, String contacto) {
		super();
		this.nome = nome;
		this.morada = morada;
		this.nif = nif;
		this.contacto = contacto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public int getNif() {
		return nif;
	}
	public void setNif(int nif) {
		this.nif = nif;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	
	
}
