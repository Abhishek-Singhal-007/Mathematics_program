public class Palindrome {
    public static void main(String[] args) {
        int val = 2002;
        int sum = 0;
        int copy = val;
        while (val > 0) {
            int icopy = val % 10;
            val = val / 10;
            sum = sum * 10 + icopy;
        }
        if(sum == copy){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not Palindrome");
        }
    }
}
