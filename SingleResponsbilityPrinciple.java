
public class SingleResponsbilityPrinciple {

    // Private static instance of the class
    // This ensures only one instance (Singleton) is created.
    private static SingleResponsbilityPrinciple object = new SingleResponsbilityPrinciple();

    // Constructor is package-private (default), restricting access from outside the package.
    // Usually, in Singleton, it should be private to prevent creating new instances.
    SingleResponsbilityPrinciple() {}

    // Static method to return the single instance of the class
    public static SingleResponsbilityPrinciple getObject() {
        return object;
    }

    public static void main(String[] args) {
        // Creating a new instance (this will not use the Singleton instance)
        SingleResponsbilityPrinciple object = new SingleResponsbilityPrinciple();

        // Retrieving the Singleton instance using the static method
        SingleResponsbilityPrinciple objectOne = object.getObject();

        // Retrieving the Singleton instance again, it should return the same instance
        SingleResponsbilityPrinciple objectTwo = object.getObject();

        // Comparing the two references to check if they point to the same instance
        if (objectOne == objectTwo) {
            System.out.println("same variable");
        }
    }


}


