import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
	
	// ArrayList which has instances of the class Person
        ArrayList<Person> persons = new ArrayList<>();
	
	// Constructing a new Person instance
        Person cotsios = new Person("Konstantinos", "Loizou", 22);

        Person nick = new Person();
        nick.setName("Nikolas");
        nick.setSurname("Petrou");
        nick.setAge(22);

        System.out.println("Name : " + cotsios.getName());
        System.out.println("Surname : " + cotsios.getSurname());
        System.out.println("Age : " + cotsios.getAge());

        System.out.println("Name : " + nick.getName());
        System.out.println("Surname : " + nick.getSurname());
        System.out.println("Age : " + nick.getAge());

        System.out.println("Printing with the toString method: " + cotsios.toString());

	    // Scanner for user input
        Scanner input= new Scanner(System.in);

	    // Adding new instances of Person from user's input
        for(int i=0;i<2;i++){
            System.out.println("Give info :");

            System.out.print("Name : ");
            String name = input.next();

            System.out.print("Surname : ");
            String surname = input.next();

            System.out.print("Age : ");
            int age = input.nextInt();

            Person p = new Person(name, surname, age);
            persons.add(p);
        }

	    // Printing details of each person with the use of the method .toString()
	    // that we defined earlier in the Person class
        for(Person person : persons) {
            System.out.println(person.toString());
        }

	    // Changing/setting each Person's age to 23
        System.out.println("Setting each Person's age to 23");
	    for (Person person : persons) {
             person.setAge(23);
    	}
	
	    // Printing details of each person with the use of the method .toString()
	    // that we defined earlier in the Person class
        for(Person person : persons)
            System.out.println(person.toString());
    }
}
