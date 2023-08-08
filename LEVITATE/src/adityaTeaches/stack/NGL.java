package adityaTeaches.stack;
import java.util.*;

public class NGL {

    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 22};
        nge(arr);
    }

    public static void nge(int[] arr) {
        ArrayList<Integer> v = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                v.add(-1);
            } else {
                v.add(s.peek());
            }
            s.push(arr[i]);
        }

        for (int num : v) {
            System.out.println(num);
        }
    }
}
