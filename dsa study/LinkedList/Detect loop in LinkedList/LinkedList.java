
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

	public static void detectLoop(LinkedList list)
	{
		int count = 0;
	    Node slow=list.head,fast=list.head;
	    boolean flag=false;
		if(list.head==null || list.head.next==null)
        {
            System.out.println("Null");
        }
        
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
        if(flag==true)
        {
            System.out.println("Loop detected at : "+slow.data+" and length of loop is : "+(count+2));
        }
        else
        {
           System.out.println("No Loop detected"); 
        }
		
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
		list = insert(list,45);
		list.head.next.next.next.next.next.next.next.next.next=list.head.next.next.next;
		detectLoop(list);
		
		LinkedList list2 = new LinkedList();
		list2 = insert(list2,1);
		list2 = insert(list2,2);
		list2 = insert(list2,3);
		list2 = insert(list2,4);
		list2 = insert(list2,5);
		detectLoop(list2);
		
		
	}
}
