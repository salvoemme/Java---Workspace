
public class EserciziCicli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Conta da uno fino a dieci
		System.out.println("Soluzione Do while");
		
		int conta=0;
		do{
			conta ++;
			System.out.println(conta);
		}while (conta<10);
		
		System.out.println("Soluzione while");
		conta = 0;
		while (conta<10){
			conta ++;
			System.out.println(conta);
		}
		
		System.out.println("Soluzione for");
		for (int i=1; i<=10;i++)
			System.out.println(i);
	}

}
