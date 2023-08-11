package adityaTeaches.binarySearch;
//iterative
import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		BinarySearch ob=new BinarySearch();
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int x=2;
		int result= ob.BS(arr,x);
		if(result==-1) {
			System.out.println("element not present in the array");
		}
		else {
			System.out.println("element is present at index "+result);
		}
	}
	
	int BS(int arr[], int x) {
		int start=0, end=arr.length-1;
		while(start<=end) {
			int mid= (start+(end-start)/2);
			if(arr[mid]==x) {
				return mid;
			}
			else if(arr[mid]<x) {
				start=mid+1;
			}
			
			else {
				end=mid-1;
			}
		}
		return -1;
	}

}


