package alpha.arrayList;
import java.util.*;

public class Pattern_2DArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		
		for(int i=1;i<=5;i++) {
			list1.add(1*i);
			list2.add(2*i);
			list3 .add(3*i);
		}
		mainList.add(list1);
		mainList.add(list2);
		mainList.add(list3);
		
		System.out.println(mainList);
		
		System.out.println("output using nested loops");

		
		//nested loops
		for(int i=0;i<mainList.size();i++) {
			ArrayList<Integer> currList = mainList.get(i);
			for(int j=0;j<currList.size();j++) {
				System.out.print(currList.get(j)+" ");
			}
			System.out.println();
		}
		
		/*
		  we can further perform all operations on the individual list so its fine even some 
		  list inside the mainList have less elements than other.
		*/
				

	}

}
