package br.com.projetoltibd2;

import java.util.ArrayList;

/**
 * Classe que permite criar projetoMobile
 */
public class ProjetoLTIMobile extends ProjetoLTI {
	ArrayList<Aluno> equipeDeAlunos = new ArrayList<Aluno>();
	ArrayList<Tecnologia> tecnologia = new ArrayList<Tecnologia>();
	private static final int PERIODO_MAX = 4;
	private static ProjetoLTIMobile projeto;

	/**
	 * Cria uma instancia unica do projetoMobile
	 * 
	 * @param Professor
	 *            para se criar um projeto, se faz necessário informar quem é o
	 *            professor responsável.
	 * @return a variavel global projeto. Realizando um singletonProjetoMobile
	 */
	public static ProjetoLTIMobile getInstance(Professor prof) throws proExcepti {
		if ((projeto == null) && (prof != null) && (prof.getProjeto() == null)) {
			projeto = new ProjetoLTIMobile();
			projeto.addProfessor(prof);

		} else {
			throw new proExcepti("Professor ja possui projeto.");
		}
		return projeto;
	}

	private ProjetoLTIMobile() {
		this.setDescricao(
				" Projeto que cria interfaces para o uso de dispositivos móveis na coleta de dados de mobilidade urbana em pequenas áreas. ");

	}

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
	@Override
	public void addAluno(Aluno aluno) throws proExcepti {
		if (!(aluno.getMatricula() == null) && (aluno.getPeriodoLetivo() >= PERIODO_MAX)) {
			this.equipeDeAlunos.add(aluno);
		} else {
			throw new proExcepti("O aluno nao foi adicionado. Verifique a matricula ou perido.");

		}
	}

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
	@Override
	public void addProfessor(Professor professor) throws proExcepti {
		// TODO Auto-generated method stub
		if (this.getProfessorResponsavel() == null) {
			this.professorResponsavel = professor;
		} else {
			throw new proExcepti("Ja tem professor");
		}

	}

	/**
	 * Adiciona uma tecnolofia.
	 * 
	 * @param tipo
	 *            da tecnologia que deseja
	 * 
	 */
	public void addTecnologia(String tipo) {
		FactoryTecnologia tec = new FactoryTecnologia();
		tecnologia.add(tec.cria(tipo));

	}

}
