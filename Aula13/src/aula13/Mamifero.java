package aula13;

public class Mamifero extends Animal{
	private String corPelo;
	
	@Override
	public void emitirSom() {
		System.out.println("Som de mam�fero");
	}
	
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	public String getCorPelo() {
		return corPelo;
	}
}
