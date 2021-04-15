package adapter;

public class Main {

	public static void main(String[] args) {
		
		Email email = new Email("Promoçãoo", "Promoção para o Carlos", "carlos@gmail.com");
		
		EnviaEmailAoAlunoController enviaEmailCtrl = 
				new EnviaEmailAoAlunoController(new EnviaEmailPorGmail());
		enviaEmailCtrl.execute(email);
	}

}
