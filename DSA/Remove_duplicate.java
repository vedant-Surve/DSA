public class Remove_duplicate{
    public static void main(String[] args){
        int[] arr={1,1,1,3,3,8,8,8,8};
        int i=0;
        int j=1;
        int unique=1;
        int n=arr.length;
        while(j<n){
            if(arr[j]==arr[j-1]){
                j++;
                continue;
            }
            else if(arr[j] != arr[j-1]){
                arr[++i]=arr[j];
                unique++;
                j++;
            }
        }
        System.out.println("THe total unique no. in an array is: " + unique);
    }
}