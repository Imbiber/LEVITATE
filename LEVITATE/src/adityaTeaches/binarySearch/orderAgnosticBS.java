package adityaTeaches.binarySearch;

public class orderAgnosticBS {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int k=4;
		System.out.println("the element is present at index "+OABS(arr,k));

	}
	
	public static int OABS(int arr[], int x) {
		int n=arr.length;
		if(n==1) {
			return arr[0]==x ? 0: -1;
		}
		boolean isAsc=false;
		if(arr[0]<arr[n-1]) {
			isAsc=true;
		}
		
		int start = 0;
	    int end = n - 1;
	    while (start <= end) {
	        int mid = start + (end - start) / 2;
	        if (x == arr[mid]) {
	            return mid;
	        } else if (isAsc) { // For ascending order
	            if (x < arr[mid]) {
	                end = mid - 1;
	            } else {
	                start = mid + 1;
	            }
	        } else { // For descending order
	            if (x < arr[mid]) {
	                start = mid + 1;
	            } else {
	                end = mid - 1;
	            }
	        }
	    }
	    return -1;
	}

}
