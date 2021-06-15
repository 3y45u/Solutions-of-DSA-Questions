// this code is done using the Stack class already present in java
// only the function is written for checking the balanced brackets, also write the main function yourself
import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0;i<s.length();i++)
        {
            char x = s.charAt(i);
            if(x=='(' || x=='[' || x=='{')
            {
                stack.push(x);
                continue;
            }
            if(stack.isEmpty())
            {
                return false;
            }
            char c = '\0';
            switch(x)
            {
                case ')':
                    c = stack.pop();
                    if(c=='[' || c=='{')
                        return false;
                    break;
                case ']':
                    c = stack.pop();
                    if(c=='(' || c=='{')
                        return false;
                    break;
                case '}':
                    c = stack.pop();
                    if(c=='[' || c=='(')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
        
    }
}
