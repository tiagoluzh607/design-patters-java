package strategyinvestimento;

public class Conservador implements Investimento{

	@Override
	public double aplica(Conta conta) {
		return conta.getValor() * 0.008;
	}

}
