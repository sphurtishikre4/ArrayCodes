import java.util.Arrays;

public class SegregatePerfect {

    public static void main(String[] args){

        int[] nums={6,10,28,15,12};

        System.out.println(Arrays.toString(segregatePerfect(nums)));
    }


    public static int[] segregatePerfect(int[] nums){

        int i=0,j=nums.length-1;


        while(i<j){

            while(i<j && isPerfect(nums[i]))
                i++;


            while(i<j && !isPerfect(nums[j]))
                j--;


            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;


            i++;
            j--;
        }


        return nums;
    }
    
    public static boolean isPerfect(int num){

        if(num<=1)
            return false;


        int sum=0;


        for(int i=1;i<=num/2;i++){

            if(num%i==0)
                sum=sum+i;
        }


        return sum==num;
    }
}