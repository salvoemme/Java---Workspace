
public class Frazione {
	private int nominatore = 0;
	private int denominatore = 1;
	
	//Constructors
	public Frazione(int nominatore, int denominatore){
		this.nominatore = nominatore;
		setDenominatore(denominatore);
	}
	
	public Frazione(){
		this(0,0);
	}
	
	public Frazione(int nominatore){
		this(nominatore,0);
	}
	
	public Frazione(String stringa){
		this(Integer.parseInt(stringa.split("/")[0]),
				Integer.parseInt(stringa.split("/")[1]));
	}
	//Getters and Setters
	public int getNominatore() {
		return nominatore;
	}
	public void setNominatore(int nominatore) {
		this.nominatore = nominatore;
	}
	public int getDenominatore() {
		return denominatore;
	}
	public void setDenominatore(int denominatore) {
		if (denominatore !=0) 
			this.denominatore = denominatore;
		else 
			this.denominatore = 1;
	}
	
	//Methods
	public String toString(){
		if (this.denominatore != 1)
			return this.nominatore + "/" + denominatore;
		else
			return this.nominatore + ""; 
	}
	
	public double valoreReale(){
		return (double) this.nominatore / this.denominatore;
	}
	
	public Frazione somma(Frazione f2){
		return new Frazione (nominatore*f2.denominatore + denominatore*f2.nominatore, 
				denominatore*f2.denominatore);
	}
}
