public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente carla = new Cliente();
		carla.nome = "Carla Dias";
		carla.cpf = "010.101.010-10";
		carla.profissao = "Estagi�ria";

		Conta contaDaCarla = new Conta();
		contaDaCarla.deposita(1000);
		
		contaDaCarla.titular = carla;
		
		System.out.println("Ol�, " + contaDaCarla.titular.nome +"! Seja bem vindo(a)!");

	}
}
