package proxy;

import chainOfResponsibilityIMC.IMC;

public class Main {

	public static void main(String[] args) {
		
		
		IMC imc = new IMC(78,179);
		
		IMCProxy imcProxy = new IMCProxy(imc);
		
		System.out.println(imcProxy.calculaImcLento());
		System.out.println(imcProxy.calculaImcLento());
		System.out.println(imcProxy.calculaImcLento());
		System.out.println(imcProxy.calculaImcLento());
		System.out.println(imcProxy.calculaImcLento());

	}

}
