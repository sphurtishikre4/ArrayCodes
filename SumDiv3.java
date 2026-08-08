public class SumDiv3 {
    public static void main(String[] args) {

        int[] a = {10, 12, 15, 20, 21};

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0) {
                sum += a[i];
            }
        }

        System.out.println(sum);
    }
}