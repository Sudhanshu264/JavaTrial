import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the age");
        int age= scan.nextInt();
        System.out.println("Age is"+ age);
        System.out.println("enter the avg");
        double avg=scan.nextDouble();
        System.out.println("Average is"+avg);
        System.out.println("enter name");
        String name=scan.next();
        System.out.println("name is " + name);
        
    } 
}
