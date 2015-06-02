
public class Concorrenti implements Ordinabile {
	private int nConcorrente = 0;
	private int giri = 0;
	private int tempoInSecondi = 0;
	
	public Concorrenti(int nConcorrente, int giri, int tempoInSecondi){
		this.nConcorrente = nConcorrente;
		this.giri = giri;
		this.tempoInSecondi = tempoInSecondi;
	}
	
	
	public boolean minoreDi(Object altro){
		if (altro == null || !(altro instanceof Concorrenti))
			return false;
		else{
			if (this.getGiri() < ((Concorrenti)altro).getGiri())
				return true;
			else{
				if (this.getGiri() == ((Concorrenti)altro).getGiri()){
					if (this.getTempoInSecondi() < ((Concorrenti)altro).getTempoInSecondi())
						return false;
					else
						return true;
				}else
					return false;
			}
				
		}
		
	}
	
	public boolean maggioreDi(Object altro){
		return !(minoreDi(altro));
	}

	public int getnConcorrente() {
		return nConcorrente;
	}

	public void setnConcorrente(int nConcorrente) {
		this.nConcorrente = nConcorrente;
	}

	public int getGiri() {
		return giri;
	}

	public void setGiri(int giri) {
		this.giri = giri;
	}

	public int getTempoInSecondi() {
		return tempoInSecondi;
	}

	public void setTempoInSecondi(int tempoInSecondi) {
		this.tempoInSecondi = tempoInSecondi;
	}
	
	public String toString(){
		return "Macchina n°" + this.getnConcorrente() + " Giri " + this.getGiri() + " Tempo " + 
		this.getTempoInSecondi();
	}

}
