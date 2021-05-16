import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		int  ar[] = {1,1,5};
	    
	    int p=0,q=0;
	    int flag = -1;
	    
	    for(int i=ar.length-2; i>=0; i--)
	    {
	        if(ar[i]<ar[i+1])
	        {
	            p = i;
	            flag=1;
	            
	            break;
	        }
	    }
	    if(flag==1)
	    {
	        for(int i=ar.length-1; i>=0; i--)
	        {
	            if(ar[i]>ar[p])
	            {
	                q=i;
	                
	                break;
	            }
	        }
	        int temp=ar[p];
	        ar[p]=ar[q];
	        ar[q]=temp;
	        
	        Arrays.sort(ar, p+1,ar.length);
	    }
	    else
	    {
	        Arrays.sort(ar);
	    }
	    
	    for(int i=0;i<ar.length;i++)
	    {
	        System.out.print(ar[i]+" ");
	    }
	    
	    
	}
}
