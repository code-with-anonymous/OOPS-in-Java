 class Animal {

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    // overloading
    public void makeSound(String sound) {
        System.out.println("Animal makes a " + sound);
    }
    
}
public class overLoding {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // calls the default method
        animal.makeSound("bark"); // calls the overloaded method
    }
}