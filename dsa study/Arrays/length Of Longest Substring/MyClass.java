import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        
        MyClass obj = new MyClass();
        System.out.println(obj.lengthOfLongestSubstring("bbbbb"));
      
    }
    
    public int lengthOfLongestSubstring(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int length = 0;
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                l = Math.max(map.get(s.charAt(r))+1,l);
            }
            map.put(s.charAt(r),r);
            length = Math.max(length,r-l+1);
            r++;
        }
        return length;
    }
}