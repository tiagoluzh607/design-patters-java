package chainOfResponsibility;

public interface Desconto {
	public double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);
}
