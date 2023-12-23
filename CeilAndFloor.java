// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
      int[] arr={2,3,4,6,7,8,9,10,12,34};
      int target=5;
      int ans=ceiling(arr,target);
      System.out.print(ans);
     int ans1=floor(arr,target);
      System.out.print(ans1);
    }
    
    static int floor(int[] arr, int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=(start)+(end-start)/2;
            
            if(target <= arr[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return end;
    }

 static int ceiling(int[] arr, int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=(start)+(end-start)/2;
            
            if(target <= arr[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return end;
    }
}
