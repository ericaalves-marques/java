package aula14;

public class Gafanhoto extends Pessoa{
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		// TODO Auto-generated constructor stub
		this.login=login;
		this.totAssistido = 0;
	}

	private String login;
	private int totAssistido;
	
	
	
	public void viuMaisUm() {
		
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	
	public int getTotAssistido() {
		return totAssistido;
	}
	
	@Override
	public String toString() {
		return "Gafanhoto{" + super.toString() + "\n login=" + login + ", totAssistido=" + totAssistido + '}';
	}
}
