// package Sorting;
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

    void merge(int arr[],int l,int m,int r)
    {
        int len1=m-l+1;
        int len2=r-m;
        int arr1[]=new int[len1];
        int arr2[]=new int[len2];
        for(int i=0;i<len1;i++)
        {
            arr1[i]=arr[l+i];
        }
        for(int j=0;j<len2;j++)
        {
            arr2[j]=arr[m+j+1];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<len1&&j<len2)
        {
            if(arr1[i]<arr2[j])
            {
                arr[k]=arr1[i];
                i++;
            }
            else{
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<len1){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<len2){
            arr[k]=arr2[j];
            j++;
            k++;
        }
    }

    void mergeSort(int arr[],int l,int r)
    {
        if(l<r){
            int m=l+(r-l)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
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
        // int ans[]=obj.insertionSort(arr);
        obj.mergeSort(arr,0, arr.length-1);
        // obj.print(ans);
        obj.print(arr);
    }
}



