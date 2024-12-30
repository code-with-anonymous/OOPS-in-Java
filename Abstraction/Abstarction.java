// Abstract class
abstract class Shape {
    // Abstract method (no body)
    abstract void draw();

    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete class
class Circle extends Shape {
    // Implementing the abstract method
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// Concrete class
  class Rectangle extends Shape {
    // Implementing the abstract method
  @Override
  void draw() {
    System.out.println("Drawing a Rectangle.");
  }
   public void bestShape() {
    System.out.println("Best Shape: Rectangle");
   }
    
}

public class Abstarction {

    public static void main(String[] args) {
        // Using abstraction
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Rectangle rectan = new Rectangle();


        circle.display(); // Accessing the concrete method
        circle.draw();    // Accessing the implemented abstract method

        rectangle.display();
        rectangle.draw();
        rectan.bestShape(); // Accessing the best shape method from Rectangle class
    }
}
