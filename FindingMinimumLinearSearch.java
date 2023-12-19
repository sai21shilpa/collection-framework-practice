 static int linearSearch(int[] arr)
    {
        int min=arr[0];
        if(arr.length==0)
        {
            return -1;
        }
        for(int i=0;i<arr.length;i++)
        {
          
            if(min>arr[i])
            {
                min=arr[i];
            }
            else
            {
                i++;
            }
        }
        return min;
        
    }
