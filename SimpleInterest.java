import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Principle : ");
        int principle = scanner.nextInt();
        System.out.println("Rate : ");
        float rate = scanner.nextFloat();
        System.out.println("Time : ");
        int time = scanner.nextInt();

        float simpleInterest = (float)((principle*rate*time)/100);

        System.out.println("Simple Interest : " + simpleInterest);
    }
}