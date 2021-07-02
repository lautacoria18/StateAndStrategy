package Reproductor;

public class Song {
	
	private EstadoCancion estado;

	public Song() {
		
		estado= null;
	}
	
	public void reproducirse() {
		// TODO Auto-generated method stub
		estado= new EnReproduccion() ;
		System.out.println("Estas escuchando Te para Tres");
		
	}

	public void pausarse() {
		// TODO Auto-generated method stub
		estado.cambiar(this);
		
	}

	public void detenerse() {
		// TODO Auto-generated method stub
		estado= new Detenida() ;
		System.out.println("Se detuvo su cancion");
	}

	public void pausar() {
		// TODO Auto-generated method stub
		estado= new EnPausa() ;
		System.out.println("Se pauso su cancion");
	}

}
