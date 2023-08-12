package adityaTeaches.binarySearch;
//code is good only when element is present in the array shows no output when element is not there
public class BS_revSorted {
	public static void main(String[] args) {
		int arr[]= {10,9,8,7,6,5,4,3,2,1};
		int x=2;
		int start=0, end= arr.length-1;
		
			while(start<=end) {
				int mid = (start+(end-start)/2);
				if(arr[mid]==x) {
					System.out.println("the element is present at index "+ mid);
					break;
				}
				else if(arr[mid]>x) {
					start=mid+1;
				}
				
				else {
					end=mid-1;
				}
			}	
	}

}
