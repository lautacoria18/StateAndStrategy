package EncriptadorTest;

public class EncriptadorNumero implements Encriptador {

	@Override
	public String encriptar(String string) {
		// TODO Auto-generated method stub

        
        String newName="";
        for (int i = 0; i < string.length(); i++) {
        // instrucción switch con tipo de datos int
        switch (string.charAt(i)) 
        {
            case 'a' :  newName+="1,";
                     break;
            case 'b' :  newName+="2,";
            break;
            case 'c' :  newName+="3,";
            break;
            case 'd' :  newName+="4,";
            break;
            case 'e' :  newName+="5,";
            break;
            case 'f' :  newName+="6,";
            break;
            case 'g' :  newName+="7,";
            break;
            case 'h' :  newName+="8,";
            break;
            case 'i' :  newName+="9,";
            break;
            case 'j' :  newName+="10,";
            break;
            case 'k' :  newName+="11,";
            break;
            case 'l' :  newName+="12,";
            break;
            case 'm' :  newName+="13,";
            break;
            case 'n' :  newName+="14,";
            break;
            case 'ñ' :  newName+="15,";
            break;
            case 'o' :  newName+="16,";
            break;
            case 'p' :  newName+="17,";
            break;
            case 'q' :  newName+="18,";
            break;
            case 'r' :  newName+="19,";
            break;
            case 's' :  newName+="20,";
            break;
            case 't' :  newName+="21,";
            break;
            case 'u' :  newName+="22,";
            break;
            case 'v' :  newName+="23,";
            break;
            case 'w' :  newName+="24,";
            break;
            case 'x' :  newName+="25,";
            break;
            case 'y' :  newName+="26,";
            break;
            case 'z' :  newName+="27,";
            break;
            case ' ' :  newName+="0,";
            break;
            
  
        }
        
    }
        
        String palabraFinal= eliminarComaSi(newName);
        return palabraFinal;
	}

	private String eliminarComaSi(String str) {
		// TODO Auto-generated method stub
		String result = null;
		if (str.charAt(str.length() - 1) == ',' && (str != null) && (str.length() > 0)) {
			   
			 
			      result = str.substring(0, str.length() - 1);
			   
			 
			}
		return result;
		}
		
	


	@Override
	public String desencriptar(String string) {
		// TODO Auto-generated method stub

		String palabra = string;
		String[] parts = string.split(",");
        String newName="";
        for (int i = 0; i < parts.length; i++) {
        // instrucción switch con tipo de datos int
        switch (parts[i]) 
        {
            case "1" :  newName+="a";
            break;
            case "2" :  newName+="b";
            break;
            case "3" :  newName+="c";
            break;
            case "4" :  newName+="d";
            break;
            case "5" :  newName+="e";
            break;
            case "6" :  newName+="f";
            break;
            case "7" :  newName+="g";
            break;
            case "8" :  newName+="h";
            break;
            case "9" :  newName+="i";
            break;
            case "10" :  newName+="j";
            break;
            case "11" :  newName+="k";
            break;
            case "12" :  newName+="l";
            break;
            case "13" :  newName+="m";
            break;
            case "14" :  newName+="n";
            break;
            case "15"  :  newName+="ñ";
            break;
            case "16" :  newName+="o";
            break;
            case "17" :  newName+="p";
            break;
            case "18" :  newName+="q";
            break;
            case "19" :  newName+="r";
            break;
            case "20" :  newName+="s";
            break;
            case "21" :  newName+="t";
            break;
            case "22" :  newName+="u";
            break;
            case "23" :  newName+="v";
            break;
            case "24" :  newName+="w";
            break;
            case "25" :  newName+="x";
            break;
            case "26" :  newName+="y";
            break;
            case "27" :  newName+="z";
            break;
            case "0" :  newName+=" ";
            break;
            case "28" :  newName+=" ";
            break;
            
  
        }
        
    }
        
       return newName ;
	}

}
