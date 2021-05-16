

public class Main
{
	public static void main(String[] args) 
	{
	    
	    int [][]ar = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	    
	    int r,c,x,y,i;
	    r=ar.length;
	    c=ar[0].length;
	    x=0;
	    y=0;
	    
	    while( x<r && y<c )
	    {
	        for( i=y;i<c;i++)
	        {
	            System.out.print(ar[x][i]+" ");
	        }
	        x++;
	        
	        for( i=x;i<r;i++)
	        {
	            System.out.print(ar[i][c-1]+" ");
	        }
	        c--;
	        
	        if(x<r)
	        {
	            for( i=c-1;i>=y;i-- )
	            {
	                System.out.print(ar[r-1][i]+" ");
	            }
	            r--;
	        }
	        if(y<c)
	        {
	            for( i=r-1; i>=x;i--)
	            {
	                System.out.print(ar[i][y]+" ");
	            }
	            y++;
	        }
	    }
	    
		 
	}
}
