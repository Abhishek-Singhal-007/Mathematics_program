import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int val = sc.nextInt();
        boolean flag = false;
        for(int i = 2; i < val; i++){
            if(val % i == 0){
                flag = false;
                break;
            }else{
                flag = true;
            }
        }
        if(flag){
            System.out.println(val + " is Prime");
        }else{
            System.out.println(val + " is not Prime");
        }
        sc.close();
    }
}
