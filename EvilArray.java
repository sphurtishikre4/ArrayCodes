public class EvilArray {
    public static void main(String[] args) {

        int[] a={3,5,7,9,10};
        int[] b=new int[a.length];
        int index=0;

        for(int num:a){
            int temp=num;
            int count=0;

            while(temp>0){
                if(temp%2==1)
                    count++;
                temp/=2;
            }

            if(count%2==0)
                b[index++]=num;
        }

        System.out.println("Evil Numbers:");
        for(int i=0;i<index;i++)
            System.out.println(b[i]);
    }
}