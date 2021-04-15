package chainOfResponsibilityIMCComTemplateMethod;

public abstract class CondicaoIMC {

	CondicaoIMC proximo;

	public CondicaoIMC(CondicaoIMC proximo) {
		super();
		this.proximo = proximo;
	}
	
	public String getCondicao(Double imc){
		if(deveAplicar(imc)) return condicaoDeSaude(imc);
		return proximo.getCondicao(imc);
	}
	
	protected abstract String condicaoDeSaude(Double imc);
	protected abstract boolean deveAplicar(Double imc);
	
}
