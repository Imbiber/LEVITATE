package adityaTeaches.binarySearch;

public class MInAbsDiffElement {

	public static void main(String[] args) {
		
		int arr[]= {1,3,8,10,15};
		int n=arr.length;
		int key=10;
		int ans=minD(arr,0,n-1,key);
		System.out.println("the element giving the min absolute diff is "+ans);

	}
	
	public static int minD(int arr[], int start, int end, int key) {
		while(start<=end) {
			int mid=start+(end-start)/2;
			
			if(arr[mid]==key) {
				return arr[mid];
			}
			if(arr[mid]>key) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		int ans1=Math.abs(arr[start]-key);
		int ans2=Math.abs(arr[end]-key);
		if(ans1>ans2) {
			return arr[end];
		}
		else return arr[start];
	}
}
