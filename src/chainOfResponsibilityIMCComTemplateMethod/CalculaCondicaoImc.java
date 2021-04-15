package chainOfResponsibilityIMCComTemplateMethod;

public class CalculaCondicaoImc {

	public String calcular(Double imc) {
	
		String condicao = new MenorQue18(
			new MaiorQue18EMenorQue25(
			new MaiorQue25EMenorQue30(
			new MaiorQueTrinta(
			new SemCondicao()
			)))).getCondicao(imc);
		
		return condicao;
	}

}
