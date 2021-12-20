public class ReverseStringExample {

    public static void main(String[] args) {

        String line = "john";

        String rev = reverseData(line);

        System.out.println(line + " become: " + rev);

    }

    private static String reverseData(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            result = ch + result;

        }

        return result;

    }

}
