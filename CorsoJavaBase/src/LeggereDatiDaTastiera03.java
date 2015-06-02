import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LeggereDatiDaTastiera03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int carattereLetto = -1;
		String rigaLetta = "";
		
		
		InputStreamReader tastiera = new InputStreamReader(System.in);
		BufferedReader bufferTastiera = new BufferedReader(tastiera);
		
		try {
			rigaLetta = bufferTastiera.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Questo è quello che hai inserito<" + rigaLetta +
							">");
		
	}

}
