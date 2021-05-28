
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
	
	public static LinkedList rotateRight(LinkedList list,int k)
	{
	    if(list.head==null || k==0)
	    {
	        return list;
	    }
	    else
	    {
	        int len=0;
	        Node cur = list.head;
	        while(cur!=null)
	        {
	            cur=cur.next;
	            len++;
	        }
	        k=k%len;
	    while(k!=0)
	    {
	        list = rotateR(list);
	        k--;
	    }
	    return list;
	    }
	}
	
	public static LinkedList rotateR(LinkedList list)
	{
		Node cur = list.head,temp=null,prev=null;
		
		while(cur!=null)
		{
			temp = prev;
			prev = cur;
			cur=cur.next;
		}
		prev.next = list.head;
		temp.next = null;
		list.head = prev;
		
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

		printlist(list);
		
		list=rotateRight(list,3);
		printlist(list);
		
	}
}
