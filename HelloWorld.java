import java.util.Scanner;

public class HelloWorld {
    public static void main() {
        System.out.println("Hello World");
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your Name : ");
        String userName = scanner.nextLine();
        System.out.println("Hi, " + userName);
    }
}