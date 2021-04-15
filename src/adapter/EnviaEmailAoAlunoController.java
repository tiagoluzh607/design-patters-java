package adapter;

public class EnviaEmailAoAlunoController {
	
	private EnviadorEmail email;

	public EnviaEmailAoAlunoController(EnviadorEmail email) {
		this.email = email;
	}

	public void execute(Email email){
		this.email.enviar(email);
	}
}
