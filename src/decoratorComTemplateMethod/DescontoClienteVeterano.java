package decoratorComTemplateMethod;

import java.math.BigDecimal;

public class DescontoClienteVeterano extends Desconto {
	
	public DescontoClienteVeterano(Desconto outroDesconto) {
		super(outroDesconto);
	}

	@Override
	public BigDecimal regraDesconto(BigDecimal valorTotal) {
		BigDecimal valorDesconto = valorTotal.multiply(new BigDecimal(0.05));
		return valorTotal.subtract(valorDesconto);
	}
}
