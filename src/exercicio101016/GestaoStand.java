package exercicio101016;

import java.util.ArrayList;

public class GestaoStand {
	private ArrayList _transaccoes;
	private ArrayList _automoveis;
	private ArrayList _clientes;
	

	public GestaoStand() {
		Automovel newAuto = criarCarro();
		_automoveis.add(newAuto);
		
		Cliente c = new Cliente("Jacinto", "Rua dos trolhas 32, 4 frente", 987696358, "912545365");
	    Cliente c2 = new Cliente("Ze Po", "Rua Branca, 7878, R/C Direito", 98324532, "912345365");
	    
	    _clientes.add(c);
	    _clientes.add(c2);
	    
	    
	    Transaccao crenault = new Transaccao(Transaccao.COMPRA, newAuto,c, 2300.0);
	    
	    _transaccoes.add(crenault);
		
	    Transaccao vrenault = new Transaccao(Transaccao.VENDA, newAuto, c2, 2700.0);
	    
		
	}
	
	public Automovel criarCarro() {
		Automovel a = new Automovel(2500.00, 1600, "Renault", "Megane", 120000, 2002);
		Automovel b = new Automovel(15000.00, 3000, "Mercedez", "Benz", 15000, 2010);
		return a;
		
				
	}
	
	public Cliente criarCliente() {
		Cliente c = new Cliente("Jacinto", "Rua dos trolhas 32, 4 frente", 987696358, "912545365");
		Cliente c2 = new Cliente("Ze Po", "Rua Branca, 7878, R/C Direito", 98324532, "912345365");
		return c;
		
	}
	
	public Transaccao comprarCarro(Automovel carro, Cliente c) {
		return null;
	}
	
	public Transaccao venderCarro(Automovel carro, Cliente c) {
		return null;
		
	}

	public ArrayList get_transaccoes() {
		return _transaccoes;
	}
	
	
}
