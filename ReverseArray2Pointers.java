// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int arr[]={1,5,2,3,45,53,90,7};
        reverse(arr);
    }
    static void reverse(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start < end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[] arr,int start,int end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
}
