//For an unsorted array, the easiest approach is to use a HashSet,
//because a HashSet automatically keeps only unique elements.
import java.util.Scanner;
import java.util.HashSet;
public class Main{
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();
        int[] arr = {4, 2, 7, 2, 4, 9, 7, 1};
        for(int num:arr){
            set.add(num);
        }
        System.out.println(set);
    }
}