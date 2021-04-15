package chainOfResponsibilityIMC;

public class MaiorQue18EMenorQue25 extends CondicaoIMC {

	public MaiorQue18EMenorQue25(CondicaoIMC proximo) {
		super(proximo);
	}

	@Override
	public String verificaCondicao(Double imc) {
		if (18.5d < imc && imc <= 25d) return "Peso normal";
		return this.proximo.verificaCondicao(imc);
	}

}
