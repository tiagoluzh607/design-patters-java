package statePromocaoAluno;

public class NovoAluno extends SituacaoAluno {

	@Override
	public void tornarAlunoCliente(Aluno aluno) {
		aluno.setSituacao(new AlunoCliente());
	}
	
	@Override
	public void tornarAlunoNaoComprouNada(Aluno aluno) {
		aluno.setSituacao(new AlunoNaoComprouNada());
	}

	@Override
	public Double precoDoCursoParaOAluno(Aluno aluno) {
		return 159d;
	}
}
