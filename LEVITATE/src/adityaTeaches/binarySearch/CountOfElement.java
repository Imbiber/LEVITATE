package adityaTeaches.binarySearch;

public class CountOfElement {

	public static void main(String[] args) {
		int arr[]= {2,4,10,10,10,18,20};
		int x=10;
		int first=first(arr,x);
		int last=last(arr,x);
		int count=last-first+1;
		System.out.println("the element "+x+" is present "+count+" times.");

	}
	
	public static int first(int arr[], int x) {
		int start=0, end=arr.length-1;
		
		int result=-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==x) {
				result=mid;
				end=mid-1;
			}
			else if(arr[mid]<x) {
				start=mid+1;
			}
			else end=mid-1;
			
		}
		return result;
	}
	
	
	public static int last(int arr[], int x) {
		int start=0, end=arr.length-1;
		
		int result=-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==x) {
				result=mid;
				start=mid+1;
			}
			else if(arr[mid]<x) {
				start=mid+1;
			}
			else end=mid-1;
			
		}
		return result;
	}
	
	

}
