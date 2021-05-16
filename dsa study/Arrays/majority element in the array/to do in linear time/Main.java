//Boyer–Moore majority vote algorithm

//This is do in linear time and space complexity

public class Main
{
	public static void main(String[] args) {
	    
	    
		 int []ar = new int[]{3, 3, 4, 2, 4, 4, 2, 4};
		 
		 int c = -1; //This will store the majority element if present
		 int i = 0;
		 for (int j=0;j<ar.length;j++)
		 {
		     if(i==0)
		     {
		         c = ar[j];
		         i = 1;
		     }
		     else if( c == ar[j] )
		     {
		         i++;
		     }
		     else{
		         i--;
		     }
		 }
		 
		 System.out.println(c);
	}
}
