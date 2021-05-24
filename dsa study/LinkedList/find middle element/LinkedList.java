
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
	
	

	public static void findMiddle(LinkedList list)
	{
		int n = 0;
		Node cur = list.head;
		if(cur==null)
		{
			System.out.println("List is empty");
		}
		while(cur!=null)
		{
			cur=cur.next;
			n=n+1;	
		}
		n=(n/2 )+ 1;
		cur=list.head;
		for(int i=1;i<n;i++)
		{
			cur=cur.next;
		}
		System.out.println(cur.data+" : is the middle element");
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
		
		
		printlist(list);
		
		findMiddle(list);
	}
}
