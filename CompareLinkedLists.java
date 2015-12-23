
public class CompareLinkedLists {
	public Node createList(){
		
		Node head=new Node(5);
	//	head.next=null;
		head.next=new Node(6);
		head.next.next=new Node(7);
		
		return head;
	}
	
	public Node createList2(){
		
		Node head=new Node(6);
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
	
	public  int CompareLists(Node headA, Node headB) {

		while(headA!=null&&headB!=null){		
			if(headA.data!=headB.data){
				return 0;
			}	
			headA=headA.next;
			headB=headB.next;
		}
		if((headA==null&&headB==null)){
			return 1;}
		else{
		return 0;}
	}
	
	
	public static void main(String[] args){
		CompareLinkedLists tl=new CompareLinkedLists();
		Node head1=tl.createList();
		Node head2=tl.createList2();
		tl.printList(head1);
		tl.printList(head2);
		tl.CompareLists(head1, head2);
	}
	

}
