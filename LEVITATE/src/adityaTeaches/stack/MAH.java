package adityaTeaches.stack;
import java.util.*;
public class MAH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input= {6,2,5,4,5,1,6};
		
		System.out.println(largestRect(input));
		

	}
	public static int largestRect(int[] input) {
		if(input.length==1) return 0;
		
		int[] NSR= findNSR(input);
		int[] NSL= findNSL(input);
		int max=0;
		int width[]= new int[input.length];
		for(int i=0;i<input.length;i++) {
			width[i]=NSR[i]-NSL[i]-1;
			int count=width[i]*input[i];
			if(count>max) {
				max=count;
			}
			
		}
		return max;
		
	}
	public static int[] findNSR(int[] input) {
        int right[] = new int[input.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = input.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                right[i] = input.length;
            } else if (!stack.isEmpty() && input[stack.peek()] < input[i]) {
                right[i] = stack.peek();
            } else if (!stack.isEmpty() && input[stack.peek()] >= input[i]) {
                while (!stack.isEmpty() && input[stack.peek()] >= input[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    right[i] = input.length;
                } else {
                    right[i] = stack.peek();
                }
            }
            stack.push(i);
        }
        return right;
    }




    public static int[] findNSL(int[] input) {
        int[] left = new int[input.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < input.length; i++) {
            if (stack.isEmpty()) {
                left[i] = -1;
            } else if (!stack.isEmpty() && input[stack.peek()] < input[i]) {
                left[i] = stack.peek();
            } else if (!stack.isEmpty() && input[stack.peek()] >= input[i]) {
                while (!stack.isEmpty() && input[stack.peek()] >= input[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    left[i] = -1;
                } else {
                    left[i] = stack.peek();
                }
            }
            stack.push(i);
        }
        return left;
    }

}
