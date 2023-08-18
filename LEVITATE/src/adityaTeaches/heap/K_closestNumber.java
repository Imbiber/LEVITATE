package adityaTeaches.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class K_closestNumber {

	public static void main(String[] args) {
		
		int arr[]= {5,6,7,8,9};
		int k=3;
		int x=7;
		ArrayList<Integer> ans=Kclose(arr,k,x);
		System.out.println("The requried numbers are : "+ans);

	}
	
	public static ArrayList<Integer> Kclose(int arr[],int k, int x){
		ArrayList<Integer> res= new ArrayList<>();
		PriorityQueue<Pair> maxHeap= new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<arr.length;i++) {
			maxHeap.add(new Pair(Math.abs(arr[i]-x),arr[i]));
			if(maxHeap.size()>k) {
				maxHeap.poll();
			}
		}
		while (!maxHeap.isEmpty()) {
			res.add(maxHeap.poll().data);
		}
		return res;
	}
}
	
	class Pair implements Comparable<Pair>{
		int key;
		int data;
	
	Pair(int key, int data){
		this.key=key;
		this.data=data;
	}
	@Override
	public int compareTo(Pair o) {
		return this.key-o.key;
	}

}
	
	
	//leetcode 658