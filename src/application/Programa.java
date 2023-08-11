package application;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Conta minhaConta = new Conta();
		
		minhaConta.Titular = "YagoOliveira";
		minhaConta.numero = 5013550;
		minhaConta.saldo = 200;
		
		System.out.println("Saldo Atual" + minhaConta.saldo);
		
		minhaConta.sacar(233);
//	TODOS: adicionar msg caso o cliente não tenha saldo.
		
		if(minhaConta.sacar(201.00)) {
			System.out.println("operação efetuada com sucesso!!");
		}else {
			System.out.println("salo não suficiente");
		}
		
		
		System.out.println("Saldo depois de sacar: " + minhaConta.saldo);
		
		minhaConta.depositar(22000);
		
		System.out.println("Saldo depois de depositar" + minhaConta.saldo);
		
		
		
	
	}

}
