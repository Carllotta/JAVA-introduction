public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(FuncionarioAutenticavel fa) {
	boolean autenticou = fa	.autenticacao(this.senha);
		
		if(autenticou) {
			System.out.println("Pode acessar o sistema!");
		}else {
			System.out.println("Não pode acessar o sistema!");
		}
	}
}
