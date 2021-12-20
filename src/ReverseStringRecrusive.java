public class ReverseStringRecrusive {

    public String reverseString(String str) {

        if (str.isEmpty()) {
            System.out.println("String is empty");
            return str;

        } else {
            return reverseString(str.substring(1)) + str.charAt(0);

        }

    }

    public static void main(String[] args) {

        ReverseStringRecrusive rs = new ReverseStringRecrusive();
        String result = rs.reverseString("john");
        String result1 = rs.reverseString("bba");
        String result2 = rs.reverseString("aba");

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

    }

}
