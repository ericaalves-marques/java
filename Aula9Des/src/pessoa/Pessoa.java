package pessoa;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public void fazerAniver() {
		this.idade++;
	}
	
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public void setNome(String nome) {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int idade) {
		
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setSexo(String sexo) {
		
	}
	
	public String getSexo() {
		return sexo;
	}
}
