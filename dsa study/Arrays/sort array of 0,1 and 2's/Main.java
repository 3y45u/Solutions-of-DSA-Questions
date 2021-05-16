

public class Main
{
	public static void main(String[] args) {
	    
	    
		 int []ar = new int[]{0,1,0};
		 
		 int []new_arr = new int[ar.length];
		 
		 
		 int c = 0;
		 int a = 0;
		 int b = 0;
		 for(int i=0;i<ar.length;i++)
		 {
		     if(ar[i]==0)
		     {
		         new_arr[c]=ar[i];
		         c++;
		     }
		 
		     a =c;
		 }
		 for(int i=0;i<ar.length;i++)
		 {
		     if(ar[i]==1)
		     {
		         new_arr[a]=ar[i];
		         a++;
		     }
		 
		     b =a;
		 }
		 for(int i=0;i<ar.length;i++)
		 {
		     if(ar[i]==2)
		     {
		         new_arr[b]=ar[i];
		         b++;
		     }
		 
		     
		 }
		 
		 for(int i=0;i<ar.length;i++)
		 {
		     System.out.print(new_arr[i]+"  ");
		 }
	}
}
