package aula12;

public class Cachorro extends Mamiferos{
	
	@Override 
	public void emitirSom() {
		System.out.println("Au! Au!");
	}
	public void enterrarOsso() {
		System.out.println("Enterrando osso");
	}
	
	public void abanarRabo() {
		System.out.println("Abanando rabo");
	}
}
