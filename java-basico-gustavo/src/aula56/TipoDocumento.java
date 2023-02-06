package aula56;

public enum TipoDocumento {
	CPF {
		@Override
		public String geraNumeroTeste() {
			// TODO Auto-generated method stub
			return null;
		}
	}, CNPJ {
		@Override
		public String geraNumeroTeste() {
			// TODO Auto-generated method stub
			return null;
		}
	};	
	
	public abstract String geraNumeroTeste();
}
