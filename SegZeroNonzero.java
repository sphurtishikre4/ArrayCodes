
import java.util.Arrays;

public class SegZeroNonzero {
        public static void main(String[] args) {
                int a[]= {0,3,1,0,5,0};
                System.out.println(Arrays.toString(a));
                segregateZeroNonZero(a);
                System.out.println(Arrays.toString(a));
        }
        public static void segregateZeroNonZero(int[] nums) {

            int i = 0, j = nums.length - 1;

            while (i < j) {

                while (i < j && nums[i] == 0)
                    i++;

                while (i < j && nums[j] != 0)
                    j--;

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j--;
            }
        }
}