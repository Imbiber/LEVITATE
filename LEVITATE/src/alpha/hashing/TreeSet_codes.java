package alpha.hashing;
import java.util.*;
public class TreeSet_codes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Ranchi");
		ts.add("Dhanbad");
		ts.add("Bokaro");
		ts.add("Jamshedpur");
		System.out.println("using iterator method");
		Iterator it= ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); //ascending ordered output
		}

		System.out.println();
		System.out.println("using advance for loop");
		for (String city:ts) {
			System.out.println(city);

		}
		
		ts.remove("Bokaro");
		System.out.println(ts);
		//like was all operations are similar to what we learnt in HashMap (methods/functions)
	}

}

