package alpha.arrayList;
import java.util.ArrayList;

public class BasicSyntax {

	public static void main(String[] args) {
		ArrayList<Integer> list1= new ArrayList<>();
		ArrayList<String> list2= new ArrayList<>();
		ArrayList<Boolean> list3= new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println(list1);
		
		list1.get(2); 
		System.out.println(list1.get(2));
		
		list1.remove(2);
		System.out.println(list1);
		
		list1.set(1,10);
		System.out.println(list1);
		
		System.out.println(list1.contains(10));
		System.out.println(list1.contains(11));
		
		list1.add(1,99);
		System.out.println(list1);
		System.out.println(list1.size());
		//print the arrayList
		for(int i=0;i<list1.size();i++) {
			System.out.print(list1.get(i)+" ");
		}
		System.out.println();
		
		//reverse print
		for(int i=list1.size()-1;i>=0;i--) {
			System.out.print(list1.get(i)+" ");
		}
		System.out.println();
		

	}

}
