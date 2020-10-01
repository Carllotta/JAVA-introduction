
public class TesteGerente {

	public static void main(String[] args) {
		
		
		Autenticavel referencia = new Cliente ();
		
		Gerente g1 = new Gerente ();
		
		
		g1.setNome("Carla Dias");
		g1.setCpf("21212121-21");
		g1.setSalario(3000.00);
		g1.setSenha(12345);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		boolean autenticacao = g1.autentica(12345);
		
		System.out.println(autenticacao);
		System.out.println(g1.getBonificacao());

	}

}