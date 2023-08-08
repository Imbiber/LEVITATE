package adityaTeaches.stack;
import java.util.*;

public class NSR {

	public static void main(String[] args) {
		
		int arr[]= {4,5,2,10,8};
		nge(arr);

	}
	public static void nge(int[] arr) {
		ArrayList<Integer> v= new ArrayList<>();
		Stack<Integer> s= new Stack<>();


		for(int i=arr.length-1; i>=0; i--) {
			if(s.isEmpty()) {
				v.add(-1);
			}
			else if(!s.isEmpty() && s.peek()<arr[i]) {
				v.add(s.peek());
			}
			else if(!s.isEmpty() && s.peek()>=arr[i]) {
				while(!s.isEmpty() && s.peek()>=arr[i]) {
					s.pop();
				}
				if(s.isEmpty()) {
					v.add(-1);
				}
				else {
					v.add(s.peek());
				}
			}
			s.push(arr[i]);
		} 

		ArrayList<Integer> result=new ArrayList<>();
		for(int i=v.size()-1;i>=0;i--) {
			result.add(v.get(i));
		}
		for(int num : result) {
			System.out.println(num);
		}
	}

}
