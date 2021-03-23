import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>();

        vector.add(120);
        vector.insert(0, 10);

        System.out.println(Arrays.toString(vector.mylist));


        // [10, 20, 20, n, n, n, n, n, n, n]

    }
}
