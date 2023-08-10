package adityaTeaches.stack;
import java.util.*;

public class MSE_noExtraSpace {
    public static void main(String[] args) {
        MSE_noExtraSpace st = new MSE_noExtraSpace();
        MinStack minStack = st.new MinStack(); // Create an instance of MinStack
        minStack.push(34);
        minStack.push(4);
        minStack.push(21);
        minStack.push(11);
        minStack.push(56);

        System.out.println(minStack.getMin());
    }

    class MinStack {
        Stack<Integer> st;
        int min;

        public MinStack() {
            st = new Stack<>();
        }

        public void push(int val) {
            if (st.size() == 0) {
                st.push(val);
                min = val;
            } else {
                if (val >= min) {
                    st.push(val);
                } else {
                    st.push(2 * val - min);
                    min = val;
                }
            }
        }

        public void pop() {
            if (st.size() == 0) return;
            else {
                if (st.peek() >= min) {
                    st.pop();
                } else {
                    min = 2 * min - st.peek();
                    st.pop();
                }
            }
        }

        public int top() {
            if (st.size() == 0) return -1;
            else {
                int top = st.peek();
                if (top >= min) return top;
                else return min;
            }
        }

        public int getMin() {
            if (st.size() == 0) return -1;
            return min;
        }
    }
}
