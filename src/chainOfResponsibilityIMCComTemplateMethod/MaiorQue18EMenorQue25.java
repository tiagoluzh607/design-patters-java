package chainOfResponsibilityIMCComTemplateMethod;

public class MaiorQue18EMenorQue25 extends CondicaoIMC {

	public MaiorQue18EMenorQue25(CondicaoIMC proximo) {
		super(proximo);
	}

	@Override
	protected String condicaoDeSaude(Double imc) {
		return "Peso normal";
	}

	@Override
	protected boolean deveAplicar(Double imc) {
		return 18.5d < imc && imc <= 25d;
	}

}
