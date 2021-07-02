package EncriptadorTest;

public class EncriptadorNaive {

	
	private Encriptador encriptadorActual;
	
	public EncriptadorNaive() {
		encriptadorActual= new EncriptadorOrden();
	}
	
	
	public String encriptarTexto(String texto) {
		
		return encriptadorActual.encriptar(texto);
	
	}
	public String desencriptarTexto(String texto) {
		
		return encriptadorActual.desencriptar(texto);
	}
	
	public void cambiarEncriptador(Encriptador encriptador) {
		
		encriptadorActual= encriptador;
	}
}
