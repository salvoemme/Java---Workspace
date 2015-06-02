import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class WordSetArrayList {
	private List<String> calderone;
	
	public WordSetArrayList() {
		calderone = new LinkedList<String>();
	}

	public List<String> getCalderone() {
		return calderone;
	}
	
	public void stressTest(long quantita){
		for (int i=0; i<quantita; i++){
			this.calderone.add("tag_"+i);
		}
	}
	
	public void dump(){
		System.out.println("Elenco");
		Iterator<String> i = this.calderone.iterator();
		while(i.hasNext())
			System.out.println("Estraggo numero " + i.next());
	}
	
	public boolean add(String valore){
		if (!this.calderone.contains(valore)){
			this.calderone.add(valore);
			return true;
		}else{
			return false;
		}
	}
	
	public void remove(String valore){
		this.calderone.remove(valore);
	}
}
