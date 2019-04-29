package main;

import externo.NaveMercenaria;

public class MercenariaAdapter extends Nave{

	private NaveMercenaria mercernaria;
	
	public MercenariaAdapter() {
		mercernaria = new NaveMercenaria();
	}
	
	@Override
	public void avanzar() {
		mercernaria.arrancar();
		mercernaria.desplazarse();
	}

	@Override
	public void parar() {
		mercernaria.detenerse();
	}
	
}
