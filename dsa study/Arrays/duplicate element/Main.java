import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		
		int [] ar= new int[]{0,4,5,1,2,3,55,65,77,77,89,90};
		Arrays.sort(ar);
		int dp = -1;
		for(int i=1;i<ar.length;i++)
		{
		    if(ar[i]==ar[i-1])
		    {
		        dp = ar[i];
		        
		    }
		}
		if(dp == -1)
		{
		    System.out.println("Not found");
		}
		else{
		    System.out.println(dp);
		}
	}
}
