package aula14;

public class Video implements AcoesVideo{
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	public Video(String titulo){
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views= 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		this.reproduzindo = true;
	}
	@Override
	public void pause() {
		// TODO Auto-generated method stub
		this.reproduzindo = false;
	}
	@Override
	public void like() {
		// TODO Auto-generated method stub
		this.curtidas++;
	}
	
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setAvaliacao(int avaliacao){
		int nova;
		nova = (this.avaliacao + avaliacao) / this.views;
		this.avaliacao = nova;
	}
	
	public int getAvaliacao() {
		return avaliacao;
	}

	public void setViews(int views){
		this.views = views;
	}
	
	public int getViews() {
		return views;
	}

	public void setCurtidas(int curtidas){
		this.curtidas = curtidas;
	}
	
	public int getCurtidas() {
		return curtidas;
	}

	public void setReproduzindo(boolean reproduzindo){
		this.reproduzindo = reproduzindo;
	}
	
	public boolean getReproduzindo() {
		return reproduzindo;
	}
	
	@Override 
	public String toString() {
		return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas +
				", reproduzindo=" + reproduzindo + '}';
	}
}
