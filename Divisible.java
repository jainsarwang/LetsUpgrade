import java.util.Scanner;

class Divisible{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to test: ");
        int n = sc.nextInt();

        if(n%23 == 0) {
            System.out.println("The Number is Divisible by 23");
        }else{
            System.out.println("The Number is not Divisible by 23");
        }
    }
}