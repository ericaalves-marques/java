package vetor04;

import java.util.Arrays;

public class Vetor04 {

	public static void main(String[] args) {
		int vet[] = {3, 7, 6, 1, 9, 4, 2};
		int p = Arrays.binarySearch(vet, 1);
		for(int valor: vet) {
			System.out.print(valor + " ");
		}
		System.out.println(" ");
		System.out.print("Encontrei o valor na posição " + p);

	}

}
