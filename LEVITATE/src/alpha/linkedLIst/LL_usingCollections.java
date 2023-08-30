package alpha.linkedLIst;
import java.util.LinkedList;
public class LL_usingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<>();
		ll.addLast(5);
		ll.addLast(6);
		ll.addFirst(7);
		
		System.out.println(ll);
		
		ll.removeLast();
		ll.removeFirst();
		System.out.println(ll);

	}

}
