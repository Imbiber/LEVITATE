package alpha_Hashing;
import java.util.*;

public class BasicsMapFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		
		//Insertion -> O(1)
		map.put("India", 100);
		map.put("China", 150);
		map.put("USA", 70);
		map.put("Africa", 50);
		
		System.out.println(map); //unordered can be print in any order
		System.out.println("the size of HashMap is "+(map.size()));
		System.out.println();
		
		
		//Get -> O(1)
		int population=map.get("India");
		System.out.println("Population of India is "+population);
		System.out.println("Cuba is not in map so its population is "+(map.get("Cuba")));
		System.out.println();
		
		//containsKey -> O(1)
		System.out.println("Does this map contain this country--> "+(map.containsKey("India")));
		System.out.println("Does this map contain this country--> "+(map.containsKey("Cuba")));
		System.out.println();
		
		
		//Remove -> O(1)
		System.out.println(map.remove("China")); // it will return value of china
		System.out.println(map.remove("Cuba")); //it will return null
		System.out.println(); System.out.println();
		
		System.out.println(map);
		System.out.println();
		System.out.println("the size of HashMap is "+(map.size()));
		System.out.println();
		System.out.println("Is our map Empty "+(map.isEmpty()));
		
		map.clear();
		System.out.println("Is our map Empty "+(map.isEmpty()));

	}

}
