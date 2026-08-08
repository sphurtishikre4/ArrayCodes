public class ProductDiv3 {
    public static void main(String[] args) {

        int[] a = {10, 12, 15, 20, 21};

        int product = 1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0) {
                product *= a[i];
            }
        }

        System.out.println(product);
    }
}