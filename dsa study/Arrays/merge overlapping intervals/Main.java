
import java.util.*;
class Interval
{
    int begin,end;
    Interval(int begin,int end)
    {
        this.begin=begin;
        this.end=end;
    }
    @Override
    public String toString()
    {
        return "{" + begin + ", " + end + "}";
    }
}
public class Main
{
    public void mergeIntervals(List<Interval> intervals)
    {
        Collections.sort(intervals, Comparator.comparingInt(a -> a.begin));
        Stack<Interval> stack = new Stack();
        for(Interval curr: intervals)
        {
            if (stack.empty() || curr.begin > stack.peek().end) {
                stack.push(curr);
            }
            if(stack.peek().end < curr.end)
            {
                stack.peek().end = curr.end;
            }
            
        }
        while( !stack.empty() )
            {
                System.out.println(stack.pop());
            }
    }
    
	public static void main(String[] args) 
	{
	    List<Interval> intervals = Arrays.asList(
                new Interval(1, 4), new Interval(4, 5)
                
                
        );
	        
	        Main obj = new Main();
	        obj.mergeIntervals(intervals);
	}
}
