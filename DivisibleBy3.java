public class DivisibleBy3 {
    public static void main(String[] args) {

        int[] a = {10, 12, 15, 20, 21};

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0) {
                System.out.println(a[i] + " ");
            }
        }
    }
}