package adityaTeaches.heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopK_FreqNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,1,3,2,2,4};
		int k=2;
		ArrayList<Integer> ans=freq(arr,k);
		System.out.println("The top "+k+" frequent numbers in the array is "+ans);
		

	}
	public static ArrayList<Integer> freq(int nums[],int k) {
		ArrayList<Integer> res= new ArrayList<>();
		Map<Integer,Integer> map= new HashMap<>();
		for(int n: nums) {
			map.put(n, map.getOrDefault(n, 0)+1);
		}
		PriorityQueue<Map.Entry<Integer,Integer>> minHeap = 
				new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			minHeap.add(entry);
			if(minHeap.size()>k)minHeap.remove();
		}
		
		
		while(!minHeap.isEmpty()) {
			Map.Entry<Integer, Integer> entry = minHeap.remove();
			res.add(entry.getKey());
			}
		
		return res;
	}

}

//leetcode 347
