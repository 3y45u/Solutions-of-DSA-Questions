import java.util.*;
public class MyClass {
    private static Map<Integer,Integer> result = new HashMap<>();
    public static void main(String args[]) {
        System.out.println(tribonacci(25));
      
    }
    public static int tribonacci(int n){
        if(result.get(n)!=null){
            return result.get(n);
        }
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        else{
            int value = tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
            result.put(n,value);
            return value;
        }
    }
}