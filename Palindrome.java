import java.util.Scanner;

class Palindrome{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter a Number : ");

        String n = sc.next();
        int len = n.length();

        sc.close();

        for(int i = 0; i < len/2 + 1; i++) {

            if(n.charAt(i) != n.charAt(len - i - 1)) {
                System.out.print("Number is not a palindrome");

                return;
            }
        }
        System.out.print("Number is a palindrome");
    }
}