package itaExcercises.compra;

public class Compra {

	int valorTotal;
	int numeroParcelas;
	
	//a vista
	Compra(int valor){
		valorTotal = valor;
		numeroParcelas = 1;
	}
	
	//parcelado
	Compra(int qtdParcelas, int valorParcela){
		numeroParcelas = qtdParcelas;
		valorTotal = valorParcela * qtdParcelas;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(int numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}
	
	public int getValorParcela() {
		return valorTotal/getNumeroParcelas();
	}
	
}
