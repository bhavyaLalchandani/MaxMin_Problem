import java.util.Arrays;

public class Main<T extends Comparable<T>> {
    private T[] elements;

    @SafeVarargs
    public Main(T... elements) {
        this.elements = elements;
    }

    public T findMax() {
        return findMax(elements);
    }

    @SafeVarargs
    public static <T extends Comparable<T>> T findMax(T... elements) {
        return Arrays.stream(elements).max(Comparable::compareTo).orElse(null);
    }

    public static void main(String[] args) {
        Main<Integer> intMax = new Main<>(9, 3, 1, 15, 7);
        System.out.println("Max Integer: " + intMax.findMax());

        Main<Float> floatMax = new Main<>(2.2f, 9.5f, 1.3f, 12.6f, 7.4f);
        System.out.println("Max Float: " + floatMax.findMax());

        Main<String> stringMax = new Main<>("Apple", "Peach", "Banana", "Mango");
        System.out.println("Max String: " + stringMax.findMax());
    }
}


