import java.util.Arrays;

class Student{
	
	public static<T> void studentName(T[] array) {
		
		for(T item : array) {
			System.out.println(item + " ");
		}
		System.out.println();
	}
	
	
	public static<T> void swap(T[] array,int i,int j) {
		
		 T number = array[i];
		 array[i] = array[j];
		 array[j] = number;
		 
		 
		 System.out.println(Arrays.toString(array));
	     
		
		 	
	}
	
	
	public static <T extends Number & Comparable<T>> T compareNumber(T num1,T num2) {
		
		return num1.compareTo(num2)>0 ? num1:num2;
		  
	}
	
}





public class Box <T>{
	private T item;
	public void set(T item) {
		this.item = item;
	}
	public T get() {
		return item;
	}
	

	
	
	
	public static void main(String args[]) {
		
		Box<String> strBox = new Box<>();
		strBox.set("Hello");
		System.out.println(strBox.get());
		
		//Integer Type
		Box<Integer> strBox1 = new Box<>();
		strBox1.set(20);
		System.out.println(strBox1.get());
		
		Student.studentName(new Integer[] {1,2,3,4});
		Student.studentName(new String[] {"Pravalika","Reddy"});
		
		Integer[] arr = {1,2,3,4,5};
		Student.swap(arr,1,3);
		
		
		Integer result1 = Student.compareNumber(10, 20);
		Double result2 = Student.compareNumber(8.5,3.2);
		
		System.out.println("Greated Integer :" + result1);
		System.out.println("Greated Double :" + result2);
		
		
		
		
		
	}
}