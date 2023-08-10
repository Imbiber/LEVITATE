package adityaTeaches.stack;
import java.util.*;
public class MSE_extraSpace {
	Stack<Integer> stack;
	Stack<Integer> minStack;
	
	MSE_extraSpace(){
		this.stack=new Stack<>();
		this.minStack=new Stack<>();
	}
	
	public void push(int val) {
		if(stack.isEmpty()) {
			minStack.push(val);
		}
		else if(!minStack.isEmpty()&&(minStack.peek()>=val)) {
			minStack.push(val);
		}
		stack.push(val);
	}
	
	
	public int pop(int val) {
		int result=0;
		if(stack.isEmpty()) {
			return -1;
		}
		else {
			result=stack.pop();
			if(result==minStack.peek()) {
				minStack.pop();
			}
			return result;
		}
	}
	
	public int min() {
		if(minStack.isEmpty()) {
			return -1;
		}
		else return minStack.peek();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MSE_extraSpace st= new MSE_extraSpace();
		st.push(34);
		st.push(4);
        st.push(21);
        st.push(11);
        st.push(56);

        System.out.println(st.min());
    }
}