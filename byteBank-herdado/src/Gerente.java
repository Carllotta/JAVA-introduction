public class Gerente extends Funcionario {
	
	 private int senha;
	 
	 
	public void setSenha(int senha) {
		this.senha = senha;
	}
	 
	public boolean autenticacao(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		} 
	}
	 
	public double getBonificacao() {
		
		System.out.println("Método específico do gerente, executado!");
		return super.getSalario();
}
	 

}
