public class TestaGettESett {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1987, 9);
		
		Cliente carla = new Cliente();
		
		conta.setTitular(carla);
		carla.setNome("Carla Dias");
				
		System.out.println(conta.getNumero());
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Progamadora");
		System.out.println(conta.getTitular().getProfissao());
	}
}
