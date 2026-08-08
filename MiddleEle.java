public class MiddleEle {
    public static void main(String[] args) {

        int[] a = {10, 20, 30};

        if (a.length % 2 != 0) {
                int middleIndex=a.length/2;
            System.out.println("Middle Element = " + a[middleIndex]);
        } else {
            System.out.println("No Middle Element");
        }
    }
}