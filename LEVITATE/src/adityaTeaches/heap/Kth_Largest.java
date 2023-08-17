package adityaTeaches.heap;

import java.util.PriorityQueue;

public class Kth_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,10,4,3,20,15};
		int k=3;
		int ans=Kthlarge(arr,k);
		System.out.println("The "+k+"th largest element in the array is "+ans);

	}
	
	public static int Kthlarge(int arr[], int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			minHeap.add(arr[i]);
			if(minHeap.size()>k) {
				minHeap.poll();
			}
		}
		return minHeap.peek();
	}

}
