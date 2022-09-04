public class sorting {
    int[] bubbleSort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    int[] recursiveBubbleSort(int[] arr,int n){
        if(n==1)return arr;
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                count++;
            }
        }
        if(count==0)return arr;
        return recursiveBubbleSort(arr,n-1);
    }
    int[] selectionSort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        return arr;
    }
    int[] insertionSort(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }
    void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        sorting obj=new sorting();
        int arr[]={9,6,7,8,5,4,3,2,1,0};
        // int ans[]=obj.bubbleSort(arr);
        // int ans[]=obj.recursiveBubbleSort(arr,arr.length);
        // int ans[]=obj.selectionSort(arr);
        int ans[]=obj.insertionSort(arr);
        obj.print(ans);
    }
}



