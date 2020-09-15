public class TesteReferencias {
	
 public static void main(String[] args) {
	 
	Gerente g = new Gerente();
	g.setNome("Rafaela");
	g.setSalario(1200.00);
	
	Funcionario f = new Funcionario();
	f.setNome("Elaine");
	f.setSalario(1500.00);
	
	 
	Atendente a = new Atendente();
	a.setNome("Carlos");
	a.setSalario(1000.00 );
	
	
	ControleBonificacao controle = new ControleBonificacao();
	controle.registra(g);
	controle.registra(f);
	controle.registra(a);
	
	
	System.out.println(controle.getSoma());
	
 }
}
