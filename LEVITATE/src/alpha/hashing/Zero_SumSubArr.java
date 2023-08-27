package alpha.hashing;
import java.util.*;
public class Zero_SumSubArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {15,-2,2,-8,1,7,10,23};
		HashMap<Integer,Integer>map = new HashMap<>();
		int sum=0;
		int maxLength=0;
		int endIndex=-1;
		for (int j=0;j<arr.length;j++) {
			sum+=arr[j];
			if(map.containsKey(sum)) {
				 int currentLength = j - map.get(sum);
				 if (currentLength > maxLength) {
	                    maxLength = currentLength;
	                    endIndex = j;
	                }
			}
			else {
				map.put(sum, j);
			}
				
		}
		if (endIndex != -1) {
            int startIndex = endIndex - maxLength + 1;
            System.out.println("Largest Subarray with sum zero is:");
            for (int i = startIndex; i <= endIndex; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("No subarray with sum zero found.");
        }
    }
}