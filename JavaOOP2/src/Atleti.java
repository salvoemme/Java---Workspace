
public class Atleti implements Ordinabile{
	int pettorale = 0;
	int età = 0;
	int prestazione = 0;
	public static final double COEFFICENTE_ETA = 0.4;
	
	
	public Atleti(int pettorale,int età, int prestazione){
		this.pettorale = pettorale;
		this.età = età;
		this.prestazione = prestazione;
	}
	
	public boolean minoreDi(Object altroAtleta){
		if (altroAtleta == null || !(altroAtleta instanceof Atleti))
			return false;
		else
			return this.getIndPrestazione()< ((Atleti)altroAtleta).getIndPrestazione();
	}
	
	public boolean maggioreDi(Object altroAtleta){
		return !(minoreDi(altroAtleta));
	}
	
	public double getIndPrestazione(){
		return this.prestazione - (COEFFICENTE_ETA*this.età);
	}
}
