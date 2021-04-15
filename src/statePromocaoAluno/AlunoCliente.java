package statePromocaoAluno;

public class AlunoCliente extends SituacaoAluno {
	
	@Override
	public void tornarAlunoNaoComprouNada(Aluno aluno) {
		aluno.setSituacao(new AlunoNaoComprouNada());
	}

	@Override
	public Double precoDoCursoParaOAluno(Aluno aluno) {
		return 139d;
	}
}
