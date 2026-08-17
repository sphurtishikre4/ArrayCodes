import java.util.Arrays;

public class SegregateAlphabetDigit {

    public static void main(String[] args) {

        char[] ch = {'a', '5', 'b', '2', 'c', '9', 'd'};

        System.out.println(Arrays.toString(segregateAlphabetDigit(ch)));
    }


    public static char[] segregateAlphabetDigit(char[] ch) {

        int i = 0, j = ch.length - 1;

        while (i < j) {

            // Move i if alphabet is already at correct position
            while (i < j && Character.isLetter(ch[i]))
                i++;

            // Move j if digit is already at correct position
            while (i < j && Character.isDigit(ch[j]))
                j--;

            // Swap digit and alphabet
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i++;
            j--;
        }

        return ch;
    }
}