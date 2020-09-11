public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDaCarla = new Conta();
		 contaDaCarla.saldo = 100;
		 contaDaCarla.deposita(50);
		 System.out.println("O saldo atual é R$ " + contaDaCarla.saldo);
		 
		 boolean conseguiuRetirar = contaDaCarla.saca(20);
		 System.out.println("O saque atual após o saque é de R$ " + contaDaCarla.saldo);
		 System.out.println(conseguiuRetirar);
		 
		 Conta contaDaRafaela = new Conta();
		 contaDaRafaela.deposita(1000);
		 
		 if(contaDaRafaela.transfere(3000, contaDaCarla)) {
			 System.out.println("Transferencia feita com sucesso!");
			 System.out.println("O saldo da conta é R$ " + contaDaRafaela.saldo);
		 }else {
			 System.out.println("Não foi possível realizar a transferência pois você não possui esse valor em "
			 		+ "conta!");
			 
		 }
		 		 
		 System.out.println("O saque atual após o saque é de R$ " + contaDaCarla.saldo);
		 
	}
}
