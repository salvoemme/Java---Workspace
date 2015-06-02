
public class MainConcorrenti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concorrenti[] batteria = { new Concorrenti(1,10,100),
								   new Concorrenti(2,9,100),
								   new Concorrenti(3,10,101),
								   new Concorrenti(4,10,100),
								   new Concorrenti(5,9,100),
								   new Concorrenti(6,10,101),
								   new Concorrenti(7,10,100),
								   new Concorrenti(8,9,100),
								   new Concorrenti(9,10,101),
								   new Concorrenti(10,10,100)};
		
		System.out.println("Composizione Batteria");
		for (int i=0; i<batteria.length; i++){
			System.out.println(batteria[i].toString());
		}
		
		Ordinatore o = new Ordinatore(batteria);
		
		Concorrenti[] classifica = (Concorrenti[])o.selectionSortA_Z();
		
		System.out.println("Classifica ");
		for (int i=0; i<batteria.length; i++)
			System.out.println(classifica[i].toString());
		
	};

}
