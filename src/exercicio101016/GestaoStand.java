package exercicio101016;

import java.util.ArrayList;

public class GestaoStand {
	private ArrayList _transaccoes;
	private ArrayList _automoveis;
	private ArrayList _clientes;
	
	public GestaoStand() {
		_transaccoes 	= new ArrayList<>();
		_automoveis		= new ArrayList<>();
		_clientes		= new ArrayList<>();
		
		
		Automovel newAuto = criarCarro();
		
		
		_automoveis.add(newAuto);
		
		Cliente c = new Cliente("Jacinto", "Seixal", "915735197", 357852159);
		Cliente c2 = new Cliente("Ze Po", "Braga", "935157654", 321963357);
		_clientes.add(c);
		_clientes.add(c2);
		
		Transaccao cferrari = new Transaccao(Transaccao.COMPRA, newAuto, c, 100300.0);
		
		_transaccoes.add(cferrari);
		
		Transaccao vferrari = new Transaccao(Transaccao.VENDA, newAuto, c2, 151000.0);
		
		_transaccoes.add(vferrari);
	}
	
	public Automovel criarCarro() {
		Automovel a = new Automovel(2500.00, 1600, "Ferrari", "Enzo", 1500, 2012);
		return a;
	}
	
	public Cliente criarCliente() {
		Cliente c = new Cliente("Jacinto", "Seixal", "915735197", 357852159);
		
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

