package decoratorComTemplateMethod;

import java.math.BigDecimal;

public class Desconto10Reais extends Desconto {

	public Desconto10Reais(Desconto outroDesconto) {
		super(outroDesconto);
	}
	
	@Override
	public BigDecimal regraDesconto(BigDecimal valorTotal) {
		return valorTotal.subtract(new BigDecimal(10));
	}

}
