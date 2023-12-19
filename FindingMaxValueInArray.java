class Main {
    public static void main(String[] args) {
        int arr[]={1,5,2,3,45,53,90,7};
        System.out.print(max(arr));
    }
    
    static int max(int[] arr)
    {   int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
