package aula12;

public class Peixe extends Animal{
	private String corEscama;
	
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo subst�ncias");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Peixe n�o faz som");
	}
	
	public void soltarBolha() {
		System.out.println("Soltou uma bolha");
	}
	
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	public String getCorEscama() {
		return corEscama;
	}

}
