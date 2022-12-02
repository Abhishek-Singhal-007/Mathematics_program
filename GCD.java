import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        if(val1 >= val2){
            int rem = val1 % val2;
            int div = val1 / val2;
            while (rem > 0) {
                val1 = div * val2;
                val2 = rem;
                rem = val1 % val2;
                div = val1 / val2;
            }
        }else{
            int rem = val2 % val1;
            int div = val2 / val1;
            while (rem > 0) {
                val1 = div * val2;
                val2 = rem;
                rem = val1 % val2;
                div = val1 / val2;
            }
        }
        System.out.println(val2);
        sc.close();
    }
}
