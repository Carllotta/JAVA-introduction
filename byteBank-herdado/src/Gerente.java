public class Gerente extends FuncionarioAutenticavel {
	 
	public double getBonificacao() {
		
		System.out.println("M�todo espec�fico do gerente, executado!");
		return super.getSalario();
}
	 

}
