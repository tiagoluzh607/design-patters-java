package composite;

import java.math.BigDecimal;
import java.time.YearMonth;

public class Main {
	public static void main(String[] args) {
		
		//Lucro Mes atual
		LucroMensal lucroMesAtual = new LucroMensal(YearMonth.now());
		lucroMesAtual.addReceita(new Receita("salario", new BigDecimal(1000)));
		lucroMesAtual.addReceita(new Receita("investimentos", new BigDecimal(500)));
		
		lucroMesAtual.addDespesa(new Despesa("aluguel", new BigDecimal(600)));
		
		LucroMensal lucroMesPassado = new LucroMensal(YearMonth.now().minusMonths(1));
		lucroMesPassado.addReceita(new Receita("salario", new BigDecimal(1000)));
		lucroMesPassado.addReceita(new Receita("investimentos", new BigDecimal(1300)));
		
		lucroMesPassado.addDespesa(new Despesa("aluguel", new BigDecimal(500)));
		
		
		lucroMesAtual.addReceita(lucroMesPassado);
		System.out.println(lucroMesAtual);
	}
}
