import java.util.*;
public class MyClass {
    private static Map<String,Long> result = new HashMap<>();
    public static void main(String args[]) {
      System.out.println(gridTraveler(18,18));
    }
    public static long gridTraveler(long m,long n)
    {
        String key = m + "," + n;
        
        if( m==1 && n==1 ) return 1;
        if( m==0 || n==0 ) return 0;
        if( result.get(key)!=null)
        return result.get(key);
        else
        {
        long value =  gridTraveler(m-1,n) + gridTraveler(m,n-1);
        result.put(key,value);
        return value;
        }
    }
}