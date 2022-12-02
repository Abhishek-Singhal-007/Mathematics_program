import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers");
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int gcd = 1;
        for(int i=1; i <= val1 && i <= val2; ++i){
          if(val1 % i == 0 && val2 % i == 0)
            gcd = i;
        }
        int lcm = (val1 * val2) / gcd;
        System.out.println("LCM of two number is " +lcm);
        sc.close();
    }
}
