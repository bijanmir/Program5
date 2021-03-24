public class Main {
    public static void main(String[] args) {
        Vector<Double> vector = new Vector<Double>();

        vector.add(10.22);
        vector.add(20.22);
        vector.add(30.22);
        vector.add(40.22);
        vector.add(50.22);
        vector.add(60.22);
        vector.add(70.22);
        vector.add(80.22);
        vector.add(90.22);



        System.out.println(String.format("The size of the vector %d", vector.size()));
        System.out.println(vector.toString());

        vector.remove(1);

        System.out.println(String.format("The size of the vector %d", vector.size()));

        System.out.println(vector.toString());
//
        vector.add(24.22);

        System.out.println(vector.toString());
//
//        vector.insert(1, 25);
//        System.out.println(String.format("The size of the vector %d", vector.size()));
//
//        boolean has_number = vector.contains(30);
//        System.out.println(String.format("Contains number in array: %b", has_number));
//
//        System.out.println(vector.indexOf(90.22));

//        Double number = (Double) vector.get(1);
//        System.out.println(String.format("The number picked %d", number));
//        vector.trimSize();
//        vector.printArray();

    }
}
