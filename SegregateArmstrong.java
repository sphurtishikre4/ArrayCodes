import java.util.Arrays;

public class SegregateArmstrong {

    public static void main(String[] args) {

        int[] nums = {153, 10, 370, 25, 371};

        System.out.println(Arrays.toString(segregateArmstrong(nums)));
    }


    public static int[] segregateArmstrong(int[] nums) {

        int i = 0, j = nums.length - 1;

        while(i < j) {

            while(i < j && isArmstrong(nums[i]))
                i++;

            while(i < j && !isArmstrong(nums[j]))
                j--;

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }

        return nums;
    }


    public static boolean isArmstrong(int num) {

        int original = num;

        int digits = String.valueOf(num).length();

        int sum = 0;
        

        while(num > 0) {

            int rem = num % 10;

            sum = sum + (int)Math.pow(rem, digits);

            num /= 10;
        }


        return sum == original;
    }
}