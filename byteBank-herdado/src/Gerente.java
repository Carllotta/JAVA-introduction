public class Gerente extends Funcionario {
	 
	public double getBonificacao() {
		
		System.out.println("Método específico do gerente, executado!");
		return super.getSalario();
}
	 

}
