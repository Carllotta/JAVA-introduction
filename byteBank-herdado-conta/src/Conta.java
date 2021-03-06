public abstract class Conta{
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta (int agencia, int numero ) {
		
		Conta.total++; //total faz parte da classe Conta, e n�o de cada objeto criado a partir dela
		// System.out.println("O total de contas criadas �: " + total);
		this.agencia = agencia;
		this.numero = numero;
		
		//System.out.println("A conta foi criada com sucesso! O n�mero da sua ag�ncia �: " + this.agencia + ""
				// + "-" + this.numero);
	}
	
	public abstract void deposita(double valor);
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			
			return true;
		}else {
			return false;
		}
	}
	
	public double pegaSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int novoNumero) {
		
		if(novoNumero <= 0) {
			System.out.println("O n�mero � inv�lido!");
			return; 
		}
	 this.numero = novoNumero;	
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("O n�mero da ag�ncia � inv�lido!");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
}