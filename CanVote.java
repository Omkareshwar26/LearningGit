import java.util.Scanner;

public class CanVote {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Age : ");
        int age = scan.nextInt();
        if(age < 1 || age > 200) {
            System.out.println("Invalid Age !!");
        }
        else if(age < 18) {
            System.out.println("Can not Vote !");
        }
        else {
            System.out.println("Can Vote..");
        }
    }
}