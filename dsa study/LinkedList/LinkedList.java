
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
	
	public static LinkedList deletebyKey(LinkedList list,int key)
	{
		System.out.println();
		Node curNode = list.head,prev=null;
		if(curNode != null && curNode.data==key )
		{
			list.head = curNode.next;
			System.out.println(key+" : found and deleted from the Linked List");
			return list;
		}
		while( curNode!=null && curNode.data!=key )
		{
			prev = curNode;
			curNode = curNode.next;
		}
		if( curNode!=null )
		{
			prev.next = curNode.next;
			System.out.println(key+" : found and deleted from Linked List");
		}
		if( curNode == null )
		{
			System.out.println(key+" : not found in the Linked List ");
		}
		return list;
	}
	
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list = insert(list,1);
		list = insert(list,4);
		list = insert(list,78);
		list = insert(list,8);
		list = insert(list,20);
		printlist(list);
		list = deletebyKey(list,4);
		printlist(list);
		list = deletebyKey(list,1);
		printlist(list);
		list = deletebyKey(list,77);
		printlist(list);
		list = insert(list,1);
		printlist(list);
		list = insert(list,1);
		list = insert(list,13);
		list = insert(list,9090);
		printlist(list);
		list = deletebyKey(list,77);
		printlist(list);
	}
}
