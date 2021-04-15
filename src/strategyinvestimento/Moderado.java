package strategyinvestimento;

import java.util.Random;

public class Moderado implements Investimento {

	@Override
	public double aplica(Conta conta) {
		
		if(sorteiaChance(50)) {
			return conta.getValor() * 0.025;
		}
		return conta.getValor() * 0.007;
	}
	
	private boolean sorteiaChance(double porcentagem) {
		return new Random().nextDouble() < porcentagem * 0.01;
	}

}
