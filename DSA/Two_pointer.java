
import java.util.Arrays;
import java.util.Scanner;
public class Two_pointer{
 public static void main(String[] args){
    int[] array ={1,5,3,2,7};
    Arrays.sort(array);
    int len=array.length;
    int target=9;
    int i=0;
    int j=len-1;
    boolean found=false;
    while(j>i){
        int sum=array[i]+array[j];
        if(sum==target){
            System.out.println(array[i]+" and "+array[j]);
            found=true;
            i++;
            j--;
        }else if (sum < target){
            i++;
        }else{
            j--;
        }
    }
    if(!found){
        System.out.println("OOPS, YOU CANT GET YOUR EXPECTED SUM FROM THIS ARRAY!!");
    }
 }
}