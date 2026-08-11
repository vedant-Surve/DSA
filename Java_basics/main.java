/*import java.util.Scanner;
public class Main{
    public static void main(String[] args){
       int a=29;
       //String  name= "Vedant";
       char grade='A';
       boolean isStudent=false;
       Scanner scanner=new Scanner(System.in);
       System.out.println("Hi what is your name?");
       String name = scanner.nextLine();
       System.out.println("Your age is:"+a);
       System.out.println("Your name is:"+name);
       System.out.println("Your grade is:"+grade);
       if(isStudent){
         System.out.println("U are applicable for scheme");
       }
       else{
        System.out.println("U are not applicable for scheme");
       }
       System.out.println(name + " has grade " + grade);
    }
}
*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int p,n,t;
        double r;
        System.out.println("Enter a principle Amount:");
        p=scanner.nextInt();
        System.out.prin
        tln("Enter a rate of intrest");
        r=scanner.nextDouble();
         r = r / 100;
        System.out.println("No. of times intrest is compounded per year");
        n=scanner.nextInt();
        System.out.println("No. of years");
        t=scanner.nextInt();
        double A=p*Math.pow(1+(r/n),n*t);
        System.out.printf("Fianl amount after %d year is %.2f\n",t,A);

    }
}