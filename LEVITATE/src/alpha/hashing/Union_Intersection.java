package alpha.hashing;

import java.util.HashSet;

public class Union_Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {7,3,9};
		int arr2[]= {6,3,9,2,9,4};
		Union(arr1,arr2);
		Intersection(arr1,arr2);

	}
	public static void Union(int arr1[],int arr2[]) {
		HashSet<Integer> set=new HashSet<>();
		for(Integer i : arr1) {
			set.add(i);
		}
		for(Integer i:arr2) {
			set.add(i);
		}
		System.out.println("the size of union of array is "+set.size()+" and the elements of"
				+ " union array is " + set);
	}
	public static void Intersection(int arr1[],int arr2[]) {
		int count=0;
		HashSet<Integer> set2=new HashSet<>();
		for(Integer i : arr1) {
			set2.add(i);
		}
		HashSet<Integer> intersectionSet = new HashSet<>();
		for(Integer i:arr2) {
			if(set2.contains(i)) {
				count++;
				intersectionSet.add(i);
			}
		}
		System.out.println("the size of intersection of array is "+intersectionSet.size()+" and the elements of"
				+ " intersection array is " +intersectionSet );
	}

}
