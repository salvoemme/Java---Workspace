
public class WordSet {
	public static final int A_BIG_NUMBER = 9999;
	
	private String[] words;
	private int numWords;
	
	public WordSet(){
		this.numWords = 0;
		this.words = new String[A_BIG_NUMBER];
	}
	
	public void testInsert(int quantita){
		for (int i=0; i<quantita;i++){
			this.words[i] = Integer.toString(i+1);
			this.numWords++;
		}
	}
	
	public void dump(){
		for (int i=0; i<numWords;i++){
			System.out.println("words[" + i + "]<" + words[i] + ">");
		}
	}
	
	public int getNumWords() {
		return numWords;
	}

	public boolean add(String valore){
		boolean newWord = true;
		for (int i=0; i<numWords;i++){
			if (this.words[i].equalsIgnoreCase(valore))
				newWord = false;
		}
		if (newWord){
			this.words[this.numWords++] = valore;
		}
		return newWord;
	}
	
	public void remove (String valore){
		int i = 0;
		boolean nonUscire = true;
		
		while (i<this.numWords && nonUscire){
			if (this.words[i].equals(valore)){
				do{
					this.words[i] = this.words[i+1];
					i++;
				} while (i<this.numWords);
				this.numWords--;
				this.words[i] = null;
				nonUscire = false;
			}
			i++;
		};
	}
	
}
