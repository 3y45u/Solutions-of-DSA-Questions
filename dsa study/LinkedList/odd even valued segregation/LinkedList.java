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
	
	
	public static void segregateEvenOddValue(LinkedList list)
	{
	    Node evenStart=null,evenEnd=null,oddStart=null,oddEnd=null,cur=list.head;
	    
	    while(cur!=null)
	    {
	        int element = cur.data;
	        if(element%2==0)
	        {
	            if(evenStart==null)
	            {
	                evenStart = cur;
	                evenEnd = evenStart;
	            }
	            else
	            {
	                evenEnd.next = cur;
	                evenEnd = evenEnd.next;
	            }
	        }
	        else
	        {
	            if(oddStart==null)
	            {
	                oddStart = cur;
	                oddEnd = oddStart;
	            }
	            else
	            {
	                oddEnd.next = cur;
	                oddEnd = oddEnd.next;
	            }
	        }
	        cur=cur.next;
	    }
	    if(oddStart==null || evenStart==null)
	    {
	        return ;
	    }
	    evenEnd.next = oddStart;
	    oddEnd.next = null;
	    list.head = evenStart;
	    
	}
	
	
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list = insert(list,11);
		list = insert(list,2);
		list = insert(list,9);
		list = insert(list,44);
		list = insert(list,32);
		list = insert(list,77);
	    System.out.println("Before Segregation.");
		printlist(list);
		System.out.println("After Segregation.");
		segregateEvenOddValue(list);
		printlist(list);
		
		
	}
}