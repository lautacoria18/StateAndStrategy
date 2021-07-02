package VideoJuegoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Videojuego.Arcade;

class VideoJuegoTestCase {

	
	private Arcade arcade;

	@BeforeEach
	void setUp() {
		arcade= new Arcade();
		
	}
	@Test
	void testIngresarFichas() {
		
		arcade.ingresarFicha();
		assertEquals(arcade.getCantFichas(), 1);
		arcade.pressStart();
		assertEquals(arcade.getCantFichas(), 0);
		}
	@Test
	void pressStartSinFichas() {

		arcade.pressStart();
		
	}
	@Test
	void testIngresarDosFichas() {
		
		arcade.ingresarFicha();
		arcade.ingresarFicha();
		assertEquals(arcade.getCantFichas(), 2);
		arcade.pressStart();
		assertEquals(arcade.getCantFichas(), 0);
		
		
	}


}
