
public class ProductOddEle
{
    public static void main(String[] args) {

        int[] a = {11, 20, 33, 40, 55};

        int product = 1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                product *= a[i];
            }
        }

        System.out.println(product);
    }
}