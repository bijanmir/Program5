public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>();

        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        vector.add(60);
        vector.add(70);
        vector.add(80);
        vector.add(90);

        vector.printArray();

        System.out.println(String.format("The size of the vector %d", vector.size()));
        vector.remove(1);
        System.out.println(String.format("The size of the vector %d", vector.size()));


        vector.printArray();

        vector.insert(1, 25);
        System.out.println(String.format("The size of the vector %d", vector.size()));
        vector.printArray();
        boolean has_number = vector.contains(30);
        System.out.println(String.format("Contains number in array: %b", has_number));

        Integer number = (Integer) vector.get(1);
        System.out.println(String.format("The number picked %d", number));
        vector.trimSize();
        vector.printArray();

    }

}
