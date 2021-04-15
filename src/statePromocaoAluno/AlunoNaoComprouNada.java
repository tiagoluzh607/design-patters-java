package statePromocaoAluno;

public class AlunoNaoComprouNada extends SituacaoAluno {

	@Override
	public void tornarAlunoCliente(Aluno aluno) {
		aluno.setSituacao(new AlunoCliente());
	}

	@Override
	public Double precoDoCursoParaOAluno(Aluno aluno) {
		return 99d;
	}
}
