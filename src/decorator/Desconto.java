package decorator;

import java.math.BigDecimal;

public abstract class Desconto {
	
	protected Desconto outroDesconto;

	public Desconto(Desconto outroDesconto) {
		this.outroDesconto = outroDesconto;
	}
	
	public abstract BigDecimal aplicaDesconto(BigDecimal valorTotal);
	
	

}
