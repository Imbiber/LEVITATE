package alpha.hashing;
import java.util.*;
public class Iteration_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> cities= new HashSet<>();
		cities.add("Ranchi");
		cities.add("Dhanbad");
		cities.add("Bokaro");
		cities.add("Jamshedpur");
		System.out.println("using iterator method");
		Iterator it= cities.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); //unordered output
		}
		
		System.out.println();
		System.out.println("using advance for loop");
		for (String city:cities) {
			System.out.println(city);
		}

	}

}
