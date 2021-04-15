package chainOfResponsibilityIMC;

public class MaiorQue25EMenorQue30 extends CondicaoIMC {
	
	public MaiorQue25EMenorQue30(CondicaoIMC proximo) {
		super(proximo);
	}

	@Override
	public String verificaCondicao(Double imc) {
		if (25d < imc && imc<=30d) return "Acima do peso normal";
		return proximo.verificaCondicao(imc);
	}

}
