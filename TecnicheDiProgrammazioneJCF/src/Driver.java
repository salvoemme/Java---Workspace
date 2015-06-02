import java.util.Scanner;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String str;
		WordSet ws = new WordSet();
		ws.testInsert(10);
		ws.dump();
		System.out.println("\nInizio ciclo");
		do{
			str = keyboard.next();
			if (!str.equals("-")){
				ws.add(str);
			}
		}while(!str.equals("-"));
		keyboard.close();
		System.out.println("\nFine ciclo");
		ws.dump();
//		ws.remove("1");
//		ws.dump();
		
	}

}
