import java.util.ArrayList;
import java.util.Scanner;


public class Solution1 {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
	    //	System.out.println("Enter number of test cases");
	    	ArrayList<Input> al=new ArrayList<Input>();
	    	int numOfTestCases = in.nextInt();int num1,num2 ;
	       	for(int i=0;i<numOfTestCases;i++){
	       		num1	= in.nextInt();num2	= in.nextInt();
	       		al.add(new Input(num1, num2));
	    	}
	    	
	       	for(Input i:al){
	       		System.out.println(checkForSquares(i));
	       	}
	    	
    }
	
	
	public static int checkForSquares(Input i){
		int num1=i.num1;
		int num2=i.num2;int noOfSolution=0;
		double sqrt;
		while(num1<=num2){
		sqrt=Math.sqrt(num1);
		if(sqrt==(int)sqrt){
			noOfSolution++;
		}
		}
		
		return noOfSolution;
	}
	
	

}


class Input{
	
	int num1;
	int num2;
	public Input(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
}
