package main;

public class Caza extends Nave {

	@Override
	public void avanzar() {
		System.out.println("Caza avanza");
	}

	@Override
	public void parar() {
		System.out.println("Caza se para");
	}

}
