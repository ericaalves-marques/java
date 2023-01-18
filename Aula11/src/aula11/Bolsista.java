package aula11;

public class Bolsista extends Aluno{
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.nome);
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.nome + " é bolsista, pagamento facilitado.");
	}
	
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	public float getBolsa() {
		return bolsa;
	}
}
