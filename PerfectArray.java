public class PerfectArray {
    public static void main(String[] args) {

        int[] a={6,10,28,12,496};
        int[] b=new int[a.length];
        int index=0;

        for(int num:a){

            int sum=0;

            for(int i=1;i<num;i++){
                if(num%i==0)
                    sum+=i;
            }

            if(sum==num)
                b[index++]=num;
        }

        System.out.println("Perfect Numbers:");
        for(int i=0;i<index;i++)
            System.out.println(b[i]);
    }
}
