public class Atendente extends Funcionario {
	 
	public double getBonificacao() {
		
		System.out.println("M�todo espec�fico do Atentende, executado!");
		return super.getBonificacao() + 100;
}
	 

}
