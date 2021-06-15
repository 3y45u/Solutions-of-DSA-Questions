import java.util.Stack;
public class MyClass {
    
    public static int longestValidParentheses(String s) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int r = 0;
        for( int i=0; i<s.length(); i++ )
        {
            if(s.charAt(i)=='(')
                stack.push(i);
            else
            {
                if(!stack.isEmpty())
                    stack.pop();
                if(!stack.isEmpty())
                    r = Math.max(r,i-stack.peek());
                else
                    stack.push(i);
            }
        }
        return r;
        
    }
    
    
    public static void main(String args[]) {
      String s = "(()";
        System.out.println("The length of longest valid parentheses is : "+longestValidParentheses(s));
    }
}