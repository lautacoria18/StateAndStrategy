package Reproductor;

public class ModoReproduccion implements EstadoReproductor {

	@Override
	public void reproducir(Song cancionActual) {
		// TODO Auto-generated method stub
		cancionActual.reproducirse();
	}

	@Override
	public void pausar(Song cancionActual) {
		// TODO Auto-generated method stub
		cancionActual.pausarse();
	}

	@Override
	public void detener(Song cancionActual, ReproductorMP3 reproductor) {
		// TODO Auto-generated method stub
		cancionActual.detenerse();
		reproductor.reiniciarse();
	}

}
