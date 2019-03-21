package br.com.projetoltibd2;

import java.util.ArrayList;
/**
 * Classe que permite criar ProjetoLTISaude
 */
public class ProjetoLTISaude extends ProjetoLTI {
	private static final int PERIODO_MAX = 4;
	private static ProjetoLTISaude projeto;
	ArrayList<Aluno> equipeDeAlunos = new ArrayList<Aluno>();
	ArrayList<Tecnologia> tecnologiasUsadas = new ArrayList<Tecnologia>();

	/**
	 * Cria uma instancia unica do ProjetoLTISaude
	 * 
	 * @param Professor
	 *            para se criar um projeto, se faz necessário informar quem é o
	 *            professor responsável.
	 * @return a variavel global projeto. Realizando um singletonProjetoMobile
	 */
	public static ProjetoLTISaude getInstance(Professor prof) throws proExcepti {
		if ((projeto == null) && (prof != null) && (prof.getProjeto() == null)) {
			projeto = new ProjetoLTISaude();
			projeto.addProfessor(prof);
		} else {
			throw new proExcepti("Professor ja possui projeto.");
		}
		return projeto;
	}

	private ProjetoLTISaude() {
		this.setDescricao(" Projeto que trabalha com a coleta de sintomas(dados) para o estado do paciente");

	}
	
	 /**
		 * Adiciona um aluno.
		 * @param Aluno da aluno que deseja adicionar
		 * @exception se o Aluno nao tiver matricula 
		 * @exception se o Aluno nao tiver no 4 periodo ou mais 
		 * 
		 */
	public void addAluno(Aluno aluno) throws proExcepti {
		if (!(aluno.getMatricula() == null) && (aluno.getPeriodoLetivo() >= PERIODO_MAX)) {
			this.equipeDeAlunos.add(aluno);

		} else {
			throw new proExcepti("O aluno nao foi adicionado. Verifique a matricula ou perido.");

		}
	}
	/**
	 * Adiciona um professor.
	 * @param Professor da professor que deseja adicionar
	 * @exception se tiver o professor no projeto
	 * @exception se o professor tiver um projeto
	 */
	public void addProfessor(Professor professor) throws proExcepti {
		if (this.getProfessorResponsavel() == null) {
			this.professorResponsavel = professor;
		} else {
			throw new proExcepti("Ja tem professor");
		}

	}

	/**
	 * Adiciona uma tecnolofia.
	 * @param tipo da tecnologia que deseja
	 * 
	 */	public void  addTecnologia(String tipo) {
		FactoryTecnologia tec = new FactoryTecnologia();
		tecnologiasUsadas.add(tec.cria(tipo));

	}
	

}
