package exercicio101016;

public class Transaccao {
	
	final int COMPRA = 0;
	final int VENDA = 1;
	
	int tipo;
	Automovel carro;
	Cliente cliente;
	double preco;
	
	
	public Transaccao(int tipo, Automovel carro, Cliente cliente, double preco) {
		super();
		this.tipo = tipo;
		this.carro = carro;
		this.cliente = cliente;
		this.preco = preco;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public Automovel getCarro() {
		return carro;
	}


	public void setCarro(Automovel carro) {
		this.carro = carro;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	
	
}
