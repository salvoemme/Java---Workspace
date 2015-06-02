import java.util.Scanner;


public class LeggereDatiDaTastiera05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sIniziale = 100.0D;
		double sFinale = 0.0d;
		double percAnnuaInteressi = 10.0f;
		double numeroAnniDeposito = 5;
		int quantiAnni= 0;	
		sIniziale = leggiDoubleScanner("Inserisci la somma iniziale-->",100,1000000);
		percAnnuaInteressi = leggiDoubleScanner("Inserisci la percentuale di interessi -->",1.1,10.5);
		numeroAnniDeposito = leggiDoubleScanner("Inserisci il numero anni di deposito -->",1,15);
	
		sFinale = calcInteressi(sIniziale,percAnnuaInteressi,numeroAnniDeposito);	
		
		quantiAnni = cInteressiUnMilione(sIniziale,percAnnuaInteressi,numeroAnniDeposito);	
		
		System.out.println("L'investimento frutterà " + sFinale + " di cui " + sIniziale + 
				" inizialmente versati per un guadagno netto di "
				+ (sFinale - sIniziale));
		System.out.println("Per superare il milione devi aspettare " + quantiAnni + 
				           " anni");
		System.out.println("Fine Pgm");
	}
	
	static int cInteressiUnMilione(double si, double percentuale, double anni){
		double totale = si ;
		int quantiAnni = 0;
		while (totale <= 1000000){ 
			totale = totale+(totale*percentuale/100);
			quantiAnni += 1;
		}
		return quantiAnni;
	}
	
	static double calcInteressi(double si, double percentuale, double anni){
		double totale = si ;
		for (int i=1; i<=anni; i++){ 
			totale = totale+(totale*percentuale/100); 
		}
		return totale;
	}
	
	static double leggiDoubleScanner (String messaggio, double minValue, double maxValue){
		Scanner sc = new Scanner(System.in);
		double risultato = 0;
		do{
			System.out.print(messaggio);
			
			while(!sc.hasNextDouble()){
				System.out.println("valore non numerico");
				sc.nextLine();
				System.out.print(messaggio);
			}
			risultato = sc.nextDouble();		
			if (risultato < minValue || risultato > maxValue){
				System.out.println("Valore fuori dai range " + minValue + " e " + maxValue);
			}
		} while (risultato < minValue || risultato > maxValue);
		return risultato;
	}

}
