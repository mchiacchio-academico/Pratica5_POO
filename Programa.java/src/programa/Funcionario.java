package programa;

public class Funcionario {
	
	public String nome;
	public String departamento;
	public double salario;
	public String datadeEntrada;
	public String RG;
	public boolean estanaEmpresa;
	
	public Funcionario(String nome, String departamento, double salario, String datadeEntrada, String rG,
			boolean estanaEmpresa) {
		super();
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.datadeEntrada = datadeEntrada;
		RG = rG;
		this.estanaEmpresa = estanaEmpresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDatadeEntrada() {
		return datadeEntrada;
	}

	public void setDatadeEntrada(String datadeEntrada) {
		this.datadeEntrada = datadeEntrada;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public boolean isEstanaEmpresa() {
		return estanaEmpresa;
	}

	public void setEstanaEmpresa(boolean estanaEmpresa) {
		this.estanaEmpresa = estanaEmpresa;
	}
	
	
	
	

}
