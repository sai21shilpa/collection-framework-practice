
class HelloWorld {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,1,6},
            {3,3,7}
        };
        int a=maximumWealth(arr);
        System.out.print(a);
    }
    static int maximumWealth(int[][] arr)
    {
       
        int res=Integer.MIN_VALUE;
        for(int[] ints:arr)
        {
              int sum=0;
            for(int accountAmount:ints)
            {
                sum=sum+accountAmount;
            }
            if(sum>res)
            {
                res=sum;
            }
            
        }
        return res;
    }
}
