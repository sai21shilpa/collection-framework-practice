// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int x=256;
        System.out.print(mySqrt(x));
        
    }
   static int mySqrt(int x) {
    
        int start = 1;
        int end = x;
        int ans = 0;
        
        while (start <= end){
            int mid = start + (end - start) / 2;
            
            if (mid <= x/mid ){
                start = mid + 1;
                ans = mid;
            }else{
                end = mid - 1;
            }
        }
        
        return ans;

    }
}
