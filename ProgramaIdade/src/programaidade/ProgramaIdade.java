package programaidade;
import java.util.Scanner;
public class ProgramaIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		System.out.println("Em que ano você nasceu?");
		int nasc = t.nextInt();
		int i = 2022 - nasc;
		System.out.println("Sua idade é " + i);
		if (i>=18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
	}

}
