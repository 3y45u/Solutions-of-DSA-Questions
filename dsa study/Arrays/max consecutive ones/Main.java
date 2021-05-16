

public class Main
{
	public static void main(String[] args) {
	    
	    
		 int []ar = new int[]{1,1,0,1,0,1,1,1,1,1};
		 int c=0;
		 for(int i =0;i<ar.length; i++)
		 {
		     if(ar[i]==1)
		     c++;
		     else
		     c=0;
		 }
		 System.out.println(c);
		 
		 
	}
}
