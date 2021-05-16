import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int s = 6;
    int[] ar = new int[]{ 1,2,3,7,5};
    int sum = ar[0];
    int start = 0;
    for (int i = 1; i < ar.length; i++)
      {
	    while (sum > s && start < (i - 1))
	     {
	         sum = sum - ar[start];
	         start++;
	     }
	   
	    if (sum == s)
	        {
	            System.out.println((start+1) + " " + i);
	        }
	   
	   if (i < ar.length)
	         {
	            sum = sum + ar[i];
	         }
	    
      }
   
  }
}
