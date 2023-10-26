package object1;

public class Person {// Define a class
    private String name;
    private int height;
    private int age;


        // Constructor
    public Person(String name, int age, int height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }
    public String getName() {
        return name;
    }
        public int getAge(){
            return age;

        }
    public int getHeight(){
            return height;

        }
    }