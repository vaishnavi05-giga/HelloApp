public class HelloNameUC3 {

    public static void main(String[] args) {

        String userName;

        // Check if argument is provided
        if (args.length > 0) {
            userName = args[0];
        } else {
            userName = "World";
        }

        // Output
        System.out.println("Hello " + userName);
    }
}