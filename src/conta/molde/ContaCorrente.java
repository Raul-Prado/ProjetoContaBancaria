package conta.molde;


//ContaCorrente herda de Conta
public class ContaCorrente extends Conta{
	
	//variavel/atributo
	private float limite;

	//criando o construtor(e pegando os parametros)
	public ContaCorrente(int numero, int agenciaConta, int tipo, String titularConta, float saldo, float limite) {
		//SUPER é o motodo
		super(numero, agenciaConta, tipo, titularConta, saldo);
		// TODO Auto-generated constructor stub
		
		//atributo da classe
		this.limite = limite;
	}
	
	// metodos de acesso
	public float getLimite(){
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override // Override = sobrescrever
	public boolean sacar(float valor) {
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("Saldo Insuficiente!");
			return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	//métodos Especificos
	@Override //Override =  sobrescrever
	public void visualizar() {
		//SUPER ==  chamada da superclasse => Conta.viasualizar();
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
	}
}
