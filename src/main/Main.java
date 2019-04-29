package main;

import java.util.List;

import externo.NaveMercenaria;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Caza cz = new Caza();
		Crucero cr = new Crucero();
		MercenariaAdapter mercenaria = new MercenariaAdapter();
		
		List<Nave>  flota = new ArrayList<Nave>();
		 flota.add(cz);
		 flota.add(cr);
		 flota.add(mercenaria);
		 for (Nave nave : flota) {
			nave.avanzar();
		}
		
	}

}
