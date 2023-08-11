package application;

public class Conta {
	
	int numero;
	double saldo;
	String Titular;
	 
	 	boolean sacar(double quantidade) {
	 		if(this.saldo < quantidade) {
	 			return false;
	 		}else {
	 			this.saldo -= quantidade;
	 			return false;
	 		}
	 	}
	 
	 	
	 	void depositar(double quantidade) {
	 		double novoSaldo = this.saldo + quantidade;
	 		this.saldo = novoSaldo;
	 	}
	 	
	
	 	}
	
	
	


