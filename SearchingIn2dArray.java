// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      
       int[][] arr={
           {12,34,24},
           {54,2,65},
           {78,80,97},
           {83,246,3}
           
       };
       int target=83;
       int[] res=linearSearch(arr,target);
       System.out.print(Arrays.toString(res));
       
    }
    
   
    static int[] linearSearch(int[][] arr,int target)
    {
     
      for(int i=0;i<arr.length;i++)
      {
          for(int j=0;j<arr[i].length;j++)
          {
              if(arr[i][j]==target)
              {
                return new int[]{i,j};  
              }
          }
      }
      return new int[]{-1,-1};  
    }
         
}
