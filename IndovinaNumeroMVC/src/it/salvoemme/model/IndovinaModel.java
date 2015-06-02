package it.salvoemme.model;

import java.util.LinkedList;
import java.util.List;

public class IndovinaModel {
	private int luckyNumber = 0;
	private List ListOfEntry; 
	
	public IndovinaModel(){
		this.ListOfEntry = new LinkedList<String>();
		this.luckyNumber = (int) ((Math.random()*100))+1;
		System.out.println("numeroLucky " + this.luckyNumber + " Size " + ListOfEntry.size());
	}
	
	public int getLuckyNumber() {
		return luckyNumber;
	}

	public List getListOfEntry() {
		return ListOfEntry;
	}
	
	public boolean insertGuess(int guess){
		if (!this.ListOfEntry.contains(Integer.toString(guess))){
			this.ListOfEntry.add(Integer.toString(guess));
			return true;	
		}
		else
			return false;
	}
	
	public int getNumberOfGuess(){
		return this.ListOfEntry.size();
	}
}
