//Please Refer to the Java Code Files uploaded in other folders for all the function i.e. insert(),reverseList() for better understanding
//This code is just an insight of how i implemented the solution in simplest possible way
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
	
	public static LinkedList reverseList(LinkedList list)
	{
		Node cur = list.head;
		Node prev = null;
		Node Next = null;
		if(cur==null)
		{
			return null;
		}
		else
		{
		while(cur!=null)
		{
			Next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = Next;
		}
		list.head = prev;
		return list;
		}
	}
	
	public static void palindromeList(LinkedList list)
	{
		Node cur1 = list.head;
		LinkedList list2 = new LinkedList();
		while(cur1!=null)
		{
			list2 = insert(list2,cur1.data);
			cur1=cur1.next;
		}
		list2 = reverseList(list2);
		cur1 = list.head;
		Node cur2 = list2.head;
		int flag = 1;
		while(cur1!=null)
		{
			if(cur1.data != cur2.data)
			{
				flag = 0;
				break;
			}
			cur1 = cur1.next;
			cur2 = cur2.next;
		}
		if(flag == 1)
		{
			System.out.println("Linked List is Palindrome");
		}
		else
		{
			System.out.println("Linked List is not Palindrome");
		}
	}
	
	// this is another simple implementation of checking list is palindrome or not
	// however this approach only gives correct output when the data in node is single digit i.e. A,B,1,2 etc.
	public static void ispal(LinkedList list)
	{
		Node cur = list.head;
		String s1 = "";
		while(cur!=null)
		{
			s1 = s1 + cur.data;
			cur=cur.next;
		}
		s1 = s1.trim();
		StringBuilder s2 = new StringBuilder(s1);
		StringBuilder revS = s2.reverse();
		String r = revS.toString();
		System.out.println(s1);
		System.out.println(r);
		if(s1.equals(r))
		{
			System.out.println("Linked List is Palindrome");
		}
		else
		{
			System.out.println("Linked List is not Palindrome");
		}
	}
	
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list = insert(list,1);
		list = insert(list,2);
		list = insert(list,3);
		list = insert(list,2);
		list = insert(list,1);
		
	
		printlist(list);
		palindromeList(list);
	}
}
