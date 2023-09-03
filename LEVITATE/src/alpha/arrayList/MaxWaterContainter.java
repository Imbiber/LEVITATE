package alpha.arrayList;
import java.util.*;
public class MaxWaterContainter {
	//solving using brute force T.C = O(n^2)

	public static void main(String[] args) {
		
		ArrayList<Integer> height = new ArrayList<>();
		
		height.add(1);
		height.add(8);
		height.add(6);
		height.add(2);
		height.add(5);
		height.add(4);
		height.add(8);
		height.add(3);
		height.add(7);
		System.out.println("the max water possible is "+maxWater(height));
	
	}
	
	public static int maxWater(ArrayList<Integer> height) {
		int maxWater=0;
		for (int i=0;i<height.size();i++) {
			for(int j=i+1;j<height.size();j++) {
				int high = Math.min(height.get(i),height.get(j));
				int width=j-i; 
				int currWater= high*width;
				maxWater = Math.max(maxWater,currWater);
						
			}
		}
		return maxWater;
	}

}
