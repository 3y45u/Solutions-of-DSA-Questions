
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
	
	public static LinkedList oddevenList(LinkedList list)
	{
	    
	    if( list.head == null )
	    {
	        return null;
	    }
	    
	    Node odd = list.head, even = list.head.next, temp = even;
	    
	    while( true )
	    {
	        if( odd == null || even == null || even.next == null )
	        {
	            odd.next = temp;
	            break;
	        }
	        odd.next = even.next;
	        odd = even.next;
	        
	        if( odd.next == null )
	        {
	            even.next = null;
	            odd.next = temp;
	            break;
	        }
	        even.next = odd.next;
	        even = odd.next;
	    }
	    return list;
	    
	}
	
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list = insert(list,1);
		list = insert(list,2);
		list = insert(list,3);
		list = insert(list,4);
		list = insert(list,5);
		list = insert(list,6);
		printlist(list);
		list = oddevenList(list);
		printlist(list);
		
		
		
	}
}
