package Reproductor;

public class ReproductorMP3 {
	
	
	private Song cancionActual;
	private EstadoReproductor estado;
	
	public ReproductorMP3(){
		
		cancionActual=null;
		estado= new ModoSeleccionCanciones();
	}

	public void play() {
		// TODO Auto-generated method stub
		if(cancionActual != null) {
		estado.reproducir(cancionActual);
		}
	}

	public void pause() {
		// TODO Auto-generated method stub
		if(cancionActual != null) {
		estado.pausar(cancionActual);
		}
	}

	public void stop() {
		// TODO Auto-generated method stub
		if(cancionActual != null) {
		estado.detener(cancionActual, this);
		}
	}

	public void seleccionarCancion(Song cancion) {
		
		if (this.cancionActual == null) {
			this.cancionActual=cancion;
			this.estado= new ModoReproduccion();
			this.play();
		}
		
		
	}
	
	public void reiniciarse() {
		// TODO Auto-generated method stub
		this.estado= new ModoSeleccionCanciones(); 
		this.cancionActual= null;
	}

	public EstadoReproductor getEstado() {
		// TODO Auto-generated method stub
		return estado;
	}
	
	
}
