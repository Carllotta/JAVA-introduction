public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Funcionario f) {
	boolean autenticou = f.autenticacao(this.senha);
		
		if(autenticou) {
			System.out.println("Pode acessar o sistema!");
		}else {
			System.out.println("N�o pode acessar o sistema!");
		}
	}
}
