package adityaTeaches.binarySearch;

public class MaxEle_BitonicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,8,3,2};
		int ans=BS_Ans(arr);
		System.out.println("the max element in the given Bitonic Array is "+arr[ans]);

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
		return -1;					
	}

}
