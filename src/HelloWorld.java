import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Is it morning?");
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        if(answer.equalsIgnoreCase("yes"))
        {
            System.out.println("Good morning world!");
        }
        else if (answer.equalsIgnoreCase("no"))
        {
            System.out.println("Then it must be night. Goodnight World!");
        }
        else
        {
            System.out.println("Hello World!");
        }
    }
}
