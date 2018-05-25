package game;

public class RegistroPontos {
	
	

	private CalculadoraBonus bonus;
	
	
	public RegistroPontos(CalculadoraBonus cb) {
		bonus = cb;
	}
	
	
	public void fazerComentario(Usuario u) {
		u.pontos += 3 * bonus.bonusUsuario(u);
	}
	public void criarTopico(Usuario u) {
		u.pontos += 5 * bonus.bonusUsuario(u);
	}

	public void darLike(Usuario u) {
		u.pontos += 1* bonus.bonusUsuario(u);
	}
}
