package it.salvoemme.model;

import java.util.LinkedList;
import java.util.List;

public class SaccoModel {
	private List<String> parole;
	private int guessWrong;
	
	public SaccoModel(){
		parole = new LinkedList<String>();
		guessWrong = 0;
	}
	
	
	public int addWord(String word){
		if (word.length()<= 2){
			this.guessWrong++;
			return 3;
		}
		if (this.parole.size() == 0){
			this.parole.add(word);
			return 1;
		}
		
		if (this.parole.contains(word)){
			this.guessWrong++;
			return 2;
		} 
		
		String s = this.parole.get(this.parole.size()-1);
		System.out.println(s); 
		s = s.substring(s.length()-2, s.length());
		System.out.println(s);
		if (word.startsWith(s)){
			this.parole.add(word);
			return 1;
		}else{
			this.guessWrong++;
			return 3;
		}	
	}


	public List<String> getParole() {
		return parole;
	}


	public void setGuessWrong(int guessWrong) {
		this.guessWrong = guessWrong;
	}


	public int getGuessWrong() {
		return guessWrong;
	}
	
	
}
