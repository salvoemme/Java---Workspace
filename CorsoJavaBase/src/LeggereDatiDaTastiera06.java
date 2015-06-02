import java.util.Scanner;


public class LeggereDatiDaTastiera06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = leggiTelefono();
		
		System.out.println(s);
		System.out.println("Fine pgm...");
	}
	public static String leggiTelefono(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci il numero di telefono");
		
		while (!sc.hasNext("[0-9]{2,4}\\-[0-9]{6,7}")){
			System.out.println("Formato errato");
			sc.next();
			
		}
		return sc.next();
	}
	
}
