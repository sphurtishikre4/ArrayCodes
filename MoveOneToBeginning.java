import java.util.Arrays;

public class MoveOneToBeginning {

    public static void main(String[] args) {

        int[] nums = {5, 1, 8, 4, 1, 7, 0, 3,1};

        System.out.println(Arrays.toString(moveOneToBeginning(nums)));
    }

    public static  int[] moveOneToBeginning(int[] nums) {

    int i = 0, j = nums.length - 1;

    while (i < j) {

        while (i < j && nums[i] == 1)
            i++;

        while (i < j && nums[j] != 1)
            j--;

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        i++;
        j--;

    }
return nums;
    }
}