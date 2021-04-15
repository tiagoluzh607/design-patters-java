package chainOfResponsibilityIMC;

public abstract class CondicaoIMC {

	CondicaoIMC proximo;

	public CondicaoIMC(CondicaoIMC proximo) {
		super();
		this.proximo = proximo;
	}
	
	public abstract String verificaCondicao(Double imc);
	
}
