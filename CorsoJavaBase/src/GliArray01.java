import java.util.Random;


public class GliArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int quantiGiorni = 30;
		double [] incassiGiornalieri = new double[quantiGiorni];		
		double totaleIncasso = 0;
		String[] giorniSettimana = {"Lunedì","Martedì","Mercoledì","Giovedì",
									"Venerdì","Sabato","Domenica"};
		
		for (int giorno=0; giorno < quantiGiorni; giorno++){
			System.out.print("Inserire l'incasso del giorno " + (giorno+1) + " : ");
			incassiGiornalieri[giorno] = r.nextDouble()*1000;
			System.out.println(incassiGiornalieri[giorno]);
			totaleIncasso += incassiGiornalieri[giorno];
		}
		double mediaIncasso = totaleIncasso /quantiGiorni;
		System.out.println("Il totale incassato è  " + totaleIncasso);
		System.out.println("La media incasso è  " + mediaIncasso);
		for (int giorno=0; giorno < quantiGiorni; giorno++){
			if (mediaIncasso > incassiGiornalieri[giorno])
				System.out.println("Giorno " + (giorno+1) + " l'incasso è "
				+ "stato sotto la media ed era di " + incassiGiornalieri[giorno]);
		}
		
		for (int giorno=0; giorno < quantiGiorni-1; giorno++){
			if ((mediaIncasso > incassiGiornalieri[giorno]) &&
				(mediaIncasso > incassiGiornalieri[giorno+1]))
				System.out.println("Giorno (" + (giorno+1) + ") e giorno("
						+ (giorno+2) + ") Sono sotto la media");
		}
		
		System.out.println(giorniSettimana[0]);
		
		
	}
}
