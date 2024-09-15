public class PrototypeDesignPattern {

    // The Student interface declares a clone method, which will be used for cloning objects.
    // Interfaces can't have method bodies in Java (prior to Java 8).
    // Therefore, you can't provide an implementation directly in the interface.
    public interface Student {
        Student clone(); // Declaring the clone method, no implementation in the interface.
    }

    // WorkingProfessional class implements the Student interface and provides the implementation of the clone method.
    public static class WorkingProfessional implements Student {

        // Class property to store the name of the WorkingProfessional
        String name;

        // Constructor to initialize the name of the WorkingProfessional
        public WorkingProfessional(String name) {
            this.name = name;
        }

        // Overriding the clone method to return a new instance of WorkingProfessional with the same name
        @Override
        public Student clone() {
            return new WorkingProfessional(this.name); // Cloning the object
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Setter for name
        public void setName(String name) {
            this.name = name;
        }
    }

    // CollegeStudent class implements the Student interface and provides the clone method as well.
    public class CollegeStudent implements Student {

        // Class property to store the name of the CollegeStudent
        String name;

        // Constructor to initialize the name of the CollegeStudent
        public CollegeStudent(String name) {
            this.name = name;
        }

        // Overriding the clone method to return a new instance of CollegeStudent with the same name
        @Override
        public Student clone() {
            return new CollegeStudent(this.name); // Cloning the object
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Setter for name
        public void setName(String name) {
            this.name = name;
        }
    }

    // The main method where the program starts executing
    public static void main(String[] args) {
        // Creating an instance of WorkingProfessional using the constructor and passing the name "Archit"
        Student student = new WorkingProfessional("Archit");
        System.out.println("Created a WorkingProfessional: " + ((WorkingProfessional) student).getName());

        // Cloning the student to create a new instance using the clone method
        Student clonedStudent = student.clone();
        System.out.println("Cloned WorkingProfessional: " + ((WorkingProfessional) clonedStudent).getName());
        ((WorkingProfessional) clonedStudent).setName("prajjwal");
    }
}
