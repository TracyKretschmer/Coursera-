package pizza;

import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		p1.adicionarIngrediente("Queijo");
		p1.adicionarIngrediente("Tomate");
		carrinho.addPizza(p1);
		
		p2.adicionarIngrediente("Queijo");
		p2.adicionarIngrediente("Frango");
		p2.adicionarIngrediente("Cebola");
		p2.adicionarIngrediente("Tomate");
		p2.adicionarIngrediente("Milho");
		p2.adicionarIngrediente("Bacon");
		carrinho.addPizza(p2);
		
		p3.adicionarIngrediente("Queijo");
		p3.adicionarIngrediente("Presunto");
		p3.adicionarIngrediente("Champignon");
		p3.adicionarIngrediente("Bacon");
		carrinho.addPizza(p3);
		
		

		System.out.println("Valor total: "+ carrinho.valorTotal());
		System.out.println("Ingredientes e quantidade que foram utilizados:");
		
		for(Map.Entry<String, Integer> entry : Pizza.contabilidade.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}	
	}

}
