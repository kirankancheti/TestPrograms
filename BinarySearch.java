
public class BinarySearch {
	
	public static void main(String[] args){
		int arr[]={1,3,4,6,8,9,10};
	System.out.println(	BinarySearchMethod(arr, 0, arr.length, 11));
	}
	
	public static int BinarySearchMethod(int[] arr,int low,int high,int element){
		
		int mid=(low+high)/2;
		
			System.out.println("element not found");

		if(arr[mid]==element){
			System.out.println("element found");
			return mid;
		}
//		if(low==mid||mid==high){
//			System.out.println("element not found");
//			return low;}
	
		 if(arr[mid]>element){
		return	BinarySearchMethod(arr, 0, mid-1, element);}
		else{
		return	BinarySearchMethod(arr, mid+1, high, element);
		}
		
		
	}

}
