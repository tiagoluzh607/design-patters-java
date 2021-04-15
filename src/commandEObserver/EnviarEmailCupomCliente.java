package commandEObserver;

public class EnviarEmailCupomCliente implements AcaoAposGerarCliente {

	public void executar(Cliente cliente) {
		System.out.println("Envia Email com o cupom para o cliente");
	}
}
