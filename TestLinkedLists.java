
public class TestLinkedLists {
	
	public Node createList(){
		
		Node head=new Node(5);
		head.next=new Node(6);
		head.next.next=new Node(7);
		
		return head;
	}
	
	Node Insert(Node head,int data) {
		    if(head==null){
		        Node temp=new Node();
		        temp.data=data;
		     //   temp.next=null;
		        head=temp;
		    }
		    else{
		    	Node temp=head;
		    	while(temp.next!=null){
		    		temp=temp.next;
		    	}
		    	temp.next=new Node(data);
		    }
		  return head;
		}
	
	public static void main(String[] args){
		TestLinkedLists tl=new TestLinkedLists();
		Node head=tl.createList();
	   head=tl.Insert(head, 8);
	}
}

class Node {
    int data;
    Node next;
    Node(int data){
    	this.data=data;
    }
    Node(){
    	
    }
 }
