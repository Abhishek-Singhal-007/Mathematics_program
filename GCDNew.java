import java.util.Scanner;

public class GCDNew {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int gcd = 1;
        for(int i=1; i <= val1 && i <= val2; ++i){
          if(val1 % i == 0 && val2 % i == 0)
            gcd = i;
        }
        System.out.println(gcd);
        sc.close();
    }
}