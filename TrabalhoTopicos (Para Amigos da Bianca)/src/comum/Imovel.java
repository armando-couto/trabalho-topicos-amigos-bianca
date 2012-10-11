package comum;


public class Imovel {
	private int numero_inscricao;
	private String enderešo;
	private String bairro;
	private int numero;
	private Pessoa pessoa;
	
	public Imovel() {}
	
	public Imovel(int numero_inscricao, String enderešo, String bairro, int numero, Pessoa pessoa) {
		this.numero_inscricao = numero_inscricao;
		this.enderešo = enderešo;
		this.bairro = bairro;
		this.numero = numero;
		this.pessoa = pessoa;
	}

	public int getNumero_inscricao() {
		return numero_inscricao;
	}

	public void setNumero_inscricao(int numero_inscricao) {
		this.numero_inscricao = numero_inscricao;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
}
