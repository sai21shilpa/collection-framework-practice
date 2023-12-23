// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
      char[] arr={'c','d','f','j'};
      char target='h';
      char ans=ceiling(arr,target);
      System.out.print(ans);
    }
    
    static char ceiling(char[] arr, int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=(start)+(end-start)/2;
            
            if(target < arr[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return arr[start % arr.length];
    }
}
