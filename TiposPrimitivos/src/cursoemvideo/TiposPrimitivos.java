package cursoemvideo;

import java.util.Scanner;

public class TiposPrimitivos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.print("Digite o nome do aluno: ");
		String nome = scan.next();
		System.out.print("Digite a nota do aluno: ");
		float nota = scan.nextFloat();
		System.out.println("A nota � " + nota);
		System.out.printf("A nota de %s � %.2f \n", nome, nota);
		System.out.format("A nota de %s � %.4f ", nome, nota);
	}

}
