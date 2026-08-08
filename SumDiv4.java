public class SumDiv4 {
    public static void main(String[] args) {

        int[] a = {8, 10, 12, 15, 16};

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 4 == 0) {
                sum += a[i];
            }
        }

        System.out.println(sum);
    }
}