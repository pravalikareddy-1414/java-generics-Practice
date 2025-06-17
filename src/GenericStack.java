import java.util.ArrayList;
import java.util.List;


public class GenericStack<T>{
	
	
	List <T> data = new ArrayList<>();
	
	public void push(T item) {
		
		 data.add(item);
		 
			}
	
	public T pop() {
		
		T item = data.remove(data.size()-1);
		return item;
	}
	
	 public T peek() {
		
		T item = data.get(data.size()-1);
		return item;
		
		
	}
	
	public boolean isEmpty() {
		return data.isEmpty();
	}
	
	
	
	public static void main(String[] args) {
		
		GenericStack<Integer> intStack = new GenericStack<>();
		intStack.push(10);
		intStack.push(20);
		intStack.push(30);
		System.out.println("Integer Stack Top: " + intStack.peek());
        System.out.println("Popped: " + intStack.pop());
        System.out.println("Is Empty: " + intStack.isEmpty());
        
        
        // Test with String
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Hari");
        stringStack.push("Sai");

        System.out.println("String Stack Top: " + stringStack.peek());
        System.out.println("Popped: " + stringStack.pop());
        System.out.println("Is Empty: " + stringStack.isEmpty());
		
		 
	}
	
}