import java.util.Scanner;

public class Arithmetic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Two numbers: ");
        double num1 = sc.nextDouble(), num2 = sc.nextDouble(), res = 0;

        System.out.println("Choose an Operator: ");
        char op = sc.next().charAt(0);

        sc.close();
        
        switch(op){
            case '+':
                res = num1+num2;
                break;
            case '-':
                res = num1-num2;
                break;
            case '*':
                res = num1*num2;
                break;
            case '/':
                res = num1/num2;
                break;
            default:
                System.out.println("Invalid Input");
                return;
        }

        System.out.println(res);
    }
}