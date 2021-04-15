package commandEObserver;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		String nome = "Amanda Oliveira";
		String email = "amanada@gmail.com";
		
		GeraClienteDTO gerador = new GeraClienteDTO(nome, email);
		GeraClienteHandler handler = new GeraClienteHandler(Arrays.asList(
				new SalvarClienteNoBancoDeDados(),
				new EnviarEmailCupomCliente()));
		
		Cliente clienteCadastrado = handler.execute(gerador);
		
	}
}
