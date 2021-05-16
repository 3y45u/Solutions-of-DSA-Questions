import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		long [] ar = new long[]{3,30,34,5,9};
		long l= ar[0];
	    //String s_ar= Arrays.toString(ar);
		String x=Long.toString(l);
		String y=null;
		
		String n=null;
		
		String d=null;
		
		if(ar.length==1)
		{
		    n=Long.toString(ar[0]);
		}
		else
		{
		for(int i=1;i<ar.length;i++)
		{
		  
		  y=Long.toString(ar[i]);
		  String s1 = x+y;
		  String s2 = y+x;
		  
		  //System.out.println(s1);
		  //System.out.println(s2);
		  
		  long p1=Long.parseLong(s1);
		  long p2=Long.parseLong(s2);
		  if(p1>p2)
		  {
		      n=x+y;
		      x=n;
		      d=d+n;
		  }
		  else
		  {
		      n=y+x;
		      x=n;
		      d=d+n;
		  }
		  
		}
		}
		 
		System.out.println(n);
	}
}
