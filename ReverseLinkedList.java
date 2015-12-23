
public class ReverseLinkedList {
	public Node createList(){
		
		Node head=new Node(5);
	//	head.next=null;
		head.next=new Node(6);
		head.next.next=new Node(7);
		
		return head;
	}
	
	public void printList(Node head){
		while(head!=null){
			System.out.print(head.data+"	");
			head=head.next;
		}
		System.out.println();
	}
	
	public Node reverseList(Node head){
		Node prevHead=null;Node After=null;
	    while(head!=null){
	    	After=head.next;
	    	head.next=prevHead;
	    	prevHead=head;
	    	head=After;
	    }
		return prevHead;
	}
	
	public Node reverseLinkedListRecursive(Node head){
		
		if(head.next==null){
			reverseHead=head;
			return head;
		}
		
		Node tempHead=	reverseLinkedListRecursive(head.next);
		tempHead.next=head;
		head.next=null;
	        
		return head;
	}
	static Node reverseHead=null;
	public static void main(String[] args){
		ReverseLinkedList tl=new ReverseLinkedList();
		Node head=tl.createList();
		tl.printList(head);
		 head=tl.reverseList(head);
		
			tl.printList(head);
			tl.reverseLinkedListRecursive(head);
			tl.printList(reverseHead);
	}
	

}
