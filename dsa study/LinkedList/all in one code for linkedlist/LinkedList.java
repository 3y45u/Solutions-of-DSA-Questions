
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

	public static void findMiddle(LinkedList list)
	{
		int n = 0;
		Node cur = list.head;
		if(cur==null)
		{
			System.out.println("List is empty");
		}
		else
		{
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
	
	public static LinkedList rotateRight(LinkedList list)
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
	public static void rotateR(LinkedList list,int k)
	{
	    while(k!=0)
	    {
	        list = rotateRight(list);
	        k--;
	    }
	    
	}
	
	public static void findMiddle2(LinkedList list)
	{
		Node fast=list.head,slow=list.head;
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		System.out.println("The Middle Element is : "+slow.data);
	}
	
	public static void detectLoop(LinkedList list)
	{
		int count = 0;
	    Node slow=list.head,fast=list.head;
	    boolean flag=false;
		if(list.head==null || list.head.next==null)
        {
            System.out.println("Null");
        }
		else
		{
        while(fast!=null && fast.next!=null && slow!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) 
            {
                fast = list.head;
                while (fast != slow) 
                {    
                	
                    fast = fast.next;
                    slow = slow.next;
                }
                flag=true;
                break;
            }
        }
        fast=slow.next;
        while(fast!=slow && fast!=null && fast.next!=null)
        {
        	fast=fast.next;
        	count+=1;
        }
		}
        if(flag==true)
        {
            System.out.println("Loop detected at : "+slow.data+" and length of loop is : "+(count+2));
        }
        else
        {
           System.out.println("No Loop detected"); 
        }
		
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
		
		printlist(list);
		
	
		
	
		
		
	}
}