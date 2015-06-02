import java.io.*;



public class FlussoLeggi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leggiFiles();

	}

	public static void leggiFiles() {
		File name = new File("/Users/salvoemme/documents/input 24x80.txt");
		System.out.println(name.isFile());
		if (name.isFile()) {
			try {
				BufferedReader input = new BufferedReader(new FileReader(name));
				StringBuffer buffer = new StringBuffer();
				String text;
				while ((text = input.readLine()) != null)
					buffer.append(text + "\n");
				input.close();

				System.out.println(buffer.toString());
			} catch (IOException ioException) {
				System.err.println("Errore");
			}
		}
	}
}
