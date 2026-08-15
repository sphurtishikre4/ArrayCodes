import java.util.Arrays;

public class MoveNegativeToFront {

    public static void main(String[] args) {

        int[] nums = {5, -2, 8, -4, 1, -7, 0, 3, -9};

        System.out.println(Arrays.toString(moveNegativeToFront(nums)));
    }

    public static int[] moveNegativeToFront(int[] nums) {

        int i = 0, j = nums.length - 1;

        while (i < j) {

            // Move i until a non-negative number is found
            while (i < j && nums[i] < 0)
                i++;

            // Move j until a negative number is found
            while (i < j && nums[j] >= 0)
                j--;

            // Swap
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }

        return nums;
    }
}