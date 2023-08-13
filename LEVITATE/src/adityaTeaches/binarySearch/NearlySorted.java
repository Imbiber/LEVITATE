package adityaTeaches.binarySearch;

public class NearlySorted {

	public static void main(String[] args) {
		int arr[]= {5,10,30,20,40};
		int n=arr.length;
		int x=20;
		int result=NBS(arr,0,n-1,20);
		if(result==-1) {
			System.out.println("Element is not present");
		}
		else {
			System.out.println("Element is present at index "+result);
		}

	}
	public static int NBS(int arr[],int start, int end, int x) {
		if(start<=end) {
			int mid= start+(end-start)/2;
			
			if(arr[mid]==x) {
				return mid;
			}
			else if(mid>start && arr[mid-1]==x) {
				return mid-1;
			}
			else if(mid<end && arr[mid+1]==x){
				return mid+1;
			}
			else if(arr[mid]>x) {
				return NBS(arr, start,mid-2,x);
			}
			else return NBS(arr,mid+2,end,x);
			
		}
		return -1;
	}

}
