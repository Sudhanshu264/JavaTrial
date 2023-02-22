public class Conditional{
    public static void main(String[] args){
        int age =18;
        if(age>=18 && age<60){
            System.out.println("you are an adult");
        }
        else if(age>60){
            System.out.println("you are an old man");
        }
        else{
            System.out.println("you are still a kid");
        }
    }
}