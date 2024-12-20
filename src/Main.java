public class Main<T extends Comparable<T>> {
    private T a, b, c;

    public Main(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T findMax() {
        return findMax(a, b, c);
    }

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
        Main<Integer> intMax = new Main<>(9, 3, 1);
        System.out.println("Max Integer: " + intMax.findMax());

        Main<Float> floatMax = new Main<>(2.2f, 9.5f, 1.3f);
        System.out.println("Max Float: " + floatMax.findMax());

        Main<String> stringMax = new Main<>("Apple", "Peach", "Banana");
        System.out.println("Max String: " + stringMax.findMax());
    }
}

