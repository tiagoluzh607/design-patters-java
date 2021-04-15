package composite;

import java.math.BigDecimal;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class LucroMensal implements Valor  {

	private YearMonth mesAno;
	private List<Valor> receitas;
	private List<Valor> despesas;
	private BigDecimal valor = BigDecimal.ZERO;
	
	public LucroMensal(YearMonth mesAno) {
		super();
		this.mesAno = mesAno;
		this.receitas = new ArrayList<>();
		this.despesas = new ArrayList<>();
	}
	
	public void addReceita(Valor itemComValor){
		valor = valor.add(itemComValor.getValor());
		receitas.add(itemComValor);
	}
	
	public void addDespesa(Valor itemComValor){
		valor = valor.subtract(itemComValor.getValor());
		despesas.add(itemComValor);
	}

	public BigDecimal getValor() {
		return valor;
	}	
	
	@Override
	public String toString() {
		return this.mesAno.toString()+" - "+getValor();
	}
	
}
