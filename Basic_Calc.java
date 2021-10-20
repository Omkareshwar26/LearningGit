import java.util.Scanner;

public class Basic_Calc {
    public static void main(String[] args) {
        System.out.println("Basic Calculator");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Number 1 : ");
        int number1 = scanner.nextInt();
        System.out.println("Number 2 : ");
        int number2 = scanner.nextInt();
        System.out.println("Choose Operations (+, -, *, /, %) : ");
        char operator = scanner.nextChar();
        System.out.println("Result : ");
        
        switch(operator) {
            case '+' : System.out.println(number1 + number2);
                break;
            case '-' : System.out.println(number1 - number2);
                break;
            case '*' : System.out.println(number1 * number2);
                break;
            case '/' : System.out.println(number1 / number2);
                break;
            case '%' : System.out.println(number1 % number2);
                break;
            default : System.out.println("Choosen wrong operator !!");
            
        }
    }
}