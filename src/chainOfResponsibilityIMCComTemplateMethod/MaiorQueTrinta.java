package chainOfResponsibilityIMCComTemplateMethod;

public class MaiorQueTrinta extends CondicaoIMC {

	public MaiorQueTrinta(CondicaoIMC proximo) {
		super(proximo);
	}

	@Override
	protected String condicaoDeSaude(Double imc) {
		return "Obesidade";
	}

	@Override
	protected boolean deveAplicar(Double imc) {
		return imc > 30d;
	}

}
