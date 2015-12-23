import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;






//
//           1
//        /    \
//       2      3
//      / \    / \
//     4   5  6   7
//             \   \
//              8   9 


public class VerticalOrderTraversal {

	public Node createTree(){
		Node root=new Node(1);
	Node left=	root.left=new Node(2);
  //  Node right=    root.right=new Node(3);
    left.left=new Node(4);
    left.right=new Node(5);
//  Node temp=  right.left=new Node(6);
// Node temp1=  right.right=new Node(7);
//  temp.right=new Node(8);
//  temp1.right=new Node(9);
		return root;
	}
	
	
	
	public static void main(String[] args){
		VerticalOrderTraversal t=new VerticalOrderTraversal();
		Node root=t.createTree();
		t.inOrderTravesal(root);
		t.VerticalOrderTravesal(root, 0);

		t.printMap(t.hs);
	}
	
 public void inOrderTravesal(Node root){
	 if(root==null){
		 return;
	 }
	 
	 inOrderTravesal(root.left);
	 System.out.print(root.data+"	");
	 inOrderTravesal(root.right);
 }
 
// 
//      1
//    /   \
//   2     3
//  /  \   / \
// 4    5 6   7
//       \  \
//        8  9 
     
	  
TreeMap<Integer,Node> hs=new TreeMap<Integer, Node>();
 public void VerticalOrderTravesal(Node root,int localMax){

	 if(root==null){
		 return;
	 }
	 System.out.println();
//	 System.out.println("--------------------------------");
//	 System.out.println(root.data+"    "+localMax);
	 if(!hs.containsKey(localMax)){
          hs.put(localMax, root);	
	 }
	 if(root.left!=null){
	 VerticalOrderTravesal(root.left,--localMax);
	 
	 localMax++;
	 }
	 if(root.right!=null){
//	 rightMax =( rightMax<++localMax) ? localMax :rightMax;
	 VerticalOrderTravesal(root.right,++localMax);
	 }
	 
 }
 
 
 public  void printMap(Map mp) {
	    Iterator it = mp.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	       Node n= (Node)pair.getValue();
	        System.out.println(pair.getKey() + " = " + n.data);
	        it.remove(); // avoids a ConcurrentModificationException
	    }
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
