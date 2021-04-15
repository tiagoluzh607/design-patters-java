package composite;

import java.math.BigDecimal;

public class Receita implements Valor {

	private String nome;
	private BigDecimal valor;
	
	public Receita(String nome, BigDecimal valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public String getNome() {
		return nome;
	}
}
