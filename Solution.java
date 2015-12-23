import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    	Solution s =new Solution();
    	Scanner in = new Scanner(System.in);
    //	System.out.println("Enter number of test cases");
    	
    	int numOfTestCases = in.nextInt();
    	int[] input=new int[numOfTestCases];
    	for(int i=0;i<numOfTestCases;i++){
    		input[i]=in.nextInt();
    	}
    	
    	for(int i=0;i<numOfTestCases;i++){
        	s.checkForSolution(input[i]);
    	}
 
    }
    
    public  void checkForSolution(int N){
    	boolean noSolution=true;
    	double n5=0;double n3=0;
    	if(N%3==0){
    		n5=N/3;
    		formSolution(n5,n3);
    		return;
    	}
 
    	 
    	while((N-5*n3)>=0){
    		
    		n5=(N-5*n3)/3;
    		if(n5==(int)n5){
    			noSolution=false;
    			break;
    		}
    		n3++;
    	}
    	
    	if(noSolution){
    	System.out.println("-1");
    	}
    	else{
//    		System.out.println("n5 :" +n5);
//        	System.out.println("n3 :" +n3);
        	formSolution(n5,n3);
    	}
    	
    	
    }
    
    
    public  void formSolution(double n5,double n3){
    	StringBuffer sb=new StringBuffer();
    	n5=3*n5;n3=5*n3;
    	while(n5>0){
    		sb.append(5);
    	//	System.out.print("5");
    		n5--;
    	}
    	while(n3>0){
    		sb.append(3);
    	//	System.out.print("3");
    		n3--;
    	}
    	
    	System.out.println(sb);
    }
}


