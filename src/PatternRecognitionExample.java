public class PatternRecognitionExample {

    public static void main(String[] args) {

        String s = "tata";

        boolean value = isRecognition(s);

        if (value == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static boolean isRecognition(String s) {

        int l = s.length();

        if (l % 2 == 1) {
            return false;
        }

        int i = 0;
        int j = l - 1;

        while (i < j) {
            if (s.charAt(i) != 'a' || s.charAt(j) != 'b') {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

}
