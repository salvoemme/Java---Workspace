import java.io.*; 

public class LeggereDatiDaTastiera02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader tastiera = new InputStreamReader(System.in);
		int numero = 0;
		try {
			numero = tastiera.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Il codice asci solo inl primo byte<" + numero + ">");
	}

}
