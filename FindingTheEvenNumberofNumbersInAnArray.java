// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      int[] arr={1,2,3,43,23,56,24};
      System.out.print(findCount(arr));
    }
    static int findCount(int[] nums)
    {   int count=0;
        for(int num:nums)
        {
          if(EvenNumber(num))
          {
              count++;
          }
        }
        return count;
    }
    static boolean EvenNumber(int num)
    {
        int n=countNum(num);
        return n%2==0;
    }
    
    static int countNum(int num)
    {
        int count=0;
        while(num>0)
        {
            count++;
            num=num/10;
        }
        return count;
    }
    
   
   
         
}
