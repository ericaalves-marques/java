package aula07;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int round;
	private boolean aprovada;
	private int vencedor;
	
	Random random = new Random();
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if((l1.getCategoria() == l2.getCategoria()) && (l1 != l2)) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		}else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		if(this.aprovada == true) {
			this.desafiado.apresentar();
			this.desafiante.apresentar();
			this.vencedor = random.nextInt(2);
			switch(vencedor) {
			case 0: System.out.println("Empatou!");
			this.desafiado.empatarLuta();
			this.desafiante.empatarLuta();
			case 1: System.out.println(this.desafiado.getNome());
			this.desafiado.ganharLuta();
			this.desafiante.perderLuta();
			case 2: System.out.println(this.desafiante.getNome());
			this.desafiante.ganharLuta();
			this.desafiado.perderLuta();
			}
		}else {
			System.out.println("Luta não pode acontecer!");
		}
	}
	
	public void setDesafiado(Lutador dd) {
		this.desafiado = dd;
	}
	
	public Lutador getDesafiado() {
		return desafiado;
	}
	
	public void setDesafiante(Lutador dd) {
		this.desafiante = dd;
	}
	
	public Lutador getDesafiante() {
		return desafiante;
	}
	
	public void setRound(int ro) {
		this.round = ro;
	}
	
	public int getRound() {
		return round;
	}
	
	public void setAprovada(boolean ap) {
		this.aprovada = ap;
	}
	
	public boolean getAprovada() {
		return aprovada;
	}
}
