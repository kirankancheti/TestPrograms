
public class TestLinkedListPosition {
	
	public Node createList(){
		
		Node head=new Node(5);
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
	
	
	Node InsertNth(Node head, int data, int position) {
	    
	    
	    	if(head==null&&position==0){
	        head=new Node();
	            head.data=data;
	            return head;
	    	}
	    	else if(head!=null&&position==0){
	    		Node temp=head;
	    		head=new Node();
	    		head.data=data;
	    		head.next=temp;
	    		  return head;
	    	}
	    else{
	    Node temp=head;
	    Node prev=head;
	        int i=0;
	    while(head.next!=null&&i<position){
	    	prev=head;
	    	head=head.next;
	        i++;
	    }  
	        if(i==position){
	        Node after=head;
	        head=new Node();
	        head.data=data;
	        head.next=after;
	        prev.next=head;
	    	head=temp;
	        }
	        if(i+1==position){
	        	head.next=new Node();
	        	head.next.data=data;
	        }
	        return temp;
	    }
	  
	    }
	
	public static void main(String[] args){
		TestLinkedListPosition tl=new TestLinkedListPosition();
		Node head=tl.createList();
		tl.printList(head);
	   head=tl.InsertNth(head, 3,0);
	   tl.printList(head);
	   head=tl.InsertNth(head, 5,1);
	   tl.printList(head);
	   head=tl.InsertNth(head, 4,2);
	   tl.printList(head);
	   head=tl.InsertNth(head, 2,4);
	   tl.printList(head);
	   head=tl.InsertNth(head, 10,1);
	   tl.printList(head);
	   head=tl.InsertNth(head, 20,8);
	   tl.printList(head);
	   
	}
	
	

}

