import java.util.*;
public class MyClass {
    private static Map<Long,Long> result = new HashMap<>();
    public static void main(String args[]) {
      System.out.println(fib(50));
    }
    public static long fib(long n)
    {
        if(result.get(n)!=null)
        return result.get(n);
        if(n<=2)
        return 1;
        else
        {
        long value =  fib(n-1)+fib(n-2);
        result.put(n,value);
        return value;
        }
    }
}