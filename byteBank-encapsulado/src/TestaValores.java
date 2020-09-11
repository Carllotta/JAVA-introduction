public class TestaValores {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1542, 6);
		Conta conta2 = new Conta(1245, 8);
		Conta conta3 = new Conta(2648, 9);
		
		System.out.println("O total de contas é: " + Conta.getTotal());
	}
}
