package adityaTeaches.binarySearch;

public class CeilOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,8,10,10,12,19};
		int n=arr.length;
		int x=11;                                 //iska ceil array me batana hai....
		int result=floor(arr,0,n-1,x);
		System.out.println("the ceil of element "+x+" is " +result);

	}
	public static int floor(int arr[], int start, int end, int x) {
	    int ans = -1; 
	    
	    while (start <= end) {
	        int mid = start + (end - start) / 2;
	        
	        if (arr[mid] == x) {
	            return arr[mid];
	        }
	        if (arr[mid] < x) {
	            
	            start = mid + 1;
	        }
	        if (arr[mid] > x) {
	            end = mid - 1;
	            ans=arr[mid];
	        }
	    }
	    
	    return ans;
	}
}