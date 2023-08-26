package alpha.hashing;
import java.util.*;
public class LinkedHashSet_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs= new LinkedHashSet<>();
		lhs.add("Ranchi");
		lhs.add("Dhanbad");
		lhs.add("Bokaro");
		lhs.add("Jamshedpur");
		System.out.println("using iterator method");
		Iterator it= lhs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); //ordered output same as whatever way it was put in
		}

		System.out.println();
		System.out.println("using advance for loop");
		for (String city:lhs) {
			System.out.println(city);

		}
		
		lhs.remove("Bokaro");
		System.out.println(lhs);
		//like was all operations are similar to what we learnt in HashMap (methods/functions)
	}

}
