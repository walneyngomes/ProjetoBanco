package br.com.projetoltibd2;

public class FactoryTecnologia {
	public Tecnologia cria(String tipo) {
		Tecnologia tecnologia = null;

		if ("TecnologiaDevec3d".equals(tipo)) {
			tecnologia = new TecnologiaDebevec3D();
			tecnologia.descrisao();
			tecnologia.tipo();
			tecnologia.link();
			tecnologia.nome();

		} else if ("tecnologiaSaude".equals(tipo)) {
			tecnologia = new TecnologiaSaude();
			tecnologia.descrisao();
			tecnologia.tipo();
			tecnologia.link();
			tecnologia.nome();
		}
		return tecnologia;

	}

}
