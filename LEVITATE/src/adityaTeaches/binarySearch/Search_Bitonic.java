package adityaTeaches.binarySearch;

public class Search_Bitonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-3,9,8,20,17,5,1};
		int key=20;
		int peak=BS_Ans(arr);
		int index1=ascBS(arr,0,peak-1,key);
		int index2=descBS(arr,peak,arr.length,key);
		int ans=Math.max(index1, index2);
		
		System.out.println("the key element " +key+ " in the given Bitonic Array is "
				+ "present at index "+ans);

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
	
	
	
	public static int ascBS(int arr[],int start, int end, int key) {
		
		while(start<=end) {
			int mid= (start+(end-start)/2);
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]<key) {
				start=mid+1;
			}
			
			else {
				end=mid-1;
			}
		}
		return -1;
	}
	
	public static int descBS(int arr[],int start, int end, int key) {
		
		while(start<=end) {
			int mid= (start+(end-start)/2);
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]>key) {
				start=mid+1;
			}
			
			else {
				end=mid-1;
			}
		}
		return -1;
	}
	

}
