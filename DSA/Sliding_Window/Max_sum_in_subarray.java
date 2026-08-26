import java.util.Scanner;
import java.util.Arrays;
public class Max_sum_in_subarray{
    public static void  main(String[] args){
        int[] a={5,2,1,3,8};
        int n=a.length;
        int k=2;//window size
        int low=0;
        int high=k-1;
        int sum=0;
        int res=0;
        
        for(int i=low;i<=high;i++){
            sum=sum+a[i];
        }
        while(high<n){
             res=Math.max(sum,res);
             low++;
             high++;
             sum=sum-a[low-1];
             if(high == n){
                break;
             }
             sum=sum+a[high];
        }
        System.out.printf("The max value of %d subarray is %d",k,res);
    }
}