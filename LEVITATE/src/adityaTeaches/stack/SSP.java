package adityaTeaches.stack;

import java.util.Stack;

public class SSP {

	public static void main(String[] args) {
		int[] arr= {100,80,60,70,60,75,85};
		ssp(arr);

	}
	public static void ssp(int[] arr) {
		Stack<Integer> st = new Stack<>();
		st.push(0);
		int [] s = new int[arr.length];
		s[0]=1;
		for(int i=1;i<arr.length;i++) {
			while((!st.empty())&&(arr[st.peek()]<=arr[i])){
				st.pop();
			}
			s[i]=(st.empty())?(i+1):(i-st.peek());
			st.push(i);
		}
		for(int i:s) {
			System.out.print(i+" ");
		}
	}

}
