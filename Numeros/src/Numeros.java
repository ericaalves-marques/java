import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		int n, s = 0;
		String resp;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Digite um n�mero: ");
			n = teclado.nextInt();
			s += n; // s = s + n;
			System.out.print("Quer continuar? [S/N] ");
			resp = teclado.next();
		} while (resp.equals("s"));
		System.out.print("A soma de todos os valores � " + s);

	}

}
