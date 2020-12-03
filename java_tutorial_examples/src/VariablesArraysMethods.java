public class VariablesArraysMethods {

    // Method that returns the mean value of a given integer array
    public static double meanValue(int[] numbers){
        int sum = 0;
        double mean;

        for (int number : numbers)
            sum += number; //sum = sum + numbers[i]

        mean = (double) sum / numbers.length; // Casting to double

        return mean;
    }


    public static void main(String[] args) {
        // integer
        int x = 5;
        int y;
        y = 10;
        System.out.println("x+y: " + (x + y));
        System.out.println("x+5: " + (x+ 5));

        // double, float
        double xd = 5.3;
        double yd;
        yd = 10.1;
        System.out.println("xd+yd :" + (x + yd));
        System.out.println("xd+5 :" + (xd + 5));

        // boolean
        boolean bool = true;
        if (bool) //        if (bool == true)
            System.out.println("true");
        else
            System.out.println("false");

        bool = false;
        if (!bool) //   if (bool != true) if (bool == false)
            System.out.println("false");
        else
            System.out.println("true");

        // Arrays
        int[] intArray = new int[]{1,2,3,4,5,6,7,8,9,10}; // where the size of the array and variables of array are already known
        //int[] intArray = new int[10];   // allocating memory to array without specific variables (default values=0)

        // Printing some array elements
        System.out.println(intArray[0]);
        System.out.println(intArray[2]);

        // Printing the array with a for loop
        for(int i=0; i< intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        intArray[2] = 2;        // Changing the variable at index 2
        // Printing the array with a for-each loop
        for(int number : intArray)
            System.out.print(number + " ");
        System.out.println("\n\n"); // Printing extra new lines


        // Methods
        intArray = new int[]{1,2,3,4,5,6,7,8,9,10}; // Resetting/reinitializing array
        double mean = meanValue(intArray);
        System.out.println("Mean of the array is: " + mean);
    }
}
