package alpha.arrayList;
import java.util.ArrayList;
public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(5);
		list.add(9);
		list.add(6);
		list.add(8);
		
		int max1=Integer.MIN_VALUE;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)>max1) {
				max1=list.get(i);
			}
		}
		System.out.println("The max element in the list is "+max1);
		
		
		// Approach 2
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<list.size();i++) {
			max2=Math.max(max2, list.get(i));
		}
		System.out.println("The max element using Math.max function in the list is "+max2);

	}

}
