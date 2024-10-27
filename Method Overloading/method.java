class methods {
    void method1(int name){
        System.out.println("long method is called");
    }
    void method1(float age){
        System.out.println("float method is called");
    }
}

/**
 * method
 */

//  highest pirority is given to same datatype
public class method {

    public static void main(String[] args) {
        methods abc = new methods();
        abc.method1('9'); // Integer method is called    
    }
}