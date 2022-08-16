import java.util.*;
public class stack {
    public static void main(String[] args) throws Exception {
        Stack <String> stk = new Stack<>();

        stk.push(item: "planner");
        stk.push(item: "diary");
        stk.push(item: "notepad");

        stk.pop();
        System.out.println(stk);

    }
}
