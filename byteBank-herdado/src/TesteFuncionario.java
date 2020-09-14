
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario isa = new Funcionario();
		
		isa.setNome("Isabella Galbero");
		isa.setCpf("01010101-01");
		isa.setSalario(3500.00);
		
		System.out.println(isa.getNome());
		System.out.println(isa.getBonificacao());
	}

}
