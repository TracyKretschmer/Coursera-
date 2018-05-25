package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteRegistroPontos {

	@Test
	void pontosCriarTopico() {
		Usuario u = new Usuario();
		 u.nome = "Tracy";
		 
		 CalculadoraBonus cb = new CalculadoraBonus();
		 RegistroPontos rb = new RegistroPontos(cb);
		 rb.criarTopico(u);
		 assertEquals(u.pontos, 5);
	}
	
	@Test
	void pontosCriarTopicoVIP() {
		Usuario u = new Usuario();
		 u.nome = "Tracy";
		 u.vip = true;
		 
		 CalculadoraBonus cb = new CalculadoraBonus();
		 RegistroPontos rb = new RegistroPontos(cb);
		 rb.criarTopico(u);
		 assertEquals(u.pontos, 25);
	}
	

	@Test
	void pontosCriarTopicoBonusDia() {
		Usuario u = new Usuario();
		 u.nome = "Tracy";
		 
		 CalculadoraBonus cb = new CalculadoraBonus();
		 cb.bonusDia = 3;
		 
		 RegistroPontos rb = new RegistroPontos(cb);
		 rb.criarTopico(u);
		 assertEquals(u.pontos, 15);
	}
	
	@Test
	void pontosCriarTopicoBonusDiaVIP() {
		Usuario u = new Usuario();
		 u.nome = "Tracy";
		 u.vip = true;
		 
		 CalculadoraBonus cb = new CalculadoraBonus();
		 cb.bonusDia = 2;
		 
		 RegistroPontos rb = new RegistroPontos(cb);
		 rb.criarTopico(u);
		 assertEquals(u.pontos, 50);
	}
}
