
public class Main
{
	public static void main(String[] args) {
	    
	    
	    int []ar = new int[]{3, 3, 4, 2, 4, 4, 2, 4 ,4 ,5,4};
	   
	    for ( int i=0; i<ar.length/2; i++ )
	    {
	        int c = 1;
	        for( int j = i+1; j<ar.length; j++ )
	        {
	            if( ar[j] == ar[i] )
	            {
	                c++;
	                
	            }
	        }
	        if( c > ar.length/2 )
	        {
	            System.out.println( ar[i] );
	        }
	        
	    }
	    
	    
	}
}
