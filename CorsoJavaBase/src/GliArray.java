import java.util.Random;


public class GliArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		double incasso = 0;
		double totaleIncasso = 0;
		
		for (int giorno=1; giorno <= 30; giorno++){
			System.out.print("Inserire l'incasso del giorno " + giorno + " : ");
			incasso = r.nextDouble()*1000;
			System.out.println(incasso);
			totaleIncasso += incasso;
		}
		double mediaIncasso = totaleIncasso /30;
		System.out.println("Il totale incassato è  " + totaleIncasso);
		System.out.println("La media incasso è  " + mediaIncasso);
	}

}
