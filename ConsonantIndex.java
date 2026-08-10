public class ConsonantIndex {
    public static void main(String[] args) {

        char[] ch = {'A','b','@','E','m','#','u','P','7'};

        for (int i = 0; i < ch.length; i++) {

            char c = ch[i];

            if (((c>='A'&&c<='Z')||(c>='a'&&c<='z')) &&
                !(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||
                  c=='a'||c=='e'||c=='i'||c=='o'||c=='u')) {

                System.out.print(i + " ");
            }
        }
    }
}