package br.com.projetoltibd2;

import java.util.Date;

/**
 * Programa que permite buscar um Projeto ou uma tecnologia.
 */
public class DiretorioProjeto {
	ProjetoLTI projetoSaude = null;
	ProjetoLTI projetoMobile = null;

	/**
	 * Cria um Diretorio recebendo os projetos saude e projeto mobile.
	 * @param projeto1
	 * nome do projeto a ser direcionado
	 * @param projeto2
	 * nome do projeto a ser direcionado
	 */
	DiretorioProjeto(ProjetoLTI projeto1, ProjetoLTI projeto2) throws proExcepti {

		this.projetoSaude = projeto1;
		this.projetoMobile = projeto2;

	}
	/**
	 * Chama informacoes amazenadas em algum projeto
	 * @param  titulo titulo do projeto
	 * @param Date a data do projeto
	 * @param String responsavel do projeto
	 * @param Aluno aluno que pertence ao projeto
	 * @return informacoes amazenadas no projeto 
	 */

	public ProjetoLTI obterProjeto(String titulo, Date date, String responsavel, Aluno aluno) {
		ProjetoLTI projeto = null;
		if ((projetoSaude.professorResponsavel.equals(responsavel)) && (projetoSaude.getTitulo().equals(titulo))
				&& (date == projetoSaude.getDataInicial()) && (projetoSaude.procuraAluno(aluno))) {
			projeto = projetoSaude;

		} else if ((projetoSaude.professorResponsavel.equals(responsavel)) && (projetoSaude.getTitulo().equals(titulo))
				&& (date == projetoSaude.getDataInicial()) && (projetoSaude.procuraAluno(aluno))) {
			projeto = projetoMobile;

		}
		return projeto;

	}

	/**
	 * Chama informacoes amazenadas em Tecnologia
	 * @param  titulo titulo do projeto
	 * @param descricao do projeto
	 * @return tecnologia
	 */
	public Tecnologia obterTecnologia(String titulo, String descrisao) {
		Tecnologia tecnologia = null;
		if ("Debeve".equals(titulo) && "".equals(descrisao)) {
			tecnologia = new TecnologiaSaude();
		} else if ("saude".equals(titulo) && "".equals(descrisao)) {
			tecnologia = new TecnologiaSaude();
		}

		return tecnologia;
	}
}