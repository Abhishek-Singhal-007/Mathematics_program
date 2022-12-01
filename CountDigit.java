public class CountDigit {
    public static void main(String[] args) {
        int val = 12345;
        int count = 0;
        while (val>0) {
            count++;
            val = val/10;
        }
        System.out.println(count);
    }
}
