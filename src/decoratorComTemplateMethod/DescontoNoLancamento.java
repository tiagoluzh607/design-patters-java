package decoratorComTemplateMethod;

import java.math.BigDecimal;

public class DescontoNoLancamento extends Desconto {

	public DescontoNoLancamento(Desconto outroDesconto) {
		super(outroDesconto);
	}

	@Override
	public BigDecimal regraDesconto(BigDecimal valorTotal) {
		BigDecimal valorDesconto = valorTotal.multiply(new BigDecimal(0.10));
		return valorTotal.subtract(valorDesconto);
	}
}
