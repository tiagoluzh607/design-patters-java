package commandEObserver;

import java.util.List;

public class GeraClienteHandler {
	
	private List<AcaoAposGerarCliente> acoes;
	
	public GeraClienteHandler(List<AcaoAposGerarCliente> acoes) {
		this.acoes = acoes;
	}

	public Cliente execute(GeraClienteDTO gerador) {
		
		Cliente cliente = new Cliente(gerador.getNome(), gerador.getEmail());
		acoes.forEach(acao->acao.executar(cliente));
		return cliente;
		
	}
	
}
