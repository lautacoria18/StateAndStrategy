package Videojuego;

public class ModoDosJugadores implements EstadoArcade {



	@Override
	public void pressStart(Arcade arcade) {
		// TODO Auto-generated method stub
		System.out.println("Comenzaras a jugar el modo dos jugadores! Preparate!");
		arcade.jugarPartida(2);
	}



}
