
public class FindElementFromBack {
	public Node createList(){
		
		Node head=new Node(2);
	//	head.next=null;
		head.next=new Node(1);
		head.next.next=new Node(4,new Node(6,new Node(8,new Node(9,new Node(0)))));
		
		return head;
	}
	
	
	public void printList(Node head){
		while(head!=null){
			System.out.print(head.data+"	");
			head=head.next;
		}
		System.out.println();
	}
	
	
	
	int GetNode(Node head,int n) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method. 
	    
	    
	    if(head==null){
	        return n;
	    }
	    
	   int position= GetNode(head.next,n);
	   
	    
	    if(found){
	          return position;
	    }
	    else  if(position==0){
	    	found=true;
	        return head.data;
	        
	    }
	    else{
	        return position-1;}


	}
	static  boolean found=false;
	public static void main(String[] args){
		FindElementFromBack f =new FindElementFromBack();
		Node head=f.createList();
		f.printList(head);
		System.out.println(f.GetNode(head, 0));
		
	}




 class Node {
    int data;
    Node next;
    
    Node(int data,Node next){
    	this.data=data;
    	this.next=next;
    }
    
    Node(int data){
    	this.data=data;
    	this.next=null;
    }
 }
 
}
