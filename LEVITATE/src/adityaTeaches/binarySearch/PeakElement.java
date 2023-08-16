package adityaTeaches.binarySearch;

public class PeakElement {

	public static void main(String[] args) {
		int arr[]= {5,9,10,20,15};
		int ans=BS_Ans(arr);
		System.out.println("the peak element is present at the index "+ans);

	}
	public static int BS_Ans(int arr[]) {
		int start=0;
		int end= arr.length-1;
		while(start<=end) {
			int mid= start+(end-start)/2;
			if(mid>0 && mid<end) {
				 if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1 ]) {
					 return mid;
				 }
				 else if(arr[mid-1]>arr[mid]) {
					  end=mid-1;
				 }
				 else {
					 start=mid+1;
				 }
			}
			else if(mid==0) {
				if (arr[0]>arr[1]) {
					return 0;
				}
				else return 1;
			}
			else if(mid==end) {
				if(arr[end]>arr[end-1]) {
					return end ;
				}
				else return end-1;
			}
		}
		return -1;					//imp to think
	}
	

}




//leetcode 162 M   and 852 E
