package chainOfResponsibilityIMCComTemplateMethod;

public class IMC {
	private Integer peso;
	private Integer altura;
	
	public IMC(Integer peso, Integer altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}

	public Integer getPeso() {
		return peso;
	}

	public Integer getAltura() {
		return altura;
	}	
	
	public Double calculaImc() {
		Double alturaEmMetros = Double.valueOf(altura) / 100;
		return  (Double.valueOf(peso)/(alturaEmMetros * alturaEmMetros));
	}
	
	public String condicao() {
		Double imc = calculaImc();
		return new CalculaCondicaoImc().calcular(imc);
	}
	
}
