package aula13;

public class Aula13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lobo x = new Lobo();
		x.emitirSom();
		
		Cachorro c = new Cachorro();
		
		c.reagir("Ol�");
		c.reagir("Vai apanhar");
		c.reagir(11, 45);
		c.reagir(21, 00);
		c.reagir(true);
		c.reagir(false);
		c.reagir(2, 12.5f);
		c.reagir(17, 4.5f);
	}
}
