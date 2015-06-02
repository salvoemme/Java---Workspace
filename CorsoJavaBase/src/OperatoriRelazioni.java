
public class OperatoriRelazioni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cognome1 = "Ferrari";
		String cognome2 = "Ferraria";
		
		System.out.println(cognome1.compareTo(cognome2));
		int eta = 66;
		if (eta >= 18)
			if (eta<66)
				System.out.println("Sei maggiorenne ma non in pensione");
		    else 
		    	System.out.println("Goditi la pensione");
		else
			System.out.println("Sei ancora in età scolastica");
		
		eta = 5;
		
		if (eta<65 && eta > 18)
			System.out.println("Sei maggiorenne ma non in pensione");
		else 
			System.out.println("Troppo giovane o troppo avanti con l'età");
		
		
		int mese = 5;
		
		switch (mese){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31gg");
			System.out.println(".");
		break;
		
		case 2:
			System.out.println("28gg");
			System.out.println(".");
		break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30gg");
			System.out.println(".");
		break;
		
		default:
			System.out.println("Errore");
		break;
		}
		
	}

}
