package programa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1= new Pessoa("Marcelo", 1.75f, 81.2f, 19);
		Pessoa p2= new Pessoa("Cláudio", 1.83f, 93.6f, 21);
		Pessoa p3= new Pessoa("Márcia", 1.64f, 56.7f, 25);
		
		Pessoa[] pessoas = new Pessoa[10];
		for(int i=0; i<10; i++) {
		pessoas[i]=new Pessoa("Julia", 1.71f, 69.9f, 43);
		}
		Funcionario[] funcionarios = new Funcionario[100];
		
		Funcionario f1 = new Funcionario("frederico", "suporte", 2000, "19/04/2020", "273932", true);
		Funcionario f2 = new Funcionario("frederico", "suporte", 2000, "19/04/2020", "273932", true);
		if(f1==f2) {
			System.out.println("Iguais");
		}
		else
			System.out.println("Diferentes");
	
		p1.aniversario();
		p1.aniversario();
		p1.aniversario();
		p1.Imprimir();
	
	}
	

}
