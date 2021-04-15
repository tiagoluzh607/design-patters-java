package strategyinvestimento;

public class Conta {
	
	private double valor;

	public Conta(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}
	
	public void deposita(double valor) {
		this.valor += valor;
	}
	
	@Override
	public String toString() {
		return "Valor da Conta: "+getValor();
	}
	
}
