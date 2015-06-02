import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LeggereDatiDaTastiera04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Dati input
		 * somma iniziale
		 * percentuale annua interessi
		 * numero di anni di deposito
		 */
		
		double sIniziale = 100.0D;
		double sFinale = 0.0d;
		double percAnnuaInteressi = 10.0f;
		double numeroAnniDeposito = 5;
		
		sIniziale = leggiDouble("Inserisci la somma da depositare : ",5,100);
		sIniziale = leggiDouble("Inserisci la percentuale di interessi: ",0.5,5.1);
		sIniziale = leggiDouble("Inserisci il numero di anni : ",2,20);
		
		sFinale = calcInteressi(sIniziale,percAnnuaInteressi,numeroAnniDeposito);
		
		System.out.println(sFinale);
	}
	
	static double calcInteressi(double si, double percentuale, double anni){
		double totale = si ;
		for (int i=1; i<=anni; i++){ 
			totale = totale+(totale*percentuale/100); 
		}
		return totale;
	}
	
	static double leggiDouble(String messaggio, double valMin, double valMax){
		String rigaLetta = "";
		InputStreamReader tastiera = new InputStreamReader(System.in);
		BufferedReader bufferTastiera = new BufferedReader(tastiera);
		boolean errore = true;
		double valoreLetto = 0;
		do{
			try {
				errore = false;
				System.out.print(messaggio);
				rigaLetta = bufferTastiera.readLine();
				valoreLetto = Double.parseDouble(rigaLetta);
			} 
			
			catch (NumberFormatException e){
				System.out.println("Importo non numerico ");
				errore = true;
			}
			
			catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println("Errore input");
				errore = true;
			}

//			if (valoreLetto < valMin || valoreLetto>valMax){
//				System.out.println("Valore Fuori dai range");
//				errore = true;
//			}
		} while(errore);
		return valoreLetto;
	}
}
