package pessoa;

public class Livro implements Publicacao{
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	

	
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}
	
	
	public String detalhes() {
		return "Livro{" + "titulo=" + titulo + ", autor=" + autor + "\n, totPaginas=" + 
	", pagAtual=" + pagAtual + ", aberto=" + aberto + "\n, leitor=" + leitor.getNome() + 
	", idade=" + leitor.getIdade() + ", sexo=" + leitor.getSexo() +'}'; 
	}
	
	public void setTitulo(String titulo) {
		
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setAutor(String autor) {
		
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setTotPaginas(int totPaginas) {
		
	}
	
	public int getTotPaginas() {
		return totPaginas;
	}
	
	public void setPagAtual(int pagAtual) {
		
	}
	
	public int getPagAtual() {
		return pagAtual;
	}
	
	public void setAberto(boolean aberto) {
		
	}
	
	public boolean getAberto() {
		return aberto;
	}
	
	public void setLeitor(Pessoa leitor) {
		
	}
	
	public Pessoa getLeitor() {
		return leitor;
	}


	@Override
	public void abrir() {
		this.aberto = true;
		
	}


	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		this.aberto = false;
	}


	@Override
	public void folhear(int p) {
		// TODO Auto-generated method stub
		if(p> this.totPaginas) {
			this.pagAtual = 0;
		}else { 
			this.pagAtual = p;
		}
	}


	@Override
	public void avancarPag() {
		// TODO Auto-generated method stub
		this.pagAtual++;
	}


	@Override
	public void voltarPag() {
		// TODO Auto-generated method stub
		this.pagAtual--;
	}
}
