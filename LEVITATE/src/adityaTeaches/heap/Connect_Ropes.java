package adityaTeaches.heap;

import java.util.PriorityQueue;

public class Connect_Ropes {

	public static void main(String[] args) {
		int arr[]= {2,3,4,1,5};
		int ans=MinCost(arr);
		System.out.println("The min cost of a rope that can be formed is "+ans);

	}
	public static int MinCost(int arr[]) {
		int sum=0;
		PriorityQueue<Integer> minHeap =new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			minHeap.add(arr[i]);
		}
		while(minHeap.size()>1) {
			int first=minHeap.poll();
			int second=minHeap.poll();
			int temp=first+second;
			sum+=temp;
			minHeap.add(temp);
		}
		return sum;
	}

}
