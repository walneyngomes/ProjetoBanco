package br.com.projetoltibd2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Programa que permite criar projetos .
 */
public abstract class ProjetoLTI {
	ArrayList<Aluno> equipeDeAlunos = new ArrayList<Aluno>();
	Professor professorResponsavel = null;
	private Date dataInicial;
	private Date possivelConclusao;
	private EnumArea areas;
	private String titulo;
	private String descricao;

	/**
	 * Adiciona uma tecnologia.
	 * 
	 * @param tipo
	 *            da tecnologia que deseja
	 * 
	 */
	public abstract void addTecnologia(String tipo);

	/**
	 * Adiciona um aluno.
	 * 
	 * @param Aluno
	 *            da aluno que deseja adicionar
	 * @exception se
	 *                o Aluno nao tiver matricula
	 * @exception se
	 *                o Aluno nao tiver no 4 periodo ou mais
	 * 
	 */
	public abstract void addAluno(Aluno aluno) throws proExcepti;

	/**
	 * Adiciona um professor.
	 * 
	 * @param Professor
	 *            da professor que deseja adicionar
	 * @exception se
	 *                tiver o professor no projeto
	 * @exception se
	 *                o professor tiver um projeto
	 */
	public abstract void addProfessor(Professor professor) throws proExcepti;

	/**
	 * Sabe a quantidade de alunos
	 * 
	 * @return quantidade
	 */
	public int quantidadeAlunos() {
		return this.getEquipeDeAlunos().size();
	}

	public ArrayList<Aluno> getEquipeDeAlunos() {
		return equipeDeAlunos;
	}

	public void setEquipeDeAlunos(ArrayList<Aluno> equipeDeAlunos) {
		this.equipeDeAlunos = equipeDeAlunos;
	}

	public Professor getProfessorResponsavel() {
		return professorResponsavel;
	}

	public void setProfessorResponsavel(Professor professorResponsavel) {
		this.professorResponsavel = professorResponsavel;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getPossivelConclusao() {
		return possivelConclusao;
	}

	public void setPossivelConclusao(Date possivelConclusao) {
		this.possivelConclusao = possivelConclusao;
	}

	public EnumArea getAreas() {
		return areas;
	}

	public void setAreas(EnumArea areas) {
		this.areas = areas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * Verifica se o aluno esta no projeto.
	 * 
	 * @param Aluno
	 *            que deseja saber se esta.
	 * @return retorna se o aluno esta presente
	 * 
	 */
	public boolean procuraAluno(Aluno aluno) {
		boolean situacao = false;
		for (Aluno a : equipeDeAlunos) {
			if (a == aluno) {
				situacao = true;
			}
		}
		return situacao;
	}

}
