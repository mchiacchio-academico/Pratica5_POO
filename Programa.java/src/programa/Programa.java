package programa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1= new Pessoa("Marcelo", 1.75f, 81.2f);
		Pessoa p2= new Pessoa("Cláudio", 1.83f, 93.6f);
		Pessoa p3= new Pessoa("Márcia", 1.64f, 56.7f);
		
		Pessoa[] pessoas = new Pessoa[10];
		for(int i=0; i<10; i++) {
		pessoas[i]=new Pessoa("Julia", 1.71f, 69.9f);
		}
		Funcionario[] funcionarios = new Funcionario[100];
		
	}

}
