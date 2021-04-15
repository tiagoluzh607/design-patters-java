package decoratorComTemplateMethod;

import java.math.BigDecimal;

public abstract class Desconto {
	
	protected Desconto outroDesconto;

	public Desconto(Desconto outroDesconto) {
		this.outroDesconto = outroDesconto;
	}
		
	public abstract BigDecimal regraDesconto(BigDecimal valorTotal);
	
	public BigDecimal aplicaDesconto(BigDecimal valorTotal) {
		BigDecimal valorComDescontoAplicado = regraDesconto(valorTotal);
		if(outroDesconto != null) return outroDesconto.aplicaDesconto(valorComDescontoAplicado);
		else return valorComDescontoAplicado;
	}

}
