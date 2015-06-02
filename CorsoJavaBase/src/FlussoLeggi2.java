import java.io.*;

class FlussoLeggi2 {
    public static void main(String args[]) {
        try{
            InputStreamReader reader = new InputStreamReader (System.in);
            BufferedReader myInput = new BufferedReader (reader);
            String str= new String();
            System.out.println("Inserisci il nome del file da leggere: ");
            str = myInput.readLine();

            FileInputStream fstream = new FileInputStream(str);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null)
                System.out.println (strLine);

            in.close();
        }catch (Exception e){
            System.err.println("Errore: " + e.getMessage());
        }
    }
}