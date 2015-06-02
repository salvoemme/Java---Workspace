public class EserciziCicli02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Conta da uno fino a dieci
		System.out.println("Soluzione Do while");
		
		int conta=1;
		do{
			System.out.println(conta);
			conta ++;
			
		}while (conta<=10);
		
		System.out.println("Soluzione while");
		conta = 1;
		while (conta<=10){
			System.out.println(conta);
			conta ++;
			
		}
		
		System.out.println("Soluzione for");
		for (int i=1; i<=10;i++)
			System.out.println(i);
	}

}
