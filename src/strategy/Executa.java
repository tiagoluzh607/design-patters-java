package strategy;

public class Executa {

	public static void main(String[] args) {
		new CalculadorDeImposto().realizaCalculo(new Orcamento(100), new ISS());
		
		new CalculadorDeImposto().realizaCalculo(new Orcamento(100), new ICCC());
		new CalculadorDeImposto().realizaCalculo(new Orcamento(1000), new ICCC());
		new CalculadorDeImposto().realizaCalculo(new Orcamento(10000), new ICCC());
	}
}
