class Animal {
    void sleep(){
        System.out.println("Animal sleeps");
    }
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
    void bark() {
        System.out.println("Dog barks loudly");
    }
}
public class overRdding {
public static void main(String[] args) {

    // for Animal
    Animal animal = new Animal();
    animal.sound();

    // for Dog
    Animal animal1 = new Dog();
    animal1.sound();


    // animal1.bark(); 
    // the bark function is defined with refrence to the dog,so does not run with animal1

    Dog dog = new Dog();
    dog.bark();
}
    
}