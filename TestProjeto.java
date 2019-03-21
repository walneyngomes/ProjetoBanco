package br.com.projetoltibd2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * Classe de teste
 */
public class TestProjeto {
	
	@Before
	public void instanciaAluno()
	{
		
	}
	@Before
	public void intanciaProfessor(){
		
	}
	@Before
	public void instanciaProjetoSaude(){
		
	}
	@Before
	public void instanciaProjetoMobile(){
		
	}

	@Test
	public void testAluno() {
		Aluno aluno = new Aluno();
		aluno.setMatricula("23323");
		aluno.setPeriodoLetivo(3);
		aluno.setNome("AMANDA");
		aluno.setCpf("059.944.955.23");
		assertEquals("AMANDA", aluno.getNome());
		assertEquals("23323", aluno.getMatricula());
		assertEquals("059.944.955.23", aluno.getCpf());
		assertEquals(3, aluno.getPeriodoLetivo());
	}

	@Test(expected = Exception.class)
	public void testProfessor() throws proExcepti {
		Professor professor = new Professor();

		ProjetoLTI projeto = ProjetoLTISaude.getInstance(professor);
		professor.setProjeto(projeto);

		professor.setNome("AMANDA");
		professor.setCpf("059.944.955.23");
		assertEquals("AMANDA", professor.getNome());
		assertEquals("059.944.955.23", professor.getCpf());
		assertEquals(projeto, professor.getProjeto());

	}

	@Test(expected = proExcepti.class)
	public void testAdicionarUmProfessorParaDoisProjeto() throws proExcepti {
		Professor professor = new Professor();
		ProjetoLTI projetoSaude = ProjetoLTISaude.getInstance(professor);

		professor.setProjeto(projetoSaude);

		ProjetoLTI projetoMobile = ProjetoLTIMobile.getInstance(professor);

		assertEquals(null, projetoMobile);

	}

	@Test(expected = proExcepti.class)
	public void testAdicionarProfessorParaUmProjeto() throws proExcepti {
		Professor professor = new Professor();
		ProjetoLTI projetoSaude = ProjetoLTISaude.getInstance(professor);
		professor.setProjeto(projetoSaude);
		assertEquals(professor.getNome(), projetoSaude.getProfessorResponsavel().nome);

	}

	@Test
	public void testAdicionarAlunoMatriculado() throws proExcepti {
		Aluno aluno1 = new Aluno();
		aluno1.setMatricula("1612909888");
		aluno1.setIdade(18);
		aluno1.setCpf("089.099.999.922-12");
		aluno1.setPeriodoLetivo(4);
		Professor professor = new Professor();
		ProjetoLTI projetoSaude = ProjetoLTISaude.getInstance(professor);
		projetoSaude.addAluno(aluno1);

		Aluno aluno = new Aluno();
		aluno.setMatricula("1612909888");
		aluno.setIdade(18);
		aluno.setCpf("089.099.999.922-12");
		aluno.setPeriodoLetivo(4);
		Professor professor1 = new Professor();
		ProjetoLTI projetoSaude1 = ProjetoLTIMobile.getInstance(professor1);
		projetoSaude.addAluno(aluno);

	}

	@Test(expected = proExcepti.class)
	public void testAdicionarAlunoNaoMatriculado() throws proExcepti {
		Aluno aluno1 = new Aluno();
		aluno1.setMatricula(null);
		aluno1.setIdade(18);
		aluno1.setCpf("089.099.999.922-12");
		aluno1.setPeriodoLetivo(4);
		Professor professor = new Professor();
		ProjetoLTI projetoSaude = ProjetoLTISaude.getInstance(professor);
		projetoSaude.addAluno(aluno1);

		Aluno aluno = new Aluno();
		aluno.setMatricula(null);
		aluno.setIdade(18);
		aluno.setCpf("089.099.999.922-12");
		aluno.setPeriodoLetivo(4);
		Professor professor1 = new Professor();
		ProjetoLTI projetoSaude1 = ProjetoLTIMobile.getInstance(professor1);
		projetoSaude.addAluno(aluno);

	}

	@Test(expected = proExcepti.class)
	public void testAdicionarAlunoNoPeriodoPermitido() throws proExcepti {
		Aluno aluno1 = new Aluno();
		aluno1.setMatricula("1612909888");
		aluno1.setIdade(18);
		aluno1.setCpf("089.099.999.922-12");
		aluno1.setPeriodoLetivo(5);
		Professor professor = new Professor();
		ProjetoLTI projetoSaude = ProjetoLTISaude.getInstance(professor);
		projetoSaude.addAluno(aluno1);

		Aluno aluno = new Aluno();
		aluno.setMatricula("1612909888");
		aluno.setIdade(18);
		aluno.setCpf("089.099.999.922-12");
		aluno.setPeriodoLetivo(5);
		Professor professor1 = new Professor();
		ProjetoLTI projetoSaude1 = ProjetoLTIMobile.getInstance(professor1);
		projetoSaude.addAluno(aluno);

	}

	@Test(expected = proExcepti.class)
	public void testAdicionarAlunoNoPeriodoNaoPermitido() throws proExcepti {
		Aluno aluno1 = new Aluno();
		aluno1.setMatricula("1612909888");
		aluno1.setIdade(2);
		aluno1.setCpf("089.099.999.922-12");
		aluno1.setPeriodoLetivo(4);
		Professor professor2 = new Professor();
		ProjetoLTI projetoSaude = ProjetoLTISaude.getInstance(professor2);
		projetoSaude.addAluno(aluno1);

		Aluno aluno = new Aluno();
		aluno.setMatricula("1612909888");
		aluno.setIdade(3);
		aluno.setCpf("089.099.999.922-12");
		aluno.setPeriodoLetivo(5);
		Professor professor1 = new Professor();
		ProjetoLTI projetoSaude1 = ProjetoLTIMobile.getInstance(professor1);
		projetoSaude.addAluno(aluno);

	}
	
	

}
