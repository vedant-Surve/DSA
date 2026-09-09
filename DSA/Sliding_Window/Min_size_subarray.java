import java.util.Scanner;

public class Min_size_subarray{
    public static void main(String[] args){
        int[] a={1,2,3,4,4};
        int target=4;
        int low=0;
        int high=0;
        int sum=0;
        int res = Integer.MAX_VALUE;
        int n=a.length;
        while(high<n){
           sum=sum+a[high];
           while(sum>=target){
            int len=high+low-1;
            res=Math.min(res,len);
            sum=sum-a[low];
            low++;
           }
           high++;
        }
        System.out.printf("Your min length of subarray is %d",res);
    }
}