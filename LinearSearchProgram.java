// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
      int[] arr={1,2,3,12,43,64,143,89,134};
      int target=36;
      int res=linearSearch(arr,target);
      System.out.println(res+" is index position of "+target);
      System.out.println();
      int res1=linearSearch1(arr,target);
      System.out.println(target+" Exists!");
      System.out.println();
      boolean res2=linearSearch2(arr,target);
      System.out.println(res2);
    }
    static int  linearSearch1(int[] arr, int target)
    {
      if(arr.length==0)
      {
        return Integer.MAX_VALUE;
      }
      for(int i=0;i<arr.length;i++){
          if(arr[i]==target)
          {
              return target;
          }
      }
      return Integer.MAX_VALUE;
    }
    
    static boolean  linearSearch2(int[] arr, int target)
    {
      if(arr.length==0)
      {
        return false;
      }
      for(int i=0;i<arr.length;i++){
          if(arr[i]==target)
          {
              return true;
          }
      }
      return false;
    }
    static int linearSearch(int[] arr, int target)
    {
      if(arr.length==0)
      {
        return -1;
      }
      for(int i=0;i<arr.length;i++){
          if(arr[i]==target)
          {
              return i;
          }
      }
      return -1;
    }
}
