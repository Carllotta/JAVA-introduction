public class Atendente extends Funcionario {
	 
	public double getBonificacao() {
		
		System.out.println("Método específico do Atentende, executado!");
		return super.getBonificacao() + 100;
}
	 

}
