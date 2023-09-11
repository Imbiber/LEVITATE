package adityaTeaches.FTFI;

public class Missing_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,5};
		int[] arr= {1,5,3,4,5};
		find(nums,arr);
		

	}
	public static void find(int[] nums, int[] arr ) {
		
		int n= nums.length;
		int sumNums= n*(n+1)/2;
		int sumArr=0;
		for(int i=0;i<arr.length;i++) {
			sumArr+=arr[i];
		}
		int a=Math.abs(sumNums-sumArr);
		
		int SumSqNums=0 , SumSqArr=0;
		for(int i=0;i<nums.length;i++) {
			SumSqNums+=Math.pow(nums[i],2 );
		}
		
		for(int i=0;i<arr.length;i++) {
			SumSqArr+=Math.pow(arr[i],2 );
		}
		
		int b=Math.abs(SumSqNums-SumSqArr);
		
		if (a != 0) {
		    int c = b/a;
		    int dup = (a+c)/2;
		    int miss = dup - a;
		    System.out.println("Missing number is " + miss);
		    System.out.println("Duplicate number is " + dup);
		} else {
		    System.out.println("No missing or duplicate number.");
		}
		
				
	}

}
