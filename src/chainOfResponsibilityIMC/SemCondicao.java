package chainOfResponsibilityIMC;

public class SemCondicao extends CondicaoIMC {
	
	public SemCondicao() {
		super(null);
	}
	
	public SemCondicao(CondicaoIMC proximo) {
		super(proximo);
	}

	@Override
	public String verificaCondicao(Double imc) {
		return null;
	}

}
