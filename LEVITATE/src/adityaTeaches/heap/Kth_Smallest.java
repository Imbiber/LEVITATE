package adityaTeaches.heap;
import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,10,4,3,20,15};
		int k=3;
		int ans=kSmall(arr,k);
		System.out.println("The "+k+"th smallest element in the array is "+ans);

	}
	
	public static int kSmall(int arr[], int k) {
		//PriorityQueue<Integer> maxHeap= new PriorityQueue<>((a,b)->b-a);
		  PriorityQueue<Integer> maxHeap= new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0;i<arr.length;i++) {
			maxHeap.add(arr[i]);
			if(maxHeap.size()>k) {
				maxHeap.poll();
			}
		}
		return maxHeap.peek();
	}

}
