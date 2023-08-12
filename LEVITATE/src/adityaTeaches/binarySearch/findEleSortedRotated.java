package adityaTeaches.binarySearch;

public class findEleSortedRotated {

	public static void main(String[] args) {
		int arr[]= {11,12,15,18,2,5,6,8};
		int x=15;
		System.out.println("the element is present in"+search(arr,x));

	}
	
	

	public static int search(int arr[], int x) {
		int arrayStartIndex = countR(arr);
        int index= BS(arr, arrayStartIndex,arr.length-1,x);
        int index2 = BS(arr, 0,arrayStartIndex-1,x);
        return index==-1?index2:index;

	}
	
	
	public static int countR(int arr[]) {
		int n=arr.length;
		int start=0, end=arr.length-1;
		while(start<=end) {
			int mid= start+(end-start)/2;
			int prev=(mid+n-1)%n;
			int next=(mid+1)%n;
			if(arr[mid] <= arr[prev] && arr[mid]<=arr[next]) {
				return mid;
			}
			else if(arr[mid]<=arr[end]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
			
		}
		return 0;
	}
	
	public static int BS(int arr[],int start, int end, int x) {
		
		while(start<=end) {
			int mid= (start+(end-start)/2);
			if(arr[mid]==x) {
				return mid;
			}
			else if(arr[mid]<x) {
				start=mid+1;
			}
			
			else {
				end=mid-1;
			}
		}
		return -1;
	}

}
