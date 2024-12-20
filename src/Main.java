public class Main {
    public static Integer findMax(Integer a, Integer b, Integer c) {
        Integer max = a; // Assume a is the largest
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max (1st): " + findMax(9, 3, 1)); // Max in 1st position
        System.out.println("Max (2nd): " + findMax(2, 9, 1)); // Max in 2nd position
        System.out.println("Max (3rd): " + findMax(1, 3, 9)); // Max in 3rd position
    }
}