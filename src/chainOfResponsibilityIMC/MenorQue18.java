package chainOfResponsibilityIMC;

public class MenorQue18 extends CondicaoIMC{

	public MenorQue18(CondicaoIMC proximo) {
		super(proximo);
	}

	@Override
	public String verificaCondicao(Double imc) {
		if (imc<=18.5d) return "Abaixo do peso normal";
		return this.proximo.verificaCondicao(imc);
	}
	
}
