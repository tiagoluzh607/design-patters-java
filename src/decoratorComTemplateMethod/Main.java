package decoratorComTemplateMethod;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		
		BigDecimal valorCurso = new BigDecimal(150);
		
		
		Desconto descontos = new Desconto10Reais(
		  new DescontoClienteVeterano(
			new DescontoNoLancamento(null)));
		
		BigDecimal valorComDesconto = descontos.aplicaDesconto(valorCurso);
		
		System.out.println(valorComDesconto);
		
	}
}
