package main;

public class Crucero extends Nave {

	@Override
	public void avanzar() {
		System.out.println("Crucero avanza");
	}

	@Override
	public void parar() {
		System.out.println("Crucero se para");
	}

}
