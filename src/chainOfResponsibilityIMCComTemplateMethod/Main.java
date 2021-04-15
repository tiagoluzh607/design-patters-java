package chainOfResponsibilityIMCComTemplateMethod;

public class Main {

	public static void main(String[] args) {
		IMC imc = new IMC(90,180);
		System.out.println(imc.calculaImc());
		System.out.println(imc.condicao());
	}

}
