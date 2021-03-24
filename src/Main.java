public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>(3);

        vector.add("ALPHA");
        vector.add("BRAVO");;




        System.out.println(String.format("The size of the vector %d", vector.size()));
        System.out.println(vector.toString());


        System.out.println(vector.remove(1));
        System.out.println(vector.remove(0));

        System.out.println(String.format("The size of the vector %d", vector.size()));

        System.out.println(vector.toString());

        vector.clear();
        System.out.println(vector.toString());
//



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
