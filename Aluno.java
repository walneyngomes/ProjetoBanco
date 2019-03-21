package br.com.projetoltibd2;

public class Aluno extends Pessoa {
	private int periodoLetivo;
	private String matricula;

	public int getPeriodoLetivo() {
		return periodoLetivo;
	}

	public void setPeriodoLetivo(int periodoLetivo) {
		this.periodoLetivo = periodoLetivo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	
}
