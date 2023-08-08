package adityaTeaches.stack;
import java.util.*;

public class NGE2 {

    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 10, 8};
        nge(arr);
    }

    public static void nge(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result.add(-1);
            } else {
                result.add(stack.peek());
            }
            stack.push(arr[i]);
        }

        Collections.reverse(result);

        for (int num : result) {
            System.out.println(num);
        }
    }
}
