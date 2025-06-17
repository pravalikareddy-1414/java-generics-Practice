import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class sum{
	
	public static<T extends Number &  Comparable<T>> T maxnumber(T a,T b,T c) {
		
	
		T max = a;
		
		if(b.compareTo(max)>0) {
			max =b;
		}
		if(c.compareTo(max) > 0) {
			max=c;
		}
		return max;
	}
	
	 public static  double SumNumbers(List<? extends Number> list) {
		 
		 double sum = 0;
		 for(Number num : list) {
			 sum += num.doubleValue();
		 }
		 System.out.println(sum);
		 return sum;
	 }
	 
	 public static void PrintList(List<? extends Object> list) {
		 
		 for(Object item : list) {
			 
			 System.out.println("item  " + item);
		 }
		 
	 }
	 
	 public static void EvenNumbers(List<? super Integer> list2) 
	 {
             for(int i =0;i<10;i++) {
            	 if(i%2==0) {
            		 list2.add(i);
            	 }
             }
             
             
             
		 
        }


}
public class GenericStacks{
	public static void main(String args[]) {
		
		 Integer maxNumber = sum.maxnumber(10, 40, 50);
		 System.out.println(maxNumber);
		 
		List<Integer> s = new ArrayList<>();
		for(int i=0;i<=5;i++) {
			s.add(i);
		}
		 
		 sum.SumNumbers(s);
		 
		 List<?> list = new ArrayList<>(Arrays.asList(1,"hari","sai",20));
		 
		 sum.PrintList(list);
		 
		 List<Integer> list2 = new ArrayList<>();
		 sum.EvenNumbers(list2);
		 System.out.println(list2);
		
		
	}
}