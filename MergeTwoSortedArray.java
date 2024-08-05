import java.util.*;

public class MergeTwoSortedArray {

    public static int [] MergeTwoArray(int arr1[],int arr2[], int arr_result[]){
        
        for (int i=0;i<arr1.length;i++)
        {
            arr_result[i]=arr1[i];
        }
        for(int i=0,j=arr1.length;i<arr2.length && j<arr_result.length;i++,j++)
        {
            arr_result[j]=arr2[i];
           // System.out.println(arr2[i]+" "+arr_result[j]);
        }
  
        return arr_result;
    }

    public static int [] MergeTwoArraywithSorting(int []arr1,int arr2[],int [] result)
    {
        //arr_result[]=arr1.length+arr2.length;
   int i=0,j=0,k=0;
        while (i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j])
            {
                result[k]=arr1[i];
                k++;i++;
            }
            else{
                result[k]=arr2[j];
                k++;j++;
            }
        
        }
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        while (j<arr2.length) {
            result[k++]=arr2[j++];
        }
        System.out.print(""+Arrays.toString(result));
        return result;
    }
    public static void main(String[] args) {
        int arr1[]={41,21,33,74,15};
        int arr2[]={60,17,28,49,10};

        int arr_result[]=new int[arr1.length+arr2.length];
        arr_result=MergeTwoArray(arr1,arr2,arr_result);
        System.out.println("After Merging Two Arrays");
      for(int i=0;i<arr_result.length;i++)
        {
            System.out.print(" "+arr_result[i]);
        }
        System.out.println("");
        int [] arr_result2=new int[arr1.length+arr2.length];
        arr_result2=MergeTwoArraywithSorting(arr1,arr2,arr_result2);
        System.out.println("After Merging Two Arrays with sort");
      for(int i=0;i<arr_result2.length;i++)
        {
            System.out.print(" "+arr_result2[i]);
        }
        
    }    
}
