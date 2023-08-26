package alpha.hashing;
import java.util.*;
public class CountDistinctEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,3,2,5,6,7,3,4,2,1};
		System.out.println("the count of distinct elements in the array is "+count(arr));
		System.out.println("the count of distinct elements in the array is "+count2(arr));

	}
	public static int count(int arr[]) {
		HashSet<Integer> set= new HashSet<>();
		for(Integer i:arr) {
			set.add(i);		//here only "i" is used
		}
		return set.size();
	}
	
	public static int count2(int arr[]) {
		HashSet<Integer> set= new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);	//here only "arr[i]" is used
		}
		return set.size();
	}

}
