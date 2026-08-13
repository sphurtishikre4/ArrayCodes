
public class HarshadArray {
    public static void main(String[] args) {

        int[] a={18,21,24,25,36};
        int[] b=new int[a.length];
        int index=0;

        for(int num:a){
            int temp=num;
            int sum=0;

            while(temp>0){
                sum+=temp%10;
                temp/=10;
            }

            if(num%sum==0)
                b[index++]=num;
        }

        System.out.println("Harshad Numbers:");
        for(int i=0;i<index;i++)
            System.out.println(b[i]);
    }
}