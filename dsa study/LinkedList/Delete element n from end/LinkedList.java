package p1;

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
	
	

	
	
	public static void delFromEnd(LinkedList list,int pos)
	{
		int n = 0;
		Node cur = list.head,prev=null;
		while(cur!=null)
		{
			cur=cur.next;
			n=n+1;
		}
		cur=list.head;
		if( cur==null )
		{
			System.out.println("List is empty");
		}
		else if(pos>n || pos<=0)
		{
			System.out.println("Operation can't be done");
		}
		else if(pos==n)
		{
			list.head=cur.next;
		}
		else
		{
			n = n - pos + 1;
			for(int i = 1; i<n; i++)
			{
				prev = cur;
				cur=cur.next;
			}
			prev.next = cur.next;
			System.out.println(pos+" : deleted from the end");
		}
	}
	
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list = insert(list,1);
		list = insert(list,2);
		list = insert(list,3);
		list = insert(list,4);
		list = insert(list,5);
		//list = insert(list,6);
		
		LinkedList l2 = new LinkedList();
		printlist(list);
		
		
		delFromEnd(list,1);
		printlist(list);
	}
}
