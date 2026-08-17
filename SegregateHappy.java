import java.util.Arrays;

public class SegregateHappy {

    public static void main(String[] args) {

        int[] nums={19,20,7,4,10};

        System.out.println(Arrays.toString(segregateHappy(nums)));
    }


    public static int[] segregateHappy(int[] nums){

        int i=0,j=nums.length-1;


        while(i<j){

            while(i<j && isHappy(nums[i]))
                i++;


            while(i<j && !isHappy(nums[j]))
                j--;


            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;


            i++;
            j--;
        }


        return nums;
    }
     public static boolean isHappy(int num){

        while(num!=1 && num!=4){

            int sum=0;


            while(num>0){

                int rem=num%10;

                sum=sum+rem*rem;

                num/=10;
            }


            num=sum;
        }


        return num==1;
    }
}