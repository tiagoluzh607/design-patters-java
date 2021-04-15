package chainOfResponsibilityIMC;

public class MaiorQueTrinta extends CondicaoIMC {

	public MaiorQueTrinta(CondicaoIMC proximo) {
		super(proximo);
	}

	@Override
	public String verificaCondicao(Double imc) {
		if( imc > 30d) return "Obsidade";
		return proximo.verificaCondicao(imc);
	}

}
