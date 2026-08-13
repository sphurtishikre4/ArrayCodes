public class ArmstrongArray {
    public static void main(String[] args) {

        int[] a={153,370,407,125,1634};
        int[] b=new int[a.length];
        int index=0;

        for(int num:a){

            int temp=num;
            int digits=String.valueOf(num).length();
            int sum=0;

            while(temp>0){
                int digit=temp%10;
                sum+=Math.pow(digit,digits);
                temp/=10;
            }

            if(sum==num)
                b[index++]=num;
        }

        System.out.println("Armstrong Numbers:");
        for(int i=0;i<index;i++)
            System.out.println(b[i]);
    }
}

