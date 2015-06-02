
public class MainProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figure [] disegno  = new Figure[1000];
		
		disegno[0] = new Quadrato(10,10,200);
		disegno[1] = new Quadrato(30,10,50);
		disegno[2] = new Cerchio(100,100,70);
		disegno[3] = new Rettangolo(15,10,150,89);
		disegno[4] = new Quadrato(30,10,50);
		
		int numeroFigure = 5;
		double totPerimetri = 0;
		double totAree = 0;
		for (int i=0; i<numeroFigure; i++){
			if (disegno[i] instanceof Rettangolo)
				totPerimetri += ((Rettangolo)disegno[i]).perimetro();
			else
				if (disegno[i] instanceof Quadrato)
					totPerimetri += ((Quadrato)disegno[i]).perimetro();
				else
					if (disegno[i] instanceof Cerchio)
						totPerimetri += ((Cerchio)disegno[i]).perimetro();
		}
		
		System.out.println("Il totale dei perimetri (no dynamic) è " + totPerimetri);
		
//		Late Binding  / dynamic Bindig (sono sinomini)
//		early Binding / static binding 
		totPerimetri = 0;
		
		for (int i=0; i<numeroFigure; i++){
			totPerimetri += disegno[i].perimetro();
		}
		
		for (int i=0; i<numeroFigure; i++){
			totAree += disegno[i].area();
		}
		
		System.out.println("Il totale dei perimetri è " + totPerimetri);
		System.out.println("Il totale delle aree è " + totAree);
	}

}
