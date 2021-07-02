package ReproductorMP3Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Reproductor.ModoReproduccion;
import Reproductor.ModoSeleccionCanciones;
import Reproductor.ReproductorMP3;
import Reproductor.Song;

class mp3testCase {
	
	private ReproductorMP3 reproductor;
	private Song cancion;
	private ModoSeleccionCanciones modoA;
	private ModoReproduccion modoB;

	@BeforeEach
	void setUp() {
		
		cancion= new Song();
		reproductor= new ReproductorMP3();
	}

	@Test
	void testSeleccionarCancion() {
		
		reproductor.seleccionarCancion(cancion);
		
		//assertEquals(reproductor.getEstado(), new ModoReproduccion() );
	}
	@Test
	void testPausarCancion() {
		reproductor.seleccionarCancion(cancion);
		reproductor.pause();
		
	}

	@Test
	void testPausarCancionPausada() {
		
		reproductor.seleccionarCancion(cancion);
		reproductor.pause();
		reproductor.pause();
		
	}
	
	@Test
	void testDetenerCancion() {
		reproductor.seleccionarCancion(cancion);
		reproductor.stop();
	}
}
