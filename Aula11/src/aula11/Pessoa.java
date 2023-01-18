package aula11;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String sexo;
	
	public void fazerAniversario() {
		this.idade++;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	@Override
	public String toString() {
		return "Dados{" + "nome=" + nome + " idade=" + idade + " sexo=" + sexo + "}";
	}
	
}
