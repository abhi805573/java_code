
import java.util.Scanner;

 class Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");

        int a = sc.nextInt();

        System.out.println("Enter second number: ");

        int b = sc.nextInt();

        System.out.println("The multiplication of " + a + " and " + b + " is: " + (a*b));

        System.out.println("The division is of " + a + " and " + b + " is: " + (a>b ? a/b : b/a));

    }

}
