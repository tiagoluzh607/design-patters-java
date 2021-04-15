package strategyinvestimento;

public class Executa {

	public static void main(String[] args) {
		
		Conta conta = new Conta(100);
		
		RealizadorDeInvertimentos realizadorDeInvertimentos = new RealizadorDeInvertimentos();
		
		realizadorDeInvertimentos.realizaInvestimento(conta, new Conservador());
		System.out.println(conta);
		
		realizadorDeInvertimentos.realizaInvestimento(conta, new Moderado());
		System.out.println(conta);
		
		realizadorDeInvertimentos.realizaInvestimento(conta, new Arrojado());
		System.out.println(conta);
		
	}

}
