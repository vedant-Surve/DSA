import java.util.Arrays;

public class Three_sum_closest {
    public static void main(String[] args) {
        int[] a = {-1, -1, 0, 1, 3, 2, 14, 15, 11};
        Arrays.sort(a);
        int n = a.length;
        int max_diff = Integer.MAX_VALUE;
        int target = 8; 
        
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            
            while (left < right) {
                int s = a[left] + a[right] + a[i];
                int diff = Math.abs(s - target);
                
                
                if (diff < max_diff) {
                    max_diff = diff;
                    System.out.println("New closest triplet: " + a[i] + " " + a[left] + " " + a[right] + " (Diff: " + diff + ")");
                }
                
                if (s == target) {
                    left++;
                    right--;
                    while (left < n && a[left] == a[left - 1]) {
                        left++;
                    }
                    while (right >= 0 && a[right] == a[right + 1]) {
                        right--;
                    }
                } else if (s < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println("Minimum Difference: " + max_diff);
    }
}