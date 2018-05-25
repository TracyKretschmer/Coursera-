package pizza;
import java.util.HashMap;
import java.util.Map;

public class Pizza {

    int quantidadeIgredientes=0;
    
	
	static Map<String, Integer> contabilidade = new HashMap<String, Integer>();
	
	
	void adicionarIngrediente(String ingrediente) {
		quantidadeIgredientes++;
		contabilizaIngrediente(ingrediente);
	}

	int getPreco() {
		if(this.quantidadeIgredientes<=2) {
			return 15;
		}else if(this.quantidadeIgredientes >= 3 && this.quantidadeIgredientes <= 5) {
			return 20;
		}else {
			return 23;
		}
	}

	 void contabilizaIngrediente(String ingrediente) {
		 Integer quantidadeTotal=0;
		 
		 if(contabilidade.containsKey(ingrediente)) {
			 quantidadeTotal = contabilidade.get(ingrediente);
		 }
		 
		 quantidadeTotal++;
		 contabilidade.put(ingrediente, quantidadeTotal);
	}
	 

}
