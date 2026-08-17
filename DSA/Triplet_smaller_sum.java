import java.util.Arrays;

public class Triplet_smaller_sum {
    public static void main(String[] args) {
        int[] a = {-1, -1, 0, 1, 3, 2, 14, 15, 11};
        Arrays.sort(a);
        int n = a.length;
        
        int min_sum = Integer.MAX_VALUE;
        int t1 = 0, t2 = 0, t3 = 0;
        
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            
            while (left < right) {
                int s = a[i] + a[left] + a[right];
                
                if (s < min_sum) {
                    min_sum = s;
                    t1 = a[i];
                    t2 = a[left];
                    t3 = a[right];
                }
                
                if (s < 0) {
                    left++;
                } else {
                    right--;
                }
            }   
        }
        
        System.out.println("Triplet with the smallest sum: " + t1 + ", " + t2 + ", " + t3);
        System.out.println("Minimum Sum: " + min_sum);
    }
}