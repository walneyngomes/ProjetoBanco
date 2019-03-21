package br.com.projetoltibd2;

public class TecnologiaSaude extends Tecnologia {

	@Override
	public void nome() {
        this.nome="iclinic";
	}

	@Override
	public void tipo() {
		// TODO Auto-generated method stub
          this.tipo="Tecnologia Educacional";
	}

	@Override
	public void link() {
		// TODO Auto-generated method stub
		this.link="br.com.iclinic";

	}

	@Override
	public void descrisao() {
		// TODO Auto-generated method stub
		this.descrição="um software de gestão para clínicas e consultórios médicos de pequeno a médio porte, de todas as especialidades. ";

	}

}
