package conta.molde;

//herença da Conta
public class ContaPoupanca extends Conta {

	private int aniversario;
	
	public ContaPoupanca(int numero, int agenciaConta, int tipo, String titularConta, float saldo, int aniversario) {
		super(numero, agenciaConta, tipo, titularConta, saldo);
		this.aniversario = aniversario;
		// TODO Auto-generated constructor stub
	}
	
	//construtor
	public int getAniversario() {
		return aniversario;
	}
	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversário da conta: " + this.aniversario);
		
	}
	
}
