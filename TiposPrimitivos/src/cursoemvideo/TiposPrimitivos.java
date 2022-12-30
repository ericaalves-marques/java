package cursoemvideo;

import java.util.Scanner;

public class TiposPrimitivos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.print("Digite o nome do aluno: ");
		String nome = scan.next();
		System.out.print("Digite a nota do aluno: ");
		float nota = scan.nextFloat();
		System.out.println("A nota é " + nota);
		System.out.printf("A nota de %s é %.2f \n", nome, nota);
		System.out.format("A nota de %s é %.4f ", nome, nota);
	}

}
