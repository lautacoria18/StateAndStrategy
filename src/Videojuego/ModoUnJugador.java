package Videojuego;

public class ModoUnJugador implements EstadoArcade {



	@Override
	public void pressStart(Arcade arcade) {
		// TODO Auto-generated method stub
		System.out.println("Comenzaras a jugar el modo un solo jugador! Preparate!");
		arcade.jugarPartida(1);
	}




	

}
