package conta.molde;

//abstract outras classes se basearam
public abstract class Conta {
	
	// Atributos = Caracteristicas
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	//Método construtor(Argumentos)
	public Conta(int numero, int agenciaConta, int tipo, String titularConta, float saldo) {
		
			this.numero = numero;
			agencia = agenciaConta;
			this.tipo = tipo;
			titular = titularConta;
			this.saldo = saldo;
			
		}
	//Método de acesso(Get=pegar/set=atualizar)
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	//Método sacar
	public boolean sacar(float valor) {
		//conta de subtração
		//sacar(valor) - saldo(atual)
		if(this.getSaldo() < valor) {
			System.out.println("Saldo Insuficiente!");
			return false;
		}
		else if(this.getSaldo() >= valor) {
			System.out.println("Seu saldo atual: " + saldo );
			//float SaldoAtual = (this.getSaldo()- SacarValor);
			this.setSaldo(this.getSaldo()- valor);
			System.out.println("Você sacou: " + valor );
			System.out.println("Saldo Atual: " + this.saldo );
		}
		return true;
		
	}
	
	//Método deposito
	public void depositar(float depositarvalor) {
		//conta de soma
		this.setSaldo(this.getSaldo()+ depositarvalor);
		System.out.println("Deposito realizado no valor de: " + depositarvalor );
		System.out.println("Saldo atual: " + this.saldo );
	}
	
	//Método Especificos
	public void visualizar() {
		
		String tipo="";
		
		switch(this.tipo) {
		case 1:
			tipo = "Conta Corrente";
			break;
		case 2:
			tipo = "Conta Poupança";
			break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados da Conta:");
		System.out.println("***********************************************************");
		System.out.println("Numero da Conta: " + this.numero);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo: " + this.saldo);
		
	}
	
}
