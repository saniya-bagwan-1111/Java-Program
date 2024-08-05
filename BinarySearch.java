import java.util.*;
public class BinarySearch {

    int [] simpleSortArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {

                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    int [] bubbleSort(int []arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {   
            System.out.println("**"+(i+1)+" Iteration**");
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]> arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
        return arr;
    }

    public static int findNumBinarySearch(int num,int arr[]){
        int l = 0, r = arr.length - 1;
        while(l<=r)
        {
            int mid = l + (r - l) / 2;
            if(arr[mid]==num)
            {
                System.out.println("Number found at "+(mid+1)+"position");
                return 1;
            }
            if(num<arr[mid])
            {
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr={21,81,19,34,67,15,76};
        
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        BinarySearch b=new BinarySearch();
        // int []arr1=b.simpleSortArray(arr);
        // for(int i=0;i<arr1.length;i++)
        // {
        //     System.out.print(arr1[i]+" ");
        // }
        int arr2[]=b.bubbleSort(arr);
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
       int r=findNumBinarySearch(num,arr);
       if(r==1){
        System.out.println("Number found");
       }
       else{
        
        System.out.println("Number not found");
       }
        sc.close();
    }
}
