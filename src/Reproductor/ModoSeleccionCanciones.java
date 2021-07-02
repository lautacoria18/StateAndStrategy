package Reproductor;

public class ModoSeleccionCanciones implements EstadoReproductor {

	@Override
	public void reproducir(Song cancionActual) {
		// TODO Auto-generated method stub
		System.out.println("Error, no se puede reproducir");
	}

	@Override
	public void pausar(Song cancionActual) {
		// TODO Auto-generated method stub
		System.out.println("Error, no se puede pausar");
	}

	@Override
	public void detener(Song cancionActual, ReproductorMP3 reproductor) {
		// TODO Auto-generated method stub
		System.out.println("Error, no se puede detener");
		
	}

}
