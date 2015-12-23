
public class CheckForIncreasingSubSequence {
	
	public static void main(String[] args){
		int[] arr={6, 7, 8, 1, 2, 3, 9, 10};
		checkForSubSequence(arr);
	}
	
	public static void checkForSubSequence(int[] arr){
		
		for(int i=1;i<arr.length-1;i++){
		int first=	findMin(0,i-1,arr[i],arr);
		int second=	findMax(i+1,arr.length-1,arr[i],arr);
		if(first!=-1&&second!=-1){
		System.out.println("Triplet "+first+" "+arr[i]+" "+second);}
		}
		
		
	}
	
	
	public static int findMax(int start,int end,int key,int[] arr){
		int max=key;
		for(int i=start;i<=end;i++){
		if(	arr[i]>max){
			max=arr[i];
		}
		}
		if(max==key)
		return -1;
		else
			return max;
		
	}
	
	
	public static int findMin(int start,int end,int key,int[] arr){
		
		Integer min=null;
		for(int i=start;i<=end;i++){
		if(	arr[i]<key&&(min==null||min<arr[i])){
			
			min=arr[i];
		}
		}
		
		if(min==null)
			return -1;
			else
				return min;
	}

}
