
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.run();
	}
	
	protected void run(){
		System.out.println("Stringa");
		String s1;
		s1 = "foo";
		System.out.println(s1.hashCode());
		s1 = "ofo";
		System.out.println(s1.hashCode());
		System.out.println("Oggetto Test");
		Test t1 = new Test();
		Test t2 = new Test();
		
		t1.setName("John");
		t1.setSurname("Lennon");
		t1.setAge(40);
		System.out.println(t1.hashCode());
		
		t1.setName("George");
		t1.setSurname("Best");
		t1.setAge(55);
		System.out.println(t1.hashCode());
		
		t2.setName("John");
		t2.setSurname("Lennon");
		t2.setAge(40);
		System.out.println(t2.hashCode());
		
		
	}
}
