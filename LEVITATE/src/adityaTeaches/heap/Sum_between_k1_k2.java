package adityaTeaches.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Sum_between_k1_k2 {

	public static void main(String[] args) {
		int arr[]= {20,8,22,4,12,10,14,};
		int k1=3;
		int k2=6;
		int ans=0;
		int first=kSmall(arr,k1);
		int second=kSmall(arr,k2);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first && arr[i]<second) {
				ans+=arr[i];
			}
		}
		System.out.println("The sum between "+k1+ " and"+k2+" is "+ans);
		

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
