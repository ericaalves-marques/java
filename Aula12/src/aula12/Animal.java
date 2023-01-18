package aula12;

public abstract class Animal {
	protected float peso;
	protected int idade;
	protected int membro;
	
	public abstract void locomover();
	
	public abstract void alimentar();
	
	public abstract void emitirSom();
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getPeso() {
		return peso;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setMembro(int membro) {
		this.membro = membro;
	}
	
	public int getMembro() {
		return membro;
	}
}
