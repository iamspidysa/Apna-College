package Collection;

import java.util.Stack;
// stack done here
public class StackAnuj {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        st.push(10);
        System.out.println("Stack "+st);
        st.pop();
        System.out.println("Stack "+st);
        System.out.println(st.peek());
        System.out.println();
        



    }
}
