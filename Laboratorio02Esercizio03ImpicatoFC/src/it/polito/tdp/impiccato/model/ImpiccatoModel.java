package it.polito.tdp.impiccato.model;

import it.polito.tdp.impiccato.db.ParolaDAO;

import java.util.HashSet;
import java.util.Set;

public class ImpiccatoModel {

	private String segreto;
	private int errori;
	private final int MAX_ERRORI = 8;
	private String maschera;

	private Set<String> provate;

	public int getErrori() {
		return errori;
	}

	public int getMAX_ERRORI() {
		return MAX_ERRORI;
	}

	public String getMaschera() {
		return maschera;
	}

	/**
	 * Costruttore, inizializza un modello vuoto
	 */
	public ImpiccatoModel() {
		segreto = null;
		errori = 0;
		provate = new HashSet<String>();
	}

	/**
	 * Inizia una nuova partita
	 * 
	 * @param segreto
	 *            La parola da indovinare
	 */
	public void startGame(String segreto) {
		this.segreto = segreto.toUpperCase();

		errori = 0;
		provate.clear();

		maschera = "";
		for (int i = 0; i < segreto.length(); i++)
			maschera = maschera + "_";
	}

	/**
	 * Controlla se la lettera specificata fa parte della parola. Lettere non
	 * esistenti oppure lettere ripetute sono valutate come errori.
	 * 
	 * @param t
	 *            La lettera da provare
	 * @return true se la lettera esiste, false se non esiste oppure se era gi�
	 *         stata detta
	 */
	public boolean tryLetter(String t) {
		t = t.toUpperCase();
		// già detta?
		if (provate.contains(t)) {
			errori++;
			return false;
		}

		provate.add(t);

		// presente?
		if (segreto.contains(t)) {
			// presente

			for (int i = 0; i < segreto.length(); i++) {
				if (segreto.charAt(i) == t.charAt(0)) {
					maschera = maschera.substring(0, i) + t
							+ maschera.substring(i + 1);
				}
			}

			return true;
		} else {
			// assente
			errori++;
			return false;
		}
	}

	/**
	 * Determina se la parola � stata indovinata
	 * 
	 * @return true se � indovinata, false se vi sono ancora lettere da
	 *         indovinare
	 */
	public boolean isWinner() {
		return (!maschera.contains("_"));
	}

	/**
	 * Determina se hai perso la partita
	 * 
	 * @return true se hai perso, false se sei ancora in gioco
	 */
	public boolean isLoser() {
		return (errori >= MAX_ERRORI);
	}

	/**
	 * Genera una nuova parola segreta, estraendola casualmente dal Dizionario
	 * memorizzato nel database
	 * 
	 * @return una parola casuale
	 */
	public String nuovoSegreto() {
		
			ParolaDAO dao = new ParolaDAO() ;
			
			int numeroParole = dao.contaParole() ;
			
			int indiceParola = (int) (Math.random() * numeroParole);
			
			String segreto = dao.findNomeParolaByPos(indiceParola) ;
			
			return segreto.toUpperCase() ;
			
	}
}
