package itaExcercises.tarefa;

public class Principal {

	public static void main(String[] args) {
	
		Paciente p1 = new Paciente(69, 1.70);
		Paciente p2 = new Paciente(58, 1.62);
		Paciente p3 = new Paciente(98,1.85);
		
		
		System.out.println("Paciente 1: " + p1.diagnostico(p1));
		System.out.println("Paciente 2: " + p2.diagnostico(p2));
		System.out.println("Paciente 3: " + p3.diagnostico(p3));
		

	}

}
