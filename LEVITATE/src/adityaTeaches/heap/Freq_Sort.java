package adityaTeaches.heap;
import java.util.*;


public class Freq_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,1,3,2,2,4};
		
		ArrayList<Integer> ans=freqSort(arr);
		System.out.println("The sorted array according to most"
				+ " frequent numbers is "+ans);

	}
	public static ArrayList<Integer> freqSort(int nums[]) {
		ArrayList<Integer> res= new ArrayList<>();
		Map<Integer,Integer> map= new HashMap<>();
		for(int n: nums) {
			map.put(n, map.getOrDefault(n, 0)+1);
		}
		PriorityQueue<Integer> minHeap = 
				new PriorityQueue<>(Comparator.comparingInt(map::get).reversed());
		
		for(int z:nums) {
			minHeap.add(z);
			
		}
		
		
		while(!minHeap.isEmpty()) {
			
			res.add(minHeap.poll());
			}
		
		return res;
	}

}

//leetcode 451