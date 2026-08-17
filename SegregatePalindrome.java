import java.util.Arrays;

public class SegregatePalindrome {

    public static void main(String[] args) {

        int[] nums = {121, 45, 222, 78, 343};

        System.out.println(Arrays.toString(segregatePalindrome(nums)));
    }


    public static int[] segregatePalindrome(int[] nums) {

        int i=0, j=nums.length-1;


        while(i<j) {

            while(i<j && isPalindrome(nums[i]))
                i++;

            while(i<j && !isPalindrome(nums[j]))
                j--;


            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;


            i++;
            j--;
        }

        return nums;
    }


    public static boolean isPalindrome(int num) {

        int temp=num;
        int rev=0;
                   
        while(num>0) {

            int rem=num%10;

            rev=rev*10+rem;

            num/=10;
        }


        return temp==rev;
    }
}
