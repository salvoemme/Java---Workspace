public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atleti[] elenco = {new Atleti(1,19,12),
						   new Atleti(2,19,13),
						   new Atleti(3,29,14)};
		
		Ordinatore o = new Ordinatore(elenco);
		
		Atleti[] classifica = (Atleti[]) o.selectionSortA_Z();
		System.out.println("Iscritti");
		
		for (int i=0; i<elenco.length;i++){
			System.out.println("Alteta n°" + elenco[i].pettorale + " Tempo " + elenco[i].prestazione + " età " + elenco[i].età +
					           " Indice Prestazione " + elenco[i].getIndPrestazione());
		}
		System.out.println("\nClassifica");
		for (int i=0; i<classifica.length;i++){
			System.out.println("Alteta n°" + classifica[i].pettorale +
							   " Tempo " + classifica[i].prestazione + 
							   " età " + classifica[i].età +
							   " Indice Prestazione " + classifica[i].getIndPrestazione());
		
		}
	}

}
