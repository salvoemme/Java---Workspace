import java.util.Scanner;


public class CicliWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//      Il ciclo va in funzione fino a quando la condizione è vera
//		int num = 1;
//		
//		while (num <= 10000){
//			System.out.println(num);
//			num++;
//		}

		System.out.println("somma dei primi cento numeri");
		
		int num = 0;
		int somma = 0;
		while (num<100){
			num++;
			somma += num;
		}
		System.out.println("Esercizio 1 " + somma);
		
		System.out.println("somma dei numeri compresi tra A & B inseriti da tastiera");
		int primo, secondo;
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci il primo numero");
		primo = tastiera.nextInt();
		System.out.println("Inserisci il secondo numero");
		secondo = tastiera.nextInt();
		
		int i = primo;
		somma = 0;
		while (i<=secondo){
			somma +=i;
			i++;
		}
		System.out.println("somma dei numeri è " + somma);
		
		
//		far inserire da tastiera numeri e sommarli finchè la somma non è
//		inferiore a 1000
		somma = 0;
		primo = 0;
		while (somma < 1000){
			System.out.println("Inserisci il numero");
			primo = tastiera.nextInt();
			somma += primo;
		}
		System.out.println("somma dei numeri è " + somma);
		
	}

}
