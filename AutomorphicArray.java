public class AutomorphicArray {
    public static void main(String[] args) {

        int[] a={5,6,25,76,15};
        int[] b=new int[a.length];
        int index=0;

        for(int num:a){
            int square=num*num;
            int temp=num;
            int digits=1;

            while(temp>=10){
                digits*=10;
                temp/=10;
            }

            if(square%digits==num)
                b[index++]=num;
        }

        System.out.println("Automorphic Numbers:");
        for(int i=0;i<index;i++)
            System.out.println(b[i]);
    }
}
