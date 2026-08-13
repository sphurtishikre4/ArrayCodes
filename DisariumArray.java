
public class DisariumArray {
    public static void main(String[] args) {

        int[] a={89,135,175,518};
        int[] b=new int[a.length];
        int index=0;

        for(int num:a){

            String s=String.valueOf(num);
            int sum=0;

            for(int i=0;i<s.length();i++){
                int digit=s.charAt(i)-'0';
                sum+=Math.pow(digit,i+1);
            }

            if(sum==num)
                b[index++]=num;
        }

        System.out.println("Disarium Numbers:");
        for(int i=0;i<index;i++)
            System.out.println(b[i]);
    }
}