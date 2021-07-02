package EncriptadorTest;

public class EncriptadorVocal implements Encriptador {

	@Override
	public String encriptar(String string) {
		// TODO Auto-generated method stub


		String newName="";
		for (int i = 0; i < string.length(); i++) {
            if  (string.charAt(i)=='a') {
            	newName+='e';
            }
            else if  (string.charAt(i)=='e') {
            	newName+='i';
            }
            else if  (string.charAt(i)=='i') {
            	newName+='o';
            }
            else if  (string.charAt(i)=='o') {
            	newName+='u';
            }
            else if  (string.charAt(i)=='u') {
            	newName+='a';
            }
            else
            newName+= string.charAt(i);
            	
            }
        
	
	return newName;

	}

	@Override
	public String desencriptar(String string) {
		// TODO Auto-generated method stub
		String newName="";
		for (int i = 0; i < string.length(); i++) {
            if  (string.charAt(i)=='a') {
            	newName+='u';
            }
            else if  (string.charAt(i)=='e') {
            	newName+='a';
            }
            else if  (string.charAt(i)=='i') {
            	newName+='e';
            }
            else if  (string.charAt(i)=='o') {
            	newName+='i';
            }
            else if  (string.charAt(i)=='u') {
            	newName+='o';
            }
            else
            newName+= string.charAt(i);
            	
            }
        
	
	return newName;

	}
	}
