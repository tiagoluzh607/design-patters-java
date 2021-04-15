package adapter;

public class EnviaEmailPorGmail implements EnviadorEmail {

	@Override
	public void enviar(Email email) {
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("Enviando Email para: ");
		stringBuilder.append(email.getDestinatario());
		stringBuilder.append(" Assunto: ");
		stringBuilder.append(email.getAssunto());
		stringBuilder.append(" Mensagem: ");
		stringBuilder.append(email.getMensagem());
		
		System.out.println(stringBuilder.toString());
	}

}
