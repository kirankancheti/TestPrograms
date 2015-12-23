




public class DeleteANode {
	public Node createList(){
		
		Node head=new Node(5);
		head.next=new Node(6);
		head.next.next=new Node(7);
		
		return head;
	}
	
	
	public static void main(String[] args){
		DeleteANode tl=new DeleteANode();
		Node head=tl.createList();
		   tl.printList(head);
	   head=tl.Delete(head, 0);
	   tl.printList(head);
	}
	
	
	public void printList(Node head){
		while(head!=null){
			System.out.print(head.data+"	");
			head=head.next;
		}
		System.out.println();
	}
	
	
	Node Delete(Node head, int position) {
		
		Node headCopy=head;Node prev=null;
		  // Complete this method
		if(head!=null&&position==0){
			headCopy=headCopy.next;
			return headCopy;
		}

		

		while(head!=null&&position>0){
			prev=head;
			head=head.next;position--;
		}
		
		if(head!=null){
			prev.next=head.next;
		}
		
		return headCopy;
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

}
