import java.util.HashMap;
import java.util.Map;

public class Pair<K,V>
{
	
	private Map<K,V> store;
	
	public Pair() {
		store = new HashMap<>();
	}
	
	public void add(K k ,V v)

     {
	   store.put(k, v);
	
     }
	
	public V get(K k) {
		return store.get(k);
	}
	public void printAll() {
		for(Map.Entry<K,V> entry : store.entrySet()) {
			
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}
	
     
	public static void main(String[] args) {
		Pair<Integer,String> student = new Pair<>();
		student.add(1, "pravalika");
		student.add(2, "reddy");
		System.out.println("Student Map:");
        student.printAll();
        
        
        Pair<String,Double> price = new Pair<>();
		price.add("Lenove " , 67899.90);
		price.add("Dell",998007.9);
		System.out.println("Prices:");
        price.printAll();
        
	}
	
}