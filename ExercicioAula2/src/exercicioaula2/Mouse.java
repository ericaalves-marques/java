package exercicioaula2;

public class Mouse {

	String cor;
	String peso;
	boolean funciona, quebrado;

	
	void status() {
		System.out.println("Cor do mouse: " + this.cor);
		System.out.println("É pesado? " + this.peso);
		System.out.println("Funciona: " + this.funciona);
	}
	void clicar() {
		if(this.funciona == true) {
			System.out.println("Estou clicando!");
		}else {
			System.out.println("ERRO! Está quebrado.");
		}
	}
	void funciona() {
		this.funciona = true;
	}
	void quebrado() {
		this.quebrado = true;
	}
	
}
