import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
