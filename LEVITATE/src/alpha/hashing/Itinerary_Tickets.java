package alpha.hashing;
import java.util.*;
public class Itinerary_Tickets {

	public static void main(String[] args) {
		HashMap<String,String> tickets=new HashMap<>();
		tickets.put("Chennai","Bengluru");
		tickets.put("Mumbai","Delhi");
		tickets.put("Goa","Chennai");
		tickets.put("Delhi","Goa");
		
		String start= getStart(tickets);
		System.out.print(start);
		for(String key: tickets.keySet()) {
			System.out.print(" -> "+tickets.get(start));
			start=tickets.get(start);
		}

	}
	
	public static String getStart(HashMap<String,String> tickets) {
		HashMap<String,String> revTickets=new HashMap<>();
		for(String key: tickets.keySet()) {
			revTickets.put(tickets.get(key),key);
		}
		for(String key: tickets.keySet()) {
			if(!revTickets.containsKey(key)) {
				return key;			//starting point
			}
		}
		return null;
	}

}
