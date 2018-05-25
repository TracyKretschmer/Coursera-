package itaExcercises.carro;

public class Carro {
	
	int velocidade;
	int potencia;
	String nome;
	
	public void acelerar() {
		velocidade += potencia;
	}
	 public void frear() {
		 velocidade = velocidade / 2;
	 }
	  public int getVelocidade() {
		  return velocidade;
	  }

	  void imprimir() {
		  System.out.println("O carro "+nome+ " está a velocidade de "+ getVelocidade()+" km/hr");
	  }
}
