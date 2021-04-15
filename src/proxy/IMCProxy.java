package proxy;
import chainOfResponsibilityIMC.IMC;

public class IMCProxy implements IMCProxyInterface {

	private IMC imc;
	private Double valorCalculado;

	public IMCProxy(IMC imc) {
		this.imc = imc;
	}
	
	@Override
	public Double calculaImcLento() {
		if(valorCalculado == null) {
			valorCalculado = imc.calculaImcLento();
		}
		return valorCalculado;
		
	}

}
