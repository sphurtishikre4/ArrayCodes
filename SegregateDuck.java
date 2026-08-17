import java.util.Arrays;

public class SegregateDuck {

    public static void main(String[] args){

        int[] nums={102,45,205,89,0};

        System.out.println(Arrays.toString(segregateDuck(nums)));
    }


    public static int[] segregateDuck(int[] nums){

        int i=0,j=nums.length-1;


        while(i<j){

            while(i<j && isDuck(nums[i]))
                i++;


            while(i<j && !isDuck(nums[j]))
                j--;


            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;


            i++;
            j--;
        }


        return nums;
    }

    public static boolean isDuck(int num){

        if(num==0)
            return false;


        while(num>0){

            if(num%10==0)
                return true;


            num/=10;
        }


        return false;
    }
}
