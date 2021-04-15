package chainOfResponsibilityIMCComTemplateMethod;

public class MenorQue18 extends CondicaoIMC{

	public MenorQue18(CondicaoIMC proximo) {
		super(proximo);
	}

	@Override
	protected String condicaoDeSaude(Double imc) {
		return "Abaixo do peso normal";
	}

	@Override
	protected boolean deveAplicar(Double imc) {
		return imc<=18.5d;
	}
	
}
