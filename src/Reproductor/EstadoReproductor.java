package Reproductor;

public interface EstadoReproductor {

	void reproducir(Song cancionActual);

	void pausar(Song cancionActual);

	void detener(Song cancionActual, ReproductorMP3 reproductorMP3);

}
