public class Gerente extends Funcionario {
	 
	public double getBonificacao() {
		
		System.out.println("M�todo espec�fico do gerente, executado!");
		return super.getSalario();
}
	 

}
