package chainOfResponsibility;

public class CalculadorDeDesconto {

	public double calcula(Orcamento orcamento) {
		
		Desconto descontos = new DescontoPorCincoItens();
		Desconto descontoVendaCasada = new DescontoPorVendaCasada();
		Desconto descontoPorMaisDeQuinhentosReais = new DescontoPorMaisDeQuinhentosReais();
		Desconto semDesconto = new SemDesconto();
		
		descontos.setProximo(descontoVendaCasada); //Faz a ordem 
		descontoVendaCasada.setProximo(descontoPorMaisDeQuinhentosReais); // faz a cadeia
		descontoPorMaisDeQuinhentosReais.setProximo(semDesconto);
		// em caso contrario
		return descontos.desconta(orcamento);
		
	}
}
