
class HelloWorld {
    public static void main(String[] args) {
      
       int[] arr={12,34,24,54,65,78,80,97,83,246};
       int target=246;
       int res=linearSearch(arr,target,1,4);
       System.out.print(res);
    }
    
    static int linearSearch(int[] arr, int target,int start,int end)
    {
        if(arr.length ==0)
          {
              return -1;
          }
          
          for(int i=start;i<end;i++)
          {
              if(target==arr[i])
              {
                  return i;
              }
          }
          return -1;
    }
}
