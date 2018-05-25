package pizza;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	
		List<Pizza> compra;
		
	public CarrinhoDeCompras() {
		compra = new ArrayList<Pizza>(); 
	}
	
	public void addPizza(Pizza pizza) {
		if(pizza.quantidadeIgredientes != 0) {
			compra.add(pizza);
		}else {
			System.out.println("Adicione ao menos um ingrediente a sua pizza");
		}
		  
	}
	public int valorTotal() {
		int valorTotal = 0;
		
		for (Pizza pizza : compra) {
		      valorTotal += pizza.getPreco(); 	
		}
		return valorTotal;
	}

}
