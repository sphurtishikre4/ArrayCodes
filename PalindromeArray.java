public class PalindromeArray {
    public static void main(String[] args) {
        int[] a={121,234,151,111,567};
        int[] b=new int[a.length];
        int index=0;

        for(int num:a){
            int temp=num;
            int rev=0;

            while(temp>0){
                rev=rev*10+temp%10;
                temp/=10;
            }

            if(rev==num)
                b[index++]=num;
        }

        System.out.println("Palindrome Numbers:");
        for(int i=0;i<index;i++)
            System.out.println(b[i]);
    }
}
