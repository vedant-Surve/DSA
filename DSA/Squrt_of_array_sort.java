import java.util.Arrays;
public class Squrt_of_array_sort{
    public static void main(String[] args){
        int[] arr={1,3,5,6,8,-1};
        Arrays.sort(arr);
        int n=arr.length;
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr1);
        for(int i=0;i<n;i++){
            System.out.println(arr1[i]);
        }
    }
}