public class Main {
    public static <T extends Comparable<T>> T findMax(T a, T b, T c) {
        T max = a; // Assume a is the largest
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max Integer (1st): " + findMax(9, 3, 1));
        System.out.println("Max Float (2nd): " + findMax(2.2f, 9.5f, 1.3f));
    }
}