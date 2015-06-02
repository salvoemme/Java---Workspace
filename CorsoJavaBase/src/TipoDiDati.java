
public class TipoDiDati {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(17/5);
		System.out.println(17/5.0);
	//dati primitivi
	
	//2^numero di bit formula per grandezza
		
	// Byte
	 Byte minValueByte = -128; 
	 Byte maxValueByte = +127;
	 System.out.println("Valore min Byte " + minValueByte);
	 System.out.println("Valore max Byte " + maxValueByte);
	 
	// Short
	 Short minValueShort = -32768; 
     Short maxValueShort = +32767 ;
	 System.out.println("Valore min Short " + minValueShort);
	 System.out.println("Valore max Short " + maxValueShort);		
	
	 // Int
	 int minValueInt = -2147483648; 
	 int maxValueInt = +2147483647;
	 System.out.println("Valore min Int " + minValueInt);
	 System.out.println("Valore max Int " + maxValueInt);
	
	//Long alla fine si mette la "l" per fare capire che inseriamo un long
	 Long minValueLong = -9223372036854775808l;
	 Long maxValueLong = +9223372036854775807l;
	 System.out.println("Valore min Long " + minValueLong);
	 System.out.println("Valore max Long " + maxValueLong);
	 
	 //Float
	 float minValueFloat = 3.14f;
	 minValueFloat = (float) 3.12345678; //	qui si perde l'8
	 System.out.println("Valore Float " + minValueFloat);
	 float realMinValueFloat = -Float.MAX_VALUE;
	 float realMaxValueFloat = Float.MAX_VALUE;
	 System.out.println("Valore min. Float " + realMinValueFloat);
	 System.out.println("Valore mas. Float " + realMaxValueFloat);
	 
	 //Double
	 double minValueDouble = 3.14d;
	 System.out.println("Valore Double " + minValueDouble);
	 double realMinValueDouble = -Double.MAX_VALUE;
	 double realMaxValueDouble = Double.MAX_VALUE;	
	 System.out.println("Valore min. Double " + realMinValueDouble);
	 System.out.println("Valore mas. Double " + realMaxValueDouble);
	 System.out.println("TOREEEEEE-->" + String.format("%.2f", realMaxValueDouble));

	 //Char
	 char c1 = 'a';
	 System.out.println("Valore c1 <" + c1 + ">");
	 char c2 = '#';
	 System.out.println("Valore c2 <" + c2 + ">");
	 char c3 = '.';
	 System.out.println("Valore c3 <" + c3 + ">");
	 char c4 = 65; //Corrisponde al codice asci
	 System.out.println("Valore c4 <" + c4 + ">");
	 //	 char c5 = -9; //accetta solo da 0 a 155
	 char c6 = 0;
	 System.out.println("Valore c6 <" + c6 + ">");
	 char c7 = 255;
	 System.out.println("Valore c7 <" + c7 + ">");

	 int i = 100 + c4;
	 System.out.println("Valore di i <" + i + ">");
	 
	 //Boolean
	 boolean veroFalso = false;
	 System.out.println("Valore di veroFalso <" + veroFalso + ">");
	
	//String
	String cognome = "Micale";
    boolean superatoControllo = cognome.endsWith("le");
	System.out.println("Superato controllo<" + superatoControllo + ">");
	
	
	}

}
