package algoritmi.sort;

import java.util.Random;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Si confronta la cella in canna con le successive e dopo si va avanti, il minimo si mette nella cella e viceversa...
		
		short x = 10;
		int valoreMassimo = 9;
		int[] nEs = new int[x];
		
		Random r = new Random();
		
		for (int i=0; i<x; i++){
			nEs[i] = r.nextInt(valoreMassimo);
		}
		
		for (int i=0; i<x; i++){
			System.out.print("[" + i + "]<"
					+ nEs[i] + ">;");
		}
		int totGiriSort = 0;
		int comodo = 0;
		for (int i=0; i<x;  i++){
			totGiriSort +=1;
			for (int i2=i+1; i2<x; i2++){
				totGiriSort +=1;
				if (nEs[i2] < nEs[i]){
					comodo = nEs[i2];
					nEs[i2] = nEs[i];
					nEs[i] = comodo;
				}
			}
		}
		System.out.println("");
		for (int i=0; i<x; i++){
			System.out.print("[" + i + "]<"
					+ nEs[i] + ">;");
		}
		System.out.println("\nIl totale dei giri è " + totGiriSort);
		
	}

}
