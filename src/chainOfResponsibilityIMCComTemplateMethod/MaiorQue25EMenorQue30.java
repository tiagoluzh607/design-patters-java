package chainOfResponsibilityIMCComTemplateMethod;

public class MaiorQue25EMenorQue30 extends CondicaoIMC {
	
	public MaiorQue25EMenorQue30(CondicaoIMC proximo) {
		super(proximo);
	}

	@Override
	protected String condicaoDeSaude(Double imc) {
		return "Acima do peso normal";
	}

	@Override
	protected boolean deveAplicar(Double imc) {
		return 25d < imc && imc<=30d;
	}

}
