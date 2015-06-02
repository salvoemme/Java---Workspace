import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ProvaPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("[0-9]{2,4}\\-[0-9]{6,7}");
		Matcher m = p.matcher("02-1234567");
		boolean b = m.matches();
		System.out.println(b);
		b = Pattern.matches("a*b", "aaaaab");
		System.out.println(b);
		
	}

}
