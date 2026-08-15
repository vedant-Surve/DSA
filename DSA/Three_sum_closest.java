import java.util.Arrays;
public class Three_sum_closest{
    public static void main(String[] args){
        int[] arr={-1,-1,0,1,2,4,3,5,4}
        Arrays.sort(arr);
        int n=a.length;
        for(int i=0;i<n-2;i++){
            if( i>0 && a[i]==a[i-1]){
                continue;
            }
            int left=i+1;
            int right=n-1;
            int sum=8;
            while(left<right){
                int s=a[left]+a[right];;
                if(s==sum){
                    System.out.println(a[i]+" "+a[left]+" "+a[right]);
                    left++;
                    right--;
                    while(left<n && a[left]==a[left-1]){
                        left++;
                    }
                    while(right>=0 && a[right]==a[right+1]){
                        right--;
                    }
                }
                else if(s<sum){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
    }
}
  