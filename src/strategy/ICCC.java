package strategy;

public class ICCC implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		
		double orcamentoValor = orcamento.getValor();
		
		if(orcamentoValor < 1000) {
			return orcamentoValor * 0.05;
		} else if(orcamentoValor >= 1000 && orcamentoValor <= 3000) {
			return orcamentoValor * 0.07;
		} else {
			return (orcamentoValor * 0.08)+30;
		}
		
	}
	

}
