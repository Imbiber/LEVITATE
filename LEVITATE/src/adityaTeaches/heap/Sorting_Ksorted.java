package adityaTeaches.heap;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Sorting_Ksorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,5,3,2,8,10,9};
		int k=3;
		ArrayList<Integer> ans=nearly(arr,k);
		System.out.println("The requried sorted array is : "+ans);

	}
	
	public static ArrayList<Integer> nearly(int arr[],int k){
		ArrayList<Integer> res= new ArrayList<>();
		PriorityQueue<Integer> minHeap= new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			minHeap.add(arr[i]);
			if(minHeap.size()>k) {
				res.add(minHeap.remove());
			}
		}
		while (!minHeap.isEmpty()) {
			res.add(minHeap.remove());
		}
		return res;
	}

}
