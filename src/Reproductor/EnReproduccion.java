package Reproductor;

public class EnReproduccion implements EstadoCancion {

	@Override
	public void cambiar(Song cancion) {
		// TODO Auto-generated method stub
		cancion.pausar();
	}

}
