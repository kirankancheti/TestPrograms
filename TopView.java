import java.util.LinkedList;
import java.util.Queue;




public class TopView {
	
	public Node createTree(){
	Node root=new Node(1);
	Node left=	root.left=new Node(2);
    Node right=    root.right=new Node(3);
    left.left=new Node(4);
    left.right=new Node(5);
//  Node temp=  
    right.left=new Node(6);
// Node temp1= 
    right.right=new Node(7);
//  temp.right=new Node(8);
//  temp1.right=new Node(9);
		return root;
	}
	
	public static void main(String[] args){
		TopView topView=new TopView();
		Node root=topView.createTree();
		topView.top_view(root);
		
		 
	}
	
	void top_view(Node root)
	{
		if(root==null)return;
		if(root.left!=null)  LeftTree(root.left) ;
	 	if(root.right!=null) rightTree(root.right);

	}
	
	void LeftTree(Node root){
		
		if(root==null)return;
		LeftTree(root.left);
		System.out.print(root.data+" ");
	}
	
	
void rightTree(Node root){
		
		if(root==null)return;
		System.out.print(root.data+" ");
		rightTree(root.right);
		
	}
	
	
	class Node{
		  int data;
		    Node left;
		    public int getData() {
				return data;
			}
			public void setData(int data) {
				this.data = data;
			}
			Node right;
		Node(int data){
			this.data=data;
		}
		
		
	}

}
