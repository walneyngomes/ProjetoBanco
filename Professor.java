package br.com.projetoltibd2;

public class Professor extends Pessoa {
	ProjetoLTI projeto = null;

	public ProjetoLTI getProjeto() {
		return projeto;
	}

	public void setProjeto(ProjetoLTI projeto) {
		this.projeto = projeto;
	}

}
