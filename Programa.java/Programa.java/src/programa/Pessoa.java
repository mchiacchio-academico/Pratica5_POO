package programa;

public class Pessoa {
	
	public String nome;
	public float altura;
	public float peso;
	int idade;

	public Pessoa(String nome, float altura, float peso, int idade) {
		super();
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void Imprimir() {
		System.out.println("Nome: "+nome+"\n Peso: "+peso+"\n Altura: "+altura+"\n Idade: "+idade); 
			}
	
	public void aniversario() {
		this.setIdade(this.getIdade()+1);
	}
	

}
