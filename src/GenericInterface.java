import java.util.ArrayList;
import java.util.List;

interface Repositor<T>{
	
	public void add(T item);
	
	public T get(int index);
	 List<T> getAll();
	
	
}


class IntegerRepository implements Repositor<Integer>{
	
	private List<Integer> data = new ArrayList<>();

	@Override
	public void add(Integer item) {
		// TODO Auto-generated method stub
		System.out.println("Integer" + item);
		data.add(item);  
		
	}

	@Override
	public Integer get(int index) {
		// TODO Auto-generated method stub
		return data.get(index);
		 
		
	}

	@Override
	public List<Integer> getAll() {
		// TODO Auto-generated method stub
		
		return data;
		
	}
	
}

public class GenericInterface{
	public static void main(String[] args) {
        IntegerRepository repo = new IntegerRepository();
        repo.add(10);
        repo.add(20);
        repo.add(30);

        System.out.println("All items: " + repo.getAll());
        System.out.println("Item at index 1: " + repo.get(1));
	
}
}

    