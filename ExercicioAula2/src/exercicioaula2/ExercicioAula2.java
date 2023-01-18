package exercicioaula2;

public class ExercicioAula2 {
	public static void main(String[] args) {
		Mouse m = new Mouse();
		
		m.cor = "Vermelho e preto";
		m.funciona();
		m.quebrado = false;
		m.peso = "Leve";
		m.status();
		m.clicar();
		
		Mouse m2 = new Mouse();
		m.cor = "Vermelho";
		m.funciona = false;
		m.quebrado = true;
		m.peso = "Leve";
		m.status();
		m.clicar();
	}
	
}
