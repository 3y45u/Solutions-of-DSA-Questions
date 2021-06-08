import java.lang.*;
public class LinkedList
{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	public static LinkedList insert(LinkedList list,int data)
	{
		Node new_node = new Node(data);
		new_node.next = null;
		if( list.head == null )
		{
			list.head= new_node;
		}
		else
		{
			Node last = list.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next = new_node;
		}
		return list;
	}
	
	public static void printlist(LinkedList list)
	{
		
			Node cur = list.head;
		while( cur != null )
		{
			System.out.print(cur.data+"|");
			cur = cur.next;
		}
		System.out.println();
		
	}
	
	public static Node merge(Node a,Node b)
	{
	    Node result = null;
	    if( a==null )
	    {
	        return b;
	    }
	    if( b==null )
	    {
	        return a;
	    }
	    if( a.data <= b.data )
	    {
	        result = a;
	        result.next = merge(a.next, b);
	    }
	    else
	    {
	        result = b;
	        result.next = merge(a, b.next);   
	    }
	    return result;
	    
	}
	public static Node mergeSort( Node h )
	{
	   if( h==null || h.next==null )
	   {
	       return h;
	   }
	   
	   Node slow = h;
	   Node fast = h;
	   while( fast.next!=null && fast.next.next!=null )
	   {
	       slow = slow.next;
	       fast = fast.next.next;
	   }
	   
	   Node mid = slow;
	   Node mid_next = mid.next; // this is the next node of the middle i.e. for the right division of LL
	   mid.next = null;
	   
	   Node left = mergeSort( h );
	   Node right = mergeSort( mid_next );
	   
	   Node merged = merge( left , right );
	   return merged;
	   
	}

	
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list = insert(list,25);
		list = insert(list,14);
		list = insert(list,19);
		list = insert(list,33);
		list = insert(list,10);
		list = insert(list,21);
		list = insert(list,39);
		list = insert(list,90);
		list = insert(list,58);
		printlist(list);
		list.head = mergeSort(list.head);
		printlist(list);
	
		
	
		
		
	}
}