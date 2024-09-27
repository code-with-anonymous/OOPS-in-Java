class Student {

    String name;
    String ag_number;
    String degree;
    String section;
    int semester;  // Corrected the spelling of "semester"

    // Method to print the student information
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Degree: " + degree);
        System.out.println("AG Number: " + ag_number);
        System.out.println("Section: " + section);
        System.out.println("Semester: " + semester);
    }

    // Un-Parameterized Constructor
     Student (){
        System.out.println("Constructor Called");
     }

    // Parameterized Constructor
    public Student(String section, int semester) {
        this.section = section;
        this.semester = semester;  // Correct spelling of "semester"
    }
}

public class OopsConstructor {
    public static void main(String[] args) {
        System.out.println("Hello world");

        // Creating a new Student object using the parameterized constructor
        Student s1 = new Student("M1", 3);

        // Setting additional attributes of the student
        s1.name = "Rayyan";
        s1.ag_number = "9633";
        s1.degree = "CS";

        // Printing the student's information
        s1.printInfo();
    }
}
