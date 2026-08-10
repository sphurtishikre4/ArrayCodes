public class Consonants {

    public static void main(String[] args) {

        char[] ch = {'A','b','e','#','I','m','o','P','u','7'};

        for (char c : ch) {

            if (((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
                    && !(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'
                    || c=='a'||c=='e'||c=='i'||c=='o'||c=='u')) {

                System.out.print(c + " ");
            }
        }
    }
}