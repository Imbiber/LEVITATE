package adityaTeaches.binarySearch;

public class First1_InfiniteBinaryArray {

	public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1 };
        int res = findFirstPos(arr, 1);
        System.out.println("first 1 is present at the index "+res);
    }

	public static int first(int arr[], int start, int end, int x) {
		
		
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

	    public static int findFirstPos(int a[], int key) {
	        int start = 0;
	        int end = 1;
	        while (key > a[end]) {
	            start = end;
	            end *= 2;
	        }
	        return first(a, start, end, key);
	    }

}
