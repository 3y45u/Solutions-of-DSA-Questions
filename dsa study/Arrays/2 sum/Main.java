
public class Main
{
	public static void main(String[] args) {
		int []ar= new int[]{1, 4, 45, 6, 10, 8};
		int x = 2;
		int sum = 0;
		int c =0;
		for(int i=0;i<ar.length;i++)
		{
		    for(int j=i+1;j<ar.length;j++)
		    {
		        sum = ar[i]+ar[j];
		        if(sum==x)
		        {
		            c=sum;
		            break;
		        }
		        
		    }
		    if(sum==x)
		    {
		        break;
		    }
		}
		if(c==x)
		System.out.println("YES");
		else
		System.out.println("NO");
	}
}
