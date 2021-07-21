package Encriptador;

import java.util.Arrays;
import java.util.Collections;

public class EncriptadorOrden implements Encriptador {

	@Override
	public String encriptar(String string) {
		// TODO Auto-generated method stub
		
		String palabra = string;
		String[] parts = string.split("-");
		
		Arrays.sort(parts);   
		String orden= "";
		for (int i=0; i< parts.length; i++) {
			
			orden+= parts[i];

		}

		return orden;

	}

	@Override
	public String desencriptar(String string) {
		// TODO Auto-generated method stub
		String palabra = string;
		String[] parts = string.split("-");
		
		Arrays.sort(parts, Collections.reverseOrder());  
		String orden= "";
		for (int i=0; i< parts.length; i++) {
			
			orden+= parts[i];
	
		}
		return orden;

	}
		
	

}
