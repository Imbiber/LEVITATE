package adityaTeaches.heap;

import java.util.PriorityQueue;

public class K_largestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,10,4,3,20,15};
		int k=3;
		int ans[]=klarge(arr,k);
		System.out.println("The " + k + " largest elements in the array are:");
        for (int num : ans) {
            System.out.print(num + " ");
        }

	}
	
	public static int[] klarge(int arr[], int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			minHeap.add(arr[i]);
			if(minHeap.size()>k) {
				minHeap.poll();
			}
		}
		int[] result = new int[k];
		for(int i=0;i<k;i++) {
			result[k-i-1]=minHeap.poll();
		}
		return result;
		
	}

}
