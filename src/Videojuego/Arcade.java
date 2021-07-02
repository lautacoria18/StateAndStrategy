package Videojuego;

public class Arcade {

	
	private EstadoArcade estadoActual;
	private int cantFichas;
	
	public Arcade() {
		
		estadoActual= new Encendido();
		cantFichas= 0;
	}



	public void pressStart() {
		// TODO Auto-generated method stub
		estadoActual.pressStart(this);
	
	}

	public void ingresarFicha() {
		// TODO Auto-generated method stub
		
						cantFichas++;
						this.actualizarEstado();
	}

	public int getCantFichas() {
		// TODO Auto-generated method stub
		return cantFichas;
	}



	public void jugarPartida(int fichasConsumidas) {
		// TODO Auto-generated method stub
		cantFichas-= fichasConsumidas;
		this.actualizarEstado();
		
	}



	private void actualizarEstado() {
		// TODO Auto-generated method stub
		
		
		if (cantFichas == 1) {
			estadoActual= new ModoUnJugador();
							}
			else if (cantFichas > 1){

					estadoActual= new ModoDosJugadores();
									}
				else
					estadoActual= new Encendido();
		
	}
	
}
