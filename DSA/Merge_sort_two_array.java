import java.util.Scanner;
public class Example{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[]  arr=new int[3];
        int[]  arr1=new int[5];
        int n=arr.length;
        int m=arr1.length;
        int x=n+m;
        System.out.println("Array 1");
        for(int i=0;i<n;i++){
            System.out.printf("Enter array with %d no:",i);
            arr[i]=scanner.nextInt();
        }
        System.out.println("Array 2");
         for(int j=0;j<m;j++){
            System.out.printf("Enter array with %d no:",j);
            arr1[j]=scanner.nextInt();
        }
        int[] arr_result=new int[x];
        int k=0;
        // Bubble Sort
        for (int a = 0; a < n - 1; a++) {
            for (int b = 0; b < n - a - 1; b++) {
                if (arr[b] > arr[b + 1]) {
                    int temp = arr[b];
                    arr[b] = arr[b + 1];
                    arr[b + 1] = temp;
                }
            }
        }
        for (int a = 0; a < m - 1; a++) {
            for (int b = 0; b < m - a - 1; b++) {
                if (arr1[b] > arr1[b + 1]) {
                    int temp = arr1[b];
                    arr1[b] = arr1[b + 1];
                    arr1[b + 1] = temp;
                }
            }
        }
        int i=0,j=0;
        while(i<n && j<m){
            if(arr[i]<=arr1[j]){
                arr_result[k]=arr[i];
                i++;
                k++;
            }
            else{
                arr_result[k]=arr1[j];
                j++;
                k++;
            }     
        }
        while(j<m){
            arr_result[k]=arr1[j];
            j++;
            k++;
        }
        while(i<n){
            arr_result[k]=arr[i];
            i++;
            k++;
        }
    System.out.println("Result after sorting and merging two arrays:");
    for(int z=0;z<x;z++){
        System.out.print(arr_result[z]+" ");
    }
    }
}