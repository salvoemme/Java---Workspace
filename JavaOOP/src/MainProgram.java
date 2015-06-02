import java.util.Random;


public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("--------------------------------------------------Esercizio 1) Punto");
		Punto p = new Punto(1,-1);
		
		System.out.println("Il valore di x è --> " + p.getX());
		System.out.println("Il valore di y è --> " + p.getY());
		System.out.println("Il punto si trova nel " + p.localizzaQuadrante() + "° quadrante");
		
		Random r = new Random();
		for (int i = 0; i<10000; i++)
			if (r.nextInt(10)==5)
				new Punto();
		
		System.out.println("Sono state create n°" + Punto.getConta() + " instanze di Punto");
		System.out.println("--------------------------------------------FINE--Esercizio 1) Punto");
		System.out.println("\n");
		
		System.out.println("--------------------------------------------------Esercizio 2) Frazione");
		Frazione f1 = new Frazione(1,2);
		System.out.println("Il frazione f1 è " + f1.toString() + " il valore è " + f1.valoreReale());
		Frazione f2 = new Frazione(2);
		System.out.println("Il frazione f2 è " + f2.toString() + " il valore è " + f2.valoreReale());
		Frazione f3 = new Frazione();
		System.out.println("Il frazione f3 è " + f3.toString() + " il valore è " + f3.valoreReale());
		Frazione f4 = new Frazione("23/12");
		System.out.println("Il frazione f4 è " + f4.toString() + " il valore è " + f4.valoreReale());
		Frazione f5 = f1.somma(f2);
		System.out.println("Il frazione f5 è " + f5.toString() + " il valore è " + f5.valoreReale());
		
		System.out.println("--------------------------------------------FINE--Esercizio 2) Frazione");
		System.out.println("\n");
		
		System.out.println("--------------------------------------------------Esercizio 3) Segmento");
		Segmento s = new Segmento(1,0);
		System.out.println("Il primo punto è " + s.getP1().toString());
		System.out.println("Il secondo punto è " + s.getP2().toString());
		System.out.println("La lunghezza del segmento è " + s.lunghezza());
		System.out.println("---------------------------------------------FINE-Esercizio 3) Segmento");
		System.out.println("\n");
		
		System.out.println("--------------------------------------------------Esercizio 4) Rettangolo");
		Rettangolo re = new Rettangolo(10,10,5,6);
		System.out.println("Base ----->" + re.getBase());
		System.out.println("Altezza -->" +re.getAltezza());
		System.out.println("Punto x -->" + re.getPuntoAltoSx().getX());
		System.out.println("Punto y -->" + re.getPuntoAltoSx().getY());
		System.out.println("L'area del rettangolo è " + re.area());
		System.out.println("Il perimetro del rettangolo è " + re.perimetro());
		
		Punto px = new Punto(0,1);
		System.out.println(px.getX());
		System.out.println(px.getY());
		re = new Rettangolo();
		System.out.println("Base ----->" + re.getBase());
		System.out.println("Altezza -->" +re.getAltezza());
		System.out.println("Punto x -->" + re.getPuntoAltoSx().getX());
		System.out.println("Punto y -->" + re.getPuntoAltoSx().getY());
		System.out.println("L'area del rettangolo è " + re.area());
		System.out.println("Il perimetro del rettangolo è " + re.perimetro());		
		
		System.out.println("---------------------------------------------FINE-Esercizio 4) Rettangolo");
		System.out.println("\n");
		
		System.out.println("--------------------------------------------------Esercizio 5) Quadrato");
		Quadrato q = new Quadrato(1,1,5);
		System.out.println(q.area());
		System.out.println("Il perimetro del rettangolo è " + q.perimetro());
		
		System.out.println("---------------------------------------------FINE-Esercizio 5) Quadrato");
		System.out.println("\n");
	}

}
