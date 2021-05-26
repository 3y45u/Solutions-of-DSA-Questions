/*the function will return the intersecting node
  In this approach we are trying to iterate through lists 
  until null in encountered. When null is encountered for any list,
  we assign the head of the other list to current list,
  in this way the concatenation of lists is done until 
  intersection node is encountered.
  To understand this approach better try to do a dry run of following code
*/
public ListNode getIntersectionNode(ListNode a, ListNode b)
 {
	ListNode a1 = a, b1 = b;
        	while (a1 != b1)
		 {
           		a1 = a1 == null ? b : a1.next;
            		b1 = b1 == null ? a : b1.next;
        	 }
        return a1;
}