/*
QuickSort on Doubly Linked List
HardAccuracy: 66.72%Submissions: 9086Points: 8
Sort the given doubly linked list of size N using quicksort. Just complete the partition function using the quicksort technique.
 

Example 1:

Input:
LinkedList: 4->2->9
Output:
2 4 9
Explaination: After sorting output will look like this.

Example 2:
Input:
LinkedList: 1->4->9->2
Output:
1 2 4 9
Explaination: After sorting output will look like this.


Your Task:
Your task is to complete the given function partition(), which accepts the first and last node of the given linked list as input parameters and returns the pivot's address.
 

Expected Time Complexity: O(NlogN)
Expected Auxilliary Space: O(1)
 

Constraints:
1 <= N <= 2000
1 <= Each Element of Double Linked List <= 105
*/


//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
	Node next;
	Node prev;
	
	Node(int val)
	{
		data = val;
		next = prev = null;
	} 
}

class QsortDLL
{
    static Node head;
    
    public static void addToTheLast(Node node)
	{
		if(head == null)
			head = node;
		else
		{
			Node temp = head;
			while(temp.next != null)
				temp = temp.next;
			
			temp.next = node;
			node.prev = temp;
			
		}
	}
	
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- > 0)
	    {
	        int n = sc.nextInt();
	        int a1 = sc.nextInt();
			Node head = new Node(a1);
			addToTheLast(head);
			for(int i = 1; i < n; i++)
			{
			    int a = sc.nextInt();
			    addToTheLast(new Node(a));
			}
			
			quickSort(head);
			printList(head);
			System.out.println();
	    }
	}
	
	public static void quickSort(Node head)
	{
	    Node h = lastNode(head);
	    _quickSort(head, h);
	}
	
	public static Node lastNode(Node node)
	{
	    while(node != null && node.next != null)
	      node = node.next;
	      
	      return node;
	}
	
	public static void _quickSort(Node l, Node h)
	{
	    GfG gfg = new GfG();
	    if (h != null && l != h && l != h.next)
    {
        Node p = gfg.partition(l, h);
        _quickSort(l, p.prev);
        _quickSort(p.next, h);
    }
	}
	
	
	
	public static void printList(Node node)
	{
	    while(node != null)
	    {
	        System.out.print(node.data + "  ");
	        node = node.next;
	    }
	}
}
// } Driver Code Ends


class GfG
{
    public static Node partition(Node l, Node h)
    {
        //code here.
        Node pivot=h;
        Node i=l;
        for(Node j=l;j!=h;j=j.next)
        {
            if(pivot.data>j.data)
            {
                swap(j,i);
                i=i.next;
            }
        }
        swap(i,h);
        return i;
    }
    public static void swap(Node x,Node y)
    {
        int temp=x.data;
        x.data=y.data;
        y.data=temp;
    }
}
