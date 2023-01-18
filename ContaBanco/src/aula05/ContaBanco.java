package aula05;

public class ContaBanco {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("---------------------------");
		System.out.println("Conta " + this.getNumConta());
		System.out.println("Tipo " + this.getTipo());
		System.out.println("Dono " + this.getDono());
		System.out.println("Saldo " + this.getSaldo());
		System.out.println("Status " + this.getStatus());
	}
	
	public void contaBanco() {
		this.saldo = 0;
		this.status = false;
	}
	
	public void setNumConta(int n) {
		this.numConta = n;
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	
	public void setTipo(String t) {
		this.tipo = t;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setDono(String d) {
		this.dono = d;
	}
	
	public String getDono() {
		return this.dono;
	}
	
	public void setSaldo(float s) {
		this.saldo = s;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void setStatus(boolean s) {
		this.status = s;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if(t == "CC") {
			this.setSaldo(50);
		}else if(t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!");
	}
	
	public void fecharConta() {
		if(this.saldo > 0) {
			System.out.println("Conta com dinheiro");
		}else if(this.saldo < 0){
			System.out.println("Conta em débito!");
		}else if (this.saldo == 0) {
			System.out.println("Fechada com sucesso!");
		}
		this.status = false;
	}
	
	public void depositar(float v) {
		if(this.status == true) {
			this.setSaldo(getSaldo() + v);
			System.out.println("Depósito realizado na conta de " + this.getDono());
		}else {
			System.out.println("Impossível depositar!");
		}
	}
	
	public void sacar(float v) {
		if(this.status == true) {
			if(this.saldo >= v) {
				this.setSaldo(getSaldo() - v);
				System.out.println("Saque realizado da conta de " + this.getDono());
			}else if(this.saldo < v){
				System.out.println("Saque Insuficiente!");
			}
		}else {
			System.out.println("Impossível sacar");
		}
	}
	float v;
	public void pagarMensal() {
		
		if (this.tipo == "CC") {
			v = 12;
		}else if(this.tipo == "CP") {
			v = 20;
		}if (this.status == true) {
			if(this.saldo > v) {
			setSaldo(getSaldo() - v);
			}else {
				System.out.println("Impossível pagar");
			}
		}
	}
	

}
