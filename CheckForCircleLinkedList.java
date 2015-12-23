import java.util.HashSet;


public class CheckForCircleLinkedList {
public Node createList(){
		
		Node head=new Node(1);
		head.next=new Node(2);
	Node temp=	head.next.next=new Node(3);
	head.next.next.next=new Node(4);
	head.next.next.next.next=new Node(5);
	head.next.next.next.next.next=new Node(6);
//	head.next.next.next.next.next.next=temp;
		return head;
	}
	

public void printList(Node head){
	while(head!=null){
		System.out.print(head.data+"	");
		head=head.next;
	}
	System.out.println();
}


public int checkForCircle(Node head){

	
	if(head!=null){
	Node hare=head,tortoise=head;
	if(hare.next!=null){
		hare=hare.next;
	}
	if(tortoise.next.next!=null){
		tortoise=tortoise.next.next;
	}
	while(head!=tortoise){
		hare=hare.next;
		tortoise=tortoise.next.next;
	}
	hare=head;
	while(hare!=tortoise){
		hare=hare.next;
		tortoise=tortoise.next;
	}
	
	if(hare==tortoise){
		return 1;
	}
	else{
		return 0;
	}
	}else{
		return 0;
	}
	
}

public static void main(String[] args){
	CheckForCircleLinkedList c =new CheckForCircleLinkedList();
	Node head=	c.createList();

	
//c.printList(head);
c.checkForCircle(head);
}

class Node{
	int data;
	Node next;
	
	
	Node(int data){
		this.data=data;
	}
	
	
}

}
