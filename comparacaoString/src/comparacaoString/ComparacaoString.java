package comparacaoString;

public class ComparacaoString {
	public static void main(String[] args) {
		String nome1 = "�rica";
		String nome2 = "�rica";
		String nome3 = new String("Erica");
		String res;
		res = (nome1.equals(nome3))? "igual":"diferente";
		System.out.println(res);
	}

}
