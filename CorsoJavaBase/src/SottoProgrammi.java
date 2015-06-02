
public class SottoProgrammi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		messaggio("ciao ciao...",'s',20);
		System.out.println(clona('w',50));
	}
	
	static void messaggio(String stringa, char carattere, int numVolte){
		cornice(carattere,numVolte);
		System.out.println(stringa);
		cornice(carattere,numVolte);
	}
	
	static void cornice (char carattere, int numVolte){
		for (int i=1; i<=numVolte; i++)
			System.out.print(carattere);
		System.out.print("\n");
	}
	
	static String clona (char carattere, int numVolte){
		String stringa = "";
		for (int i=1; i<=numVolte; i++)
			stringa+=carattere;
		return stringa;
	}
}
