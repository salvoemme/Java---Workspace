package it.salvoemme.model;

import java.util.LinkedList;

public class ImpiccatoModel {
	private String wordLucky;
	private int numberError;
	private int numberMaxError;
	private LinkedList<String> wordFound = new LinkedList<String>();
	
	public ImpiccatoModel(){
		this.wordLucky = "";
		this.numberMaxError = 0;
		this.numberError = 0;
	}
	
	public ImpiccatoModel(String wordLucky, int numberMaxError){
		setWordLucky(wordLucky);
		this.numberMaxError = numberMaxError;
		this.numberError = 0;
	}

	public String getWordLucky() {
		return this.wordLucky;
	}

	public void setWordLucky(String wordLucky) {
		this.wordLucky = wordLucky.toUpperCase();
	}

	public int getNumberError() {
		return this.numberError;
	}

	public void setNumberError(int numberError) {
		this.numberError = numberError;
	}

	public int getNumberMaxError() {
		return this.numberMaxError;
	}

	public void setNumberMaxError(int numberMaxError) {
		this.numberMaxError = numberMaxError;
	}
	
	public LinkedList<String> getWordFound() {
		return wordFound;
	}

	public String toString(){
		return "wordLucky<" + this.wordLucky + ">numberMaxError<" + this.numberMaxError + ">numberError<" + this.numberError + ">";
	}
	
	public void insertkWord(String word){
		if (this.wordLucky.contains(word))
			this.wordFound.add(word);
		else
			this.numberError++;
	}
	
	public String getWordMask(){
		String s="";
		String t="";
		if (this.wordFound.isEmpty()){
			for (int i=0; i<this.wordLucky.length(); i++)
    			s+="_";
		} else {
			for (int i=0; i<this.wordLucky.length(); i++){
				t = this.wordLucky.substring(i, i+1);
				if (this.wordFound.contains(t))
					s+=t;
				else
					s+="_";
				}
		}
		return s;
	}
	
}
