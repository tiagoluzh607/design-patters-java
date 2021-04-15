package statePromocaoAluno;

public abstract class SituacaoAluno {

	public abstract Double precoDoCursoParaOAluno(Aluno aluno);
	
	public void tornarAlunoCliente(Aluno aluno) {
		throw new RuntimeException("Não é possivel tornar aluno cliente");
	}
	
	public void tornarAlunoNaoComprouNada(Aluno aluno) {
		throw new RuntimeException("Não é possivel tornar aluno que nao comprou nada");
	}
	
}
