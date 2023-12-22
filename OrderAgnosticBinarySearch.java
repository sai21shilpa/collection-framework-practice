// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
     int[] arr={22,11,10,9,8,7,6,5,4,3,2,1,-9,-10};
     int target=-10;
     int ans=orderAgnosticBS(arr,target);
     System.out.print(ans);
    }
    static int orderAgnosticBS(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        
        while(start<=end)
        {
         int mid=start+(end-start)/2;
         if(target==arr[mid])
         {
             return mid;
         }
         if(isAsc)
         {
             if(target>arr[mid])
             {
                 start=mid+1;
             }
             else
             {
                 end=mid-1;
             }
         }
         else
         {
             if(target<arr[mid]) 
             {
                 start=mid+1;
             }
             else
             {
                 end=mid-1;
             }
         }
        
         
        }
        return -1;
    }
}
