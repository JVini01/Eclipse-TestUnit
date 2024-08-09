package conta_corrente_etim_azul;

//create a class for many test
public class ContaCorrente {
	public String nomeTitular;
	public double saldo;
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	//method pull
	public boolean sacar(double valor) {
		if(this.saldo < valor) {
			return false;
		}
		this.saldo -= valor;
		return true;
	}
	
	//method transfer 
	public boolean tranferir(double valor, ContaCorrente contaDestino) {
		if(this.saldo < valor) {
			return false;
		}
		this.saldo -= valor;
		contaDestino.saldo += valor;
		return true;
	}
	
	//constructor build way 1
	ContaCorrente(String nomeTitular, double saldo) {
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}
	
	//constructor build way 2
	ContaCorrente(String nomeTitular){
		this.nomeTitular = nomeTitular;
	}
	
	//constructor build way 3
	ContaCorrente(double saldo){
		this.saldo = saldo;
	}

}
