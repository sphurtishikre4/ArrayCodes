public class ProductEvenASCII {
    public static void main(String[] args) {

        char[] ch = {'B', 'D', 'F'};

        int product = 1;

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] % 2 == 0) {
                product *= ch[i];
            }
        }

        System.out.println(product);
    }
}