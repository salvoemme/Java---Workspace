
public class DriverWordSetArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long inizio;
		
		WordSetArrayList ws = new WordSetArrayList();
		
		inizio = System.nanoTime();
		ws.stressTest(10L);
		System.out.println(System.nanoTime() - inizio);
		ws.dump();
		System.out.println(ws.getCalderone().size());
		System.out.println(ws.add("tag_91"));
		ws.dump();
		System.out.println(ws.getCalderone().size());
		
		
	}
	

}
