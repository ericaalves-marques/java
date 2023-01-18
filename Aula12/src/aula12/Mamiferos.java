package aula12;

public class Mamiferos extends Animal{
	private String corPelo;
	
	@Override
	public void locomover() {
		System.out.println("Correndo");	
	}
	
	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Som de mamífero");
	}
	
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	public String getCorPelo() {
		return corPelo;
	}
}
