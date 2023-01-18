package aula12;

public class Aula12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mamiferos m = new Mamiferos();
		Reptil r =new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		m.setPeso(35.3f);
		m.setCorPelo("Marrom");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra j = new Cobra();
		Tartaruga t = new Tartaruga();
		GoldFish g = new GoldFish();
		Arara e = new Arara();
		
		k.emitirSom();
	}

}
