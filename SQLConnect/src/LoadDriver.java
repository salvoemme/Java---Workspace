
public class LoadDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//The newInstance() call is a work around for some
			//broken Java implementations
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception ex) {
			//mostly ClassNotFoundException
			//Handle the error
			ex.printStackTrace();
		}
	}
}
