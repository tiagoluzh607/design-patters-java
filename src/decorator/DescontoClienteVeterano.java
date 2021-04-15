package decorator;

import java.math.BigDecimal;

public class DescontoClienteVeterano extends Desconto {
	
	public DescontoClienteVeterano(Desconto outroDesconto) {
		super(outroDesconto);
	}

	@Override
	public BigDecimal aplicaDesconto(BigDecimal valorTotal) {
		BigDecimal valorDesconto = valorTotal.multiply(new BigDecimal(0.05));
		BigDecimal valorComDesconto = valorTotal.subtract(valorDesconto);
		if(outroDesconto != null) return outroDesconto.aplicaDesconto(valorComDesconto);
		else return valorComDesconto; 
	}
}
