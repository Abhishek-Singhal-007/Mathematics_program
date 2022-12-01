import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int fact = num;
        for (int i = num-1; i > 0; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
        sc.close();
    }
}
