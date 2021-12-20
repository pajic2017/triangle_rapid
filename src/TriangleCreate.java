public class TriangleCreate {

    public static void main(String[] args) {

        System.out.println("We create triangle with size of 6");

        int n = 6;
        String tri_result = createTriangle(n);
        // System.out.println("Result od create triangle is: " + tri_result);
        System.out.println(tri_result);

    }

    private static String createTriangle(int n) {

        StringBuilder result = new StringBuilder();
        // r is nuber od stars and number of row
        // n is total of row
        for (int r = 1; r <= n; r++) {

            for (int j = 1; j <= r; j++) {
                result.append("*");
            }

            result.append(System.lineSeparator());

        }

        return result.toString();

    }

}
