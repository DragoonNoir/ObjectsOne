package object1;

public class Person {// Define a class

    class Person {
        private String name;
        private int age = 0;
        private int height = 0;

        // Constructor
        public Person(String name, int age, int height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }
        public int getAge(){
            return age;

        }
        public int getHeight(){
            return height;

        }
    }
}