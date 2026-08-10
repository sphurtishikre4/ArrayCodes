public class AverageASCII {
    public static void main(String[] args) {

        char[] ch = {'M', 'N', 'O'};

        int sum = 0;

        for (int i = 0; i < ch.length; i++) {
            sum += ch[i];
        }

        double avg = (double) sum / ch.length;

        System.out.println("Average = " + avg);
    }
}