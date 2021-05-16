
import java.util.*;

public class Main
{
    
	public static void main(String[] args) 
	{
	    int [] ar1 = new int[]{7,8,9,11,12};
	    
	    Arrays.sort(ar1);
	   
	    int miss = -1;
	    int index = -1;
	    
	    if(ar1[0]>1 || ar1[ar1.length-1]<0)
	    {
	        miss = 1;
	    }
	    else
	    {
	    for(int i=0;i<ar1.length;i++)
	    {
	        
	        if(ar1[i]>0)
	        {
	            index = i;
	            miss=-1;
	            break;
	        }
	        else
	        {
	            index = 0;
	        }
	    }
	    }
	    if(miss==1)
	    {
	       System.out.println("First Missing Positive : "+miss); 
	    }
	    else
	    {
	        if(ar1[index] != 1)
	        {
	            miss = 1;
	            
	        }
	        else{
	    for(int i=index;i<ar1.length - 1 ;i++)
	    {
	    
	        if(ar1[i]+1 != ar1[i+1] )
	        {
	             miss=ar1[i]+1;
	             break;
	        }
	        
	       
	    }
	        }
	     if(miss==-1)
	        {
	            miss = ar1[ar1.length-1] + 1;
	            
	        } 
	    
	    System.out.println("First Missing Positive : "+miss);
	    }
	    
	    
	}
}
