import java.util.LinkedList;
import java.util.Queue;




public class LevelOrderTraversal {
	
	
	public static void main(String[] args){
		LevelOrderTraversal l=new LevelOrderTraversal();
		Node head=l.createTree();
        l.levelOrdertraversal(head);
		
	}
	
	
	public Node createTree(){
		Node root=new Node(2);
	Node left=	root.left=new Node(3);
    Node right=    root.right=new Node(4);
    left.left=new Node(5);
    left.right=new Node(6);
    right.left=new Node(7);
    right.right=new Node(8);
		return root;
	}
	
	
	public void levelOrdertraversal(Node head){
		Queue que=new LinkedList<Node>();		
		if (head==null){
			return;
		}
		
		que.add(head);
		Node present= null;
		while(!que.isEmpty()){
			present=	((Node)que.poll());
			System.out.println(	present.data);
			if(present.left!=null){
			que.add(present.left);}
			if(present.right!=null){
			que.add(present.right);}

	
		}
		
		
	}
	
	
	
	class Node{
		  int data;
		    Node left;
		    Node right;
		Node(int data){
			this.data=data;
		}
	}

	

}
