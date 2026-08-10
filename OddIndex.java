public class OddIndex {

    public static void main(String[] args) {

        char[] ch = {'A','b','@','E','m','#','u','P','7'};

        for (int i = 1; i < ch.length; i += 2) {

            System.out.print(ch[i] + " ");
        }
    }
}
