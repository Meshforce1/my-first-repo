public class Dog {
    // Instance variables
    String breed;
    int age;
    String color;

    // bark method
    void bark() {
        System.out.println(breed + " is barking!");
    }

    public static void main(String[] args) {
        // Create Dog objects and call bark method
        Dog dog1 = new Dog();
        dog1.breed = "Labrador";
        dog1.age = 3;
        dog1.color = "Yellow";

        Dog dog2 = new Dog();
        dog2.breed = "Poodle";
        dog2.age = 2;
        dog2.color = "White";

        dog1.bark();  // Output: Labrador is barking!
        dog2.bark();  // Output: Poodle is barking!
    }
}
