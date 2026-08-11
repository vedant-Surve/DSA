import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String[] foods=new String[3];
        String target;
        System.out.println("Enter a fruit name which you like most:");
        target =scanner.nextLine();
        for (int i=0;i<foods.length;i++){
            System.out.printf("Enter %d fruit name:",i);
            foods[i]=scanner.nextLine();
        }
        for (int i=0;i<foods.length;i++){
            if(target.equals(foods[i])){
                 System.out.println(foods[i]);
                 System.out.println("Yeah She is your finally!");
                 break;
            }
           else{
            System.out.println("Sorry,The fruit you loved is not in your list");
           }
        }
        
    }
}