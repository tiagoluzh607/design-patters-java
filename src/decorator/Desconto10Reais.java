package decorator;

import java.math.BigDecimal;

public class Desconto10Reais extends Desconto {

	public Desconto10Reais(Desconto outroDesconto) {
		super(outroDesconto);
	}

	@Override
	public BigDecimal aplicaDesconto(BigDecimal valorTotal) {
		BigDecimal valorComDescontoAplicado = valorTotal.subtract(new BigDecimal(10));
		if(outroDesconto != null) return outroDesconto.aplicaDesconto(valorComDescontoAplicado);
		else return valorComDescontoAplicado;
	}

}
