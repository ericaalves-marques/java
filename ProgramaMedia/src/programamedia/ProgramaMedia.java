package programamedia;

import java.util.Scanner;

public class ProgramaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Primeira nota: ");
		float n1 = teclado.nextFloat();
		System.out.println("Segunda nota: ");
		float n2 = teclado.nextFloat();
		float m = (n1+n2)/2;
		System.out.println("Sua m�dia foi " + m);
		if (m > 9) {
			System.out.println("Parab�ns pequeno gafanhoto!");
		}
	}

}
