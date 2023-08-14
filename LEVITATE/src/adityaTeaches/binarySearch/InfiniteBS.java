package adityaTeaches.binarySearch;

public class InfiniteBS {

	    public static int binarySearch(int a[], int start, int end, int ele) {
	        int n = a.length;
	        start = 0;
	        end = n - 1;
	        while (start <= end) {
	            int mid = start + (end - start) / 2;
	            if (ele == a[mid]) {
	                return mid;
	            } else if (ele > a[mid]) {
	                start = mid + 1;
	            } else if (ele < a[mid]) {
	                end = mid - 1;
	            }
	        }
	        return -1;
	    }

	    public static int findPos(int a[], int key) {
	        int start = 0;
	        int end = 1;
	        while (key > a[end]) {
	            start = end;
	            end *= 2;
	        }
	        return binarySearch(a, start, end, key);
	    }

	    public static void main(String[] args) {
	        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
	        int res = findPos(arr, 7);
	        System.out.println("the index of the element to be searched is "+res);
	    }
	}
