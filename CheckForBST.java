


public class CheckForBST {
	
	
	

	
 public boolean checkForBST(int[] arr,int start,int end,Integer min,Integer max){
	
	 
	 
	 if(start>end){
		 return true;
	 }
	 
	 if(start==end){
		 if(min<arr[start]&&max>=arr[start]){
				return true;
			}
			else{
				return false;
			}
	 }
	 
	 
	 
	
	 
	int index= findGreaterElement(arr,start+1,end,arr[start]);
	
boolean leftBST=	checkForBST(arr,start+1,index-1,min,arr[start]);
boolean rightBST=	checkForBST(arr,index+1,end,arr[start],max);

	 
if((leftBST&&rightBST)){
	if(min<arr[start]&&max>=arr[start]){
		return true;
	}
	else{
		return false;
	}
}
else{
	return false;
}


}

 
 public int findGreaterElement(int[] arr,int start,int end,int key){
	 int i=start;
	 for(;i<end;i++){
		 if(arr[i]>key){
			 break;
		 }
	 }
	 
	 return i;
 }
	
	
	public static void main(String[] args){
		CheckForBST mtl = new CheckForBST();
		int arr[]={40, 30, 35, 20, 80, 100};
		
	System.out.println(	mtl.checkForBST(arr, 0, arr.length, Integer.MIN_VALUE, Integer.MAX_VALUE));
		
		
	}

}
