package it.polito.tdp.libretto.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Gestisce tutti i dati necessari alla memorizzazione
 * degli {@link Esame} superati.
 * 
 * @author salvoemme
 *
 */
public class LibrettoModel {
	
	private List<Esame> libretto;
	
	public LibrettoModel(){
		this.libretto = new LinkedList<Esame>();
	}
	
	public void addEsame(Esame esame){
		this.libretto.add(esame);
	}
	
	public int getNumeroEsami(){
		return this.libretto.size();
	}
	
	public double getMedia(){
		if (getNumeroEsami()==0)
			return 0;

		double tot=0.0;
		for (Esame e : this.libretto)
			tot = tot + e.getVoto();
		return tot / getNumeroEsami();
	}
}
