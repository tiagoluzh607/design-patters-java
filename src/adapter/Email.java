package adapter;

public class Email {
	String assunto;
	String mensagem;
	String destinatario;
	
	public Email(String assunto, String mensagem, String destinatario) {
		super();
		this.assunto = assunto;
		this.mensagem = mensagem;
		this.destinatario = destinatario;
	}

	public String getAssunto() {
		return assunto;
	}

	public String getMensagem() {
		return mensagem;
	}

	public String getDestinatario() {
		return destinatario;
	}
	
	
}
