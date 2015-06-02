
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vettore = {3,8,-78,19,56,0,41,88,12,13,14,90};
		
//		try {
			System.out.println("media: " + metodoIntermedio(vettore,5));
//		}
//		catch (IllegalArgumentException eccezzione){
//			System.out.println("errore");
//		}
		
	}
	
	static int mediaInteraVett(int[] vettore, int diQuanti){
		int somma = 0;
		for (int i=0; i<diQuanti; i++)
			somma+= vettore[i];
		if (diQuanti != 0)
			return  somma/diQuanti;
		else 
			throw new ArithmeticException();
	}
	
	static int metodoIntermedio(int[] vettore, int diQuanti){
		try {
			return mediaInteraVett(vettore, diQuanti);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			return -1;
		}
	}
	
}
