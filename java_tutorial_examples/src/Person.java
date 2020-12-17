public class Person {

    private String name;
    private String surname;
    private int age;

    // Default-Empty constructor
    Person(){
    }

    // Constructor that we defined
    Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setAge(int age){
        this.age = age;
    }

    // Package-private Method
    String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public int getAge(){
        return this.age;
    }

    public String toString(){
        return this.name+ " " + this.surname + " " + this.age;
    }



}
