package strategyinvestimento;

public class RealizadorDeInvertimentos {
	
	
	public void realizaInvestimento(Conta conta, Investimento estrategiaDeInvestimento){
		double lucroInvestimento = estrategiaDeInvestimento.aplica(conta);
		conta.deposita(lucroInvestimento * 0.75);
		System.out.println("Ficou para o banco: "+lucroInvestimento * 0.25);
	}
	
}
