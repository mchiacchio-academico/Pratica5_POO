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
	
	public void bonificar(double bonificacao) {
		this.setSalario(this.getSalario()+bonificacao);
	}
	public void demitir() {
		this.setEstanaEmpresa(false);
	}
	public void mostrarDados() {
		System.out.println("Nome: "+ this.getNome());
		System.out.println("Departamento: "+this.getDepartamento());
		System.out.println("Salário: "+ this.getSalario());
		System.out.println("Data de entrada na empresa: " +this.getDatadeEntrada());
		System.out.println("RG: " +this.getRG());
		System.out.println("Está na empresa ainda? " + this.estanaEmpresa);
	}
	
	

}
