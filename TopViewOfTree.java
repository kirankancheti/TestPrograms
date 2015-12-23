import java.util.LinkedList;
import java.util.Queue;




public class TopViewOfTree {
	
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
	
 	class MinMax{
		int min;int max;

		public int getMin() {
			return min;
		}

		public void setMin(int min) {
			this.min = min;
		}

		public int getMax() {
			return max;
		}

		public void setMax(int max) {
			this.max = max;
		}
	}
	
	
	public void traverseTree(Node root,int index,MinMax minMax){
		
		if(root==null){
			return;
		}
		
		if(minMax.min>index)minMax.min=index;
		if(minMax.max<index)minMax.max=index;
	//	System.out.println("Root data : "+root.data+" Index :"+index);
		
 	if(root.left!=null)  traverseTree(root.left,index-1,minMax) ;
 	if(root.right!=null)	traverseTree(root.right,index+1,minMax);
		
	}
	
	
	
	public static void main(String[] args){
		TopViewOfTree topView=new TopViewOfTree();
		Node root=topView.createTree();
		MinMax minMax =topView.new MinMax();
		topView.traverseTree(root, 0,minMax);
	//	System.out.println(minMax.max);
	//	System.out.println(minMax.min);
		int sizeOfQueueArray=Math.abs(minMax.min)+minMax.max+1;
	//	System.out.println(sizeOfQueueArray);
		 Queue<Integer>[] queue = new Queue[sizeOfQueueArray];
		 for(int i = 0; i < sizeOfQueueArray; i++) 
			 queue[i] = new LinkedList<Integer>();
		 topView.traverseTreeWithQueue(root, 0, minMax, queue);
		 for(int i = 0; i < sizeOfQueueArray; i++) {
			 System.out.print(queue[i].poll()+"	");
		 }
		 
	}
	
	
	
	public void traverseTreeWithQueue(Node root,int index,MinMax minMax,Queue<Integer>[] queue){
		
		if(root==null){
			return;
		}

    queue[index+Math.abs(minMax.min)].add(root.data);
		
 	if(root.left!=null)  traverseTreeWithQueue(root.left,index-1,minMax,queue) ;
 	if(root.right!=null) traverseTreeWithQueue(root.right,index+1,minMax,queue);
		
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
