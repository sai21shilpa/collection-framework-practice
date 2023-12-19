
public class Main {
	
	public static void main(String args[])
	{
	 int[] arr={1,3,4,5,7,8};
	 swap(arr,1,4);
	 for(int i=0;i<arr.length;i++)
	  {
	     System.out.print(arr[i]+" ");
	  }
	}
	
	static void swap(int[] arr, int index1,int index2)
	{
	    int temp=arr[index1];
	    arr[index1]=arr[index2];
	    arr[index2]=temp;
	}
	

}
