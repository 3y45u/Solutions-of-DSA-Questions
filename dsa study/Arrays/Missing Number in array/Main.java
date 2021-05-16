import java.util.*;
class Main
{
     public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] arr = new int[n+1];
         
         for(int i = 0; i<n; i++)
         {
             arr[i]=sc.nextInt();
         }
         
         Main s = new Main();
         int mis = s.missingNumber(arr);
         System.out.println(mis);
        
    }
    
    public int missingNumber(int[] nums)
    {
        Arrays.sort(nums);
        int temp = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i)
            {
                temp = i;
            }
        }
        
        return temp;
    }
   
}