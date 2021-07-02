package EncriptadorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncriptadorTest {
	
	private Encriptador encriptadorBase;
	private EncriptadorNaive encriptadorN;
	private EncriptadorVocal encriptadorV;
	private EncriptadorNumero encriptadorNum;
	private EncriptadorOrden encriptadorO;
	
	@BeforeEach
	void setUp() {
		encriptadorN= new EncriptadorNaive();
		encriptadorO= new EncriptadorOrden();
		encriptadorV= new EncriptadorVocal();
		encriptadorNum= new EncriptadorNumero();
		
	}

	@Test
	void testOrden() {
		assertEquals(" como  es  estas  esto  hola  prueba una ", encriptadorN.encriptarTexto("- hola - como - estas - esto - es - una - prueba"));
		assertEquals(" la  como  banda anda ", encriptadorN.desencriptarTexto("- como - anda - la - banda"));

		
		
	}
	
	@Test
	void testVocal() {
		encriptadorN.cambiarEncriptador(encriptadorV);
		assertEquals("- hule - cumu - istes - istu - is - ane - praibe",encriptadorN.encriptarTexto("- hola - como - estas - esto - es - una - prueba"));
		assertEquals("- cimi - undu - lu - bundu",encriptadorN.desencriptarTexto("- como - anda - la - banda"));
		
	}
	
	@Test
	void testNumero() {
		encriptadorN.cambiarEncriptador(encriptadorNum);
		assertEquals("4,9,5,7,16", encriptadorN.encriptarTexto("diego"));
		assertEquals("diego", encriptadorN.desencriptarTexto("4,9,5,7,16"));
	}


}
