package strategyinvestimento;

import java.util.Random;

public class Arrojado implements Investimento {

	@Override
	public double aplica(Conta conta) {
		
		double sorteado = new Random().nextDouble();
		
		if(sorteado <= 0.50) {
			return conta.getValor() * 0.006;
			
		}else if(sorteado <= 0.80) {
			return conta.getValor() * 0.03;
		}else {
			return conta.getValor() * 0.05;
		}
	}

}
