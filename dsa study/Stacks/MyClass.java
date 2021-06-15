class Stack
{
    int capacity = 2;
    int stack[] = new int[capacity];
    int top = 0;
    public void push(int data)
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
        int nstack[] = new int[capacity*2];
        System.arraycopy(stack,0,nstack,0,length);
        stack = nstack;
        capacity *= 2;
    }
    public int pop()
    {
        int data = 0;
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            top--;
            data = stack[top];
            stack[top]=0;
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
        int nstack[] = new int[capacity];
        System.arraycopy(stack,0,nstack,0,length);
        stack = nstack;
        
    }
    public int peek()
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
    public static void main(String []args)
    {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.showStack();
        System.out.println("\nsize : "+s.size());
        System.out.println("\npopped : "+s.pop());
         s.showStack();
         
    }
}