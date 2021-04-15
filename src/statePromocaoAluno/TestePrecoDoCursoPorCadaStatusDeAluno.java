package statePromocaoAluno;

public class TestePrecoDoCursoPorCadaStatusDeAluno {

	public static void main(String[] args) {
		
		Aluno tiago = new Aluno("tiago");
		
		System.out.println(tiago.precoDoCurso());
		
		tiago.tornarAlunoNaoComprouNada();
		
		System.out.println(tiago.precoDoCurso());
		
		tiago.tornarAlunoCliente();
		System.out.println(tiago.precoDoCurso());
		
		tiago.tornarAlunoNaoComprouNada();
		System.out.println(tiago.precoDoCurso());

	}

}
