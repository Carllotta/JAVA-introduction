public class Gerente extends FuncionarioAutenticavel {
	 
	public double getBonificacao() {
		
		System.out.println("Método específico do gerente, executado!");
		return super.getSalario();
}
	 

}
