import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int val = sc.nextInt();
        int count = 0;
        while (val>0) {
            count++;
            val = val/10;
        }
        System.out.println(count);
        sc.close();
    }
}
