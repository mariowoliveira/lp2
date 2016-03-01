public class Calculadora{
	int variavel1, variavel2;
	
	public void soma(){
		System.out.println("A soma dos dois números são: " + (this.variavel1 + this.variavel2));
	}
	public void subtracao(){
		System.out.println("A subtração dos dois números são: " + (this.variavel1 - this.variavel2));
	}
	public void multiplicacao(){
		System.out.println("A multiplicação dos dois números são: " + (this.variavel1 * this.variavel2));
	}
	public void divisao(){
		System.out.println("A divisão dos dois números são: " + (this.variavel1 / this.variavel2));
	}
	
	public static void main(String[] args){
	
		Calculadora calculo1 = new Calculadora();
		Calculadora calculo2 = new Calculadora();
		Calculadora calculo3 = new Calculadora();
		
		System.out.println("Calculo 1: ");
		calculo1.variavel1 = 10;		
		calculo1.variavel2 = 10;
		calculo1.soma();
		calculo1.subtracao();
		calculo1.multiplicacao();
		calculo1.divisao();

		System.out.println(" ");		
		System.out.println("Calculo 2: ");
		calculo2.variavel1 = 12;		
		calculo2.variavel2 = 4;
		calculo2.soma();
		calculo2.subtracao();
		calculo2.multiplicacao();
		calculo2.divisao();

		System.out.println(" ");		
		System.out.println("Calculo 3: ");
		calculo3.variavel1 = 30;		
		calculo3.variavel2 = 2;
		calculo3.soma();
		calculo3.subtracao();
		calculo3.multiplicacao();
		calculo3.divisao();
	}
}


