public class NeonNum {
    public static void main(String[] args) {
        int[] a = {9, 10, 1, 7, 5};
        int[] b = new int[a.length];
        int index = 0;

        for (int num : a) {
            int square = num * num;
            int sum = 0;

            while (square > 0) {
                sum += square % 10;
                square /= 10;
            }

            if (sum == num) {
                b[index++] = num;
            }
        }

        System.out.println("Neon Numbers:");
        for (int i = 0; i < index; i++)
            System.out.println(b[i]);
    }
}
