import java.util.Arrays;

public class StoreBinaryValue {

    public static void main(String[] args) {

        int[] arr = {10, 20, 5, 7};

        System.out.println(Arrays.toString(StoreBinVal(arr)));
    }

    public static int[] StoreBinVal(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = DectoBin(nums[i]);
        }

        return nums;
    }

    public static int DectoBin(int num) {

        int bin = 0;
        int place = 1;

        while (num > 0) {
            int lastDigit = num % 2;
            bin = bin + lastDigit * place;
            place = place * 10;
            num = num / 2;
        }

        return bin;
    }
}