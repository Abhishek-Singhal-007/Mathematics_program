public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int fact = num;
        for (int i = num-1; i > 0; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
