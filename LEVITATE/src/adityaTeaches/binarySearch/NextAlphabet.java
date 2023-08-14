package adityaTeaches.binarySearch;

public class NextAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'a','b','e','f','h'};
		int n=arr.length;
	    char x='e';                                 //iska ceil array me batana hai....
		char result=floor(arr,0,n-1,x);
		System.out.println("the ceil of element "+x+" is " +result);

	}
	public static char floor(char arr[], int start, int end, char x) {
	    char ans = 'x'; 
	    
	    while (start <= end) {
	        int mid = start + (end - start) / 2;
	        
	        if(arr[mid]==x) { 						//ye case imp..
	        	start=mid+1;
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