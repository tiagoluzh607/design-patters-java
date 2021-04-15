package chainOfResponsibilityIMCComTemplateMethod;

public class SemCondicao extends CondicaoIMC {
	
	public SemCondicao() {
		super(null);
	}
	
	public SemCondicao(CondicaoIMC proximo) {
		super(proximo);
	}

	@Override
	protected String condicaoDeSaude(Double imc) {
		return null;
	}

	@Override
	protected boolean deveAplicar(Double imc) {
		return true;
	}

}
