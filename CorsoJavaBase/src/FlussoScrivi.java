import java.io.*;

public class FlussoScrivi {
    public static void main(String[] args) throws IOException {
        
        // creo un oggetto FileWriter...
        FileWriter fileout = new FileWriter("/Users/salvoemme/documents/tore.txt");
        // ... che incapsulo in un BufferedWriter...
        BufferedWriter filebuf = new BufferedWriter(fileout);
        // ... che incapsulo in un PrintWriter
        PrintWriter printout = new PrintWriter(filebuf);
        
        printout.println("Scrivo nel file copyprintwrite.txt:");

        printout.print("Un numero: ");
        printout.println(Math.PI);

        printout.print("Un oggetto: ");
        printout.println(new java.awt.Rectangle(10,15,20,30));

        printout.println("Ho finito.");
        printout.close();
        System.out.println("\nBye bye!");
    }
}