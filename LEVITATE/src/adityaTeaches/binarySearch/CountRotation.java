package adityaTeaches.binarySearch;

public class CountRotation {

	public static void main(String[] args) {
		
		int arr[]= {11,12,15,18,2,5,6,8};
		System.out.println("the array has been rotated "+ countR(arr)+" times");

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

}
