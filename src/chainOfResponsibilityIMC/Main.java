package chainOfResponsibilityIMC;

public class Main {

	public static void main(String[] args) {
		IMC imc = new IMC(75,179);
		System.out.println(imc.calculaImc());
		System.out.println(imc.condicao());
	}

}
