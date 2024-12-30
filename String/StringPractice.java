import java.util.Scanner;

class StringPractice {
    
    public static void main(String[] args) {
        // String name = "harry is good boy";
        // System.out.println(name.toLowerCase());
        // System.out.println(name.replace(" ", "_"));
        // System.out.println(name);

        String text = "Dear <name> , thanks alot";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine(); // Read the input from the user

        // Replace <name> with the user's input and print the result
        String ans  =text.replace("<name>", name);
        System.out.println(ans);

        // Close the scanner to free up resources
        input.close();
    }
}