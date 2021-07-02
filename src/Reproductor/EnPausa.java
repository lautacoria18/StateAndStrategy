package Reproductor;

public class EnPausa implements EstadoCancion {

	@Override
	public void cambiar(Song cancion) {
		// TODO Auto-generated method stub
		cancion.reproducirse();
	}

}
