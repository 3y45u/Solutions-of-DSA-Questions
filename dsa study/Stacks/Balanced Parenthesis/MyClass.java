//This code is using the manual creation of stack and then using it for solving
class Stack
{
    int capacity = 2;
    char stack[] = new char[capacity];
    int top = 0;
    public void push(char data)
    {
        if(size()==capacity)
        {
            expand();
        }
        stack[top]=data;
        top++;
        
    }
    private void expand()
    {
        int length = size();
        char nstack[] = new char[capacity*2];
        System.arraycopy(stack,0,nstack,0,length);
        stack = nstack;
        capacity *= 2;
    }
    public char pop()
    {
        char data = '\0';
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            top--;
            data = stack[top];
            stack[top]='\0';
            shrink();
        }
        return data;
    }
    private void shrink()
    {
        int length = size();
        if(length<=(capacity/2)/2)
        {
            capacity /= 2;
        }
        char nstack[] = new char[capacity];
        System.arraycopy(stack,0,nstack,0,length);
        stack = nstack;
        
    }
    public char peek()
    {
        return stack[top-1];
    }
    public int size()
    {
        return top;
    }
    public boolean isEmpty()
    {
        if(top==0)
        return true;
        else
        return false;
    }
    public void showStack()
    {
        for(int i=0;i<top;i++)
        {
            System.out.print(stack[i]+" | ");
        }
    }
}

public class MyClass
{
    public static boolean balancedBrackets(String exp)
    {
        Stack s = new Stack();
        if(s.isEmpty())
        {
            return true;
        }
        for(int i=0;i<exp.length();i++)
        {
            char x = exp.charAt(i);
            if(x=='(' || x=='{' || x=='[')
            {
                s.push(x);
                continue;
            }
            if(s.isEmpty())
            {
                return false;
            }
            char c = '\0';
            switch(exp.charAt(i))
            {
                case ')':
                    c = s.pop();
                    if(c=='{' || c=='[')
                    {
                        return false;
                    }
                    break;
                case '}':
                    c = s.pop();
                    if(c=='('|| c=='[')
                    {
                        return false;
                    }
                    break;
                case ']':
                    c = s.pop();
                    if(c=='{' || c=='(')
                    {
                        return false;
                    }
                    break;
            }
            
        }
        return (s.isEmpty());
    }
        
    
    public static void main(String []args)
    {
       
        String exp = "";
        
        if(balancedBrackets(exp))
        {
            System.out.println(exp+" : is balanced");
        }
        else
        {
            System.out.println(exp+" : is not balanced");
        }
         
         
    }
}
