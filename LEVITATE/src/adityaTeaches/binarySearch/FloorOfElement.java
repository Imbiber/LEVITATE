package adityaTeaches.binarySearch;

public class FloorOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,8,10,12,19};
		int n=arr.length;
		int x=5;                                 //iska floor array me batana hai....
		int result=floor(arr,0,n-1,x);
		System.out.println("the floor of element "+x+" is " +result);

	}
	public static int floor(int arr[], int start, int end, int x) {
	    int ans = -1; 
	    
	    while (start <= end) {
	        int mid = start + (end - start) / 2;
	        
	        if (arr[mid] == x) {
	            return arr[mid];
	        }
	        if (arr[mid] < x) {
	            ans = arr[mid];
	            start = mid + 1;
	        }
	        if (arr[mid] > x) {
	            end = mid - 1;
	        }
	    }
	    
	    return ans;
	}
	

	
//	public static int floor(int arr[], int start, int end , int x) {
//		    if(start>end) return -1;
//		    
//		    if(x>=arr[end]) {
//				return end;
//			}
//		
//			int mid= (start+(end-start)/2);
//			
//			
//			if(arr[mid]==x) {
//				return mid;
//			}
//			if(mid>0 && arr[mid-1]<=x && x<arr[mid]) {
//				return mid-1;
//			}
//			
//			if(x<arr[mid]){
//				return floor(arr,start,mid-1,x);
//			}
//			
//			return floor(arr, mid+1,end,x);
//		
//		
//	}
	

}
