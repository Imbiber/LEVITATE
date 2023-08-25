package alpha.hashing;
import java.util.*;
public class Linked_Hash_Tree_MapCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String, Integer> hm= new HashMap<>(); // random order
		hm.put("India",150);
		hm.put("USA",100);
		hm.put("China",170);
		System.out.println(hm);
		
		LinkedHashMap <String, Integer> lhm= new LinkedHashMap<>(); // output in whatever order we put in
		lhm.put("India",150);
		lhm.put("USA",100);
		lhm.put("China",170);
		System.out.println(lhm);
		
		
		TreeMap <String, Integer> tm= new TreeMap<>(); // sorted keys order 
		tm.put("India",150);
		tm.put("USA",100);
		tm.put("China",170);
		tm.put("Africa", 40);
		System.out.println(tm);

	}

}
