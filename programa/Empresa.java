package programa;

public class Empresa {
	
	public String nome;
	public String CNPJ;
	public int qtde_de_funcionario;
	
	public Empresa(String nome, String cNPJ, int qtde_de_funcionario) {
		super();
		this.nome = nome;
		CNPJ = cNPJ;
		this.qtde_de_funcionario = qtde_de_funcionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public int getQtde_de_funcionario() {
		return qtde_de_funcionario;
	}

	public void setQtde_de_funcionario(int qtde_de_funcionario) {
		this.qtde_de_funcionario = qtde_de_funcionario;
	}
	
	

}
