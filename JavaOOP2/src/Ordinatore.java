
public class Ordinatore {
	Ordinabile[] v = null;
	
	public Ordinatore(Ordinabile[] _v){
		this.v = _v.clone();
	}
	
	int posMin(int partiDa){
		int posizioneMinimo = partiDa;
		int posizioneCorrente = partiDa+1;
		while (posizioneCorrente<v.length){
			if (v[posizioneCorrente].minoreDi(v[posizioneMinimo]))
				posizioneMinimo = posizioneCorrente;
			posizioneCorrente++;
		}
		return posizioneMinimo;
	}
	
	Ordinabile[] selectionSortA_Z(){
		for (int i=0; i<v.length-1; i++){
			int posizioneMinimoDeiRimanenti = posMin(i);
			Ordinabile temp = v[i];
			v[i] = v[posizioneMinimoDeiRimanenti];
			v[posizioneMinimoDeiRimanenti] = temp;
		}
		return v;
	}
	
}
