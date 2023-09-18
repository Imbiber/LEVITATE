package adityaTeaches.stack;

public class RWT {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] arr1= {2,0,2};
	
		System.out.println(trap(arr1));
		int[] arr2= {3,0,0,2,0,4};
		
		System.out.println("The max water that can be trapped is "+trap(arr2));

	}
	
	    public static int trap(int[] height) {
	        int n = height.length;
	        int maxL[] = new int[n];
	        int maxR[] = new int[n];
	        
	        maxL[0] = height[0];
	        for(int i = 1; i < n; i++){
	        	maxL[i] = Math.max(maxL[i - 1], height[i]);
	        }
	        
	        maxR[n - 1] = height[n - 1];
	        for(int i = n - 2; i >= 0; i--){
	        	maxR[i] = Math.max(maxR[i + 1], height[i]);
	        }
	        
	        int water[] = new int[n];
	        for(int i = 0; i < n; i++){
	            water[i] = Math.min(maxL[i], maxR[i]) - height[i];
	        }
	        
	        int sum = 0;
	        for(int i = 0; i < n; i++){
	            sum += water[i];
	        }
	        return sum;
	    }
	}


