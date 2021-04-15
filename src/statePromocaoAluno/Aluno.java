package statePromocaoAluno;

public class Aluno {
	
	private String nome;
	private SituacaoAluno situacao;

	public Aluno(String nome) {
		this.nome = nome;
		this.situacao = new NovoAluno();
	}
	
	public Double precoDoCurso() {
		return this.situacao.precoDoCursoParaOAluno(this);
	}
	
	public void setSituacao(SituacaoAluno situacao) {
		this.situacao = situacao;
	}
	
	public void tornarAlunoCliente() {
		this.situacao.tornarAlunoCliente(this);
	}
	
	public void tornarAlunoNaoComprouNada() {
		this.situacao.tornarAlunoNaoComprouNada(this);
	}
	
	
	

}
