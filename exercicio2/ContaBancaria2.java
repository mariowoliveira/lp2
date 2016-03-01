public class ContaBancaria2{
	int agencia, contaCorrente;
	double saldo, limiteExtra;
	String titularConta;
	
	public void imprimirSaldo(){
		System.out.println("Saldo: " + this.saldo);
	}
	public void imprimirSaldoTotal(){
		System.out.println("Saldo Total: " + this.saldo + this.limiteExtra);
	}
	public void imprimirAgencia(){
		System.out.println("A Agencia é: " + this.agencia);
	}
	public void imprimirContaCorrente(){
		System.out.println("A conta-corrente é: " + this.contaCorrente);
	}
	public void imprimirTitular(){
		System.out.println("O Titular da conta é: " + this.titularConta);
	}
	
	public static void main(String[] args){
	
		ContaBancaria2 cliente1 = new ContaBancaria2();
		ContaBancaria2 cliente2 = new ContaBancaria2();
		
		System.out.println("Objeto 1: ");
		cliente1.titularConta = "Mário";		
		cliente1.agencia = 3610;
		cliente1.contaCorrente = 15766;
		cliente1.saldo = 35.54;
		cliente1.limiteExtra = 50.00;
		cliente1.imprimirTitular();
		cliente1.imprimirAgencia();
		cliente1.imprimirContaCorrente();
		cliente1.imprimirSaldo();
		cliente1.imprimirSaldoTotal();

		System.out.println("Objeto 2: ");
		cliente2.titularConta = "João";		
		cliente2.agencia = 1810;
		cliente2.contaCorrente = 6132;
		cliente2.saldo = 42.31;
		cliente2.limiteExtra = 75.00;
		cliente2.imprimirTitular();
		cliente2.imprimirAgencia();
		cliente2.imprimirContaCorrente();
		cliente2.imprimirSaldo();
		cliente2.imprimirSaldoTotal();
	}
}


