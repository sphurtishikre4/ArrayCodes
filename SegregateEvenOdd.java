import java.util.Arrays;

public class SegregateEvenOdd {

    public static void main(String[] args) {

        int[] nums = {12, 7, 5, 18, 9, 2, 15, 4};

        segregateEvenOdd(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void segregateEvenOdd(int[] nums) {

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            while (i < j && nums[i] % 2 == 0) {
                i++;
            }

            while (i < j && nums[j] % 2 != 0) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }
}