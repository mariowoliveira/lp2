public class Aluno{
	int idade;
	String nome, numeroMatricula;
	
	public void imprimirDadosCadastrais(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Numero Matricula: " + this.numeroMatricula);
	}

	
	public static void main(String[] args){
	
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();
		System.out.println(" ");

		System.out.println("Aluno 1: ");
		aluno1.nome = "Mário";		
		aluno1.idade = 17;
		aluno1.numeroMatricula = "201418110175";
		aluno1.imprimirDadosCadastrais();
		System.out.println(" ");

		System.out.println("Aluno 2: ");
		aluno2.nome = "João";		
		aluno2.idade = 16;
		aluno2.numeroMatricula = "201418110123";
		aluno2.imprimirDadosCadastrais();
		System.out.println(" ");

		System.out.println("Aluno 3: ");
		aluno3.nome = "Antonio";		
		aluno3.idade = 18;
		aluno3.numeroMatricula = "201318110042";
		aluno3.imprimirDadosCadastrais();
		System.out.println(" ");

		System.out.println("Aluno 4: ");
		aluno4.nome = "Salam";		
		aluno4.idade = 18;
		aluno4.numeroMatricula = "201318110555";
		aluno4.imprimirDadosCadastrais();

	}
}


