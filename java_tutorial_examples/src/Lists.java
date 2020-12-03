import java.util.ArrayList; // Import the ArrayList class
import java.util.Collections;

class Lists {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>(); // Create an ArrayList object

        // Add Items
        // The ArrayList class has many useful methods. For example, to add elements to the ArrayList, use the add() method:
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        // Access an Item
        // To access an element in the ArrayList, use the get() method and refer to the index number:
        System.out.println(cars.get(0));

        // Change an Item
        // To modify an element, use the set() method and refer to the index number:
        cars.set(0, "Opel");
        System.out.println(cars);

        // Remove an Item
        // To remove an element, use the remove() method and refer to the index number:
        cars.remove(0);
        System.out.println(cars);

        // To remove all the elements in the ArrayList, use the clear() method:
        cars.clear();
        System.out.println(cars);

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        // ArrayList Size
        // To find out how many elements an ArrayList have, use the size method:
        cars.size();

        // Loop Through an ArrayList
        // Loop through the elements of an ArrayList with a for loop, and use the size() method to specify how many times the loop should run:
        for (int i = 0; i < cars.size(); i++)
            System.out.println(cars.get(i));


        // You can also loop through an ArrayList with the for-each loop:
        for (String i : cars)
            System.out.println(i);

        // Create an ArrayList to store numbers (add elements of type Integer):
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(25);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(33);
        for (int i : myNumbers)
            System.out.print(i + " ");
        System.out.println();

        // Sort an ArrayList of Integers (using the sort method of Collections lib):
        Collections.sort(myNumbers);  // Sort myNumbers
        System.out.print("Sorted: ");
        for (int i : myNumbers)
            System.out.print(i + " ");
    }
}