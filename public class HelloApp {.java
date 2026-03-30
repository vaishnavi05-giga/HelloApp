public class HelloApp {
    public static void main(String[] args) {
        String greetingTarget;
        if (args.length == 0) {
            greetingTarget = "World";
        } else {
            StringBuilder namesList = new StringBuilder();
            for (String name : args) {
                if (namesList.length() > 0) {
                    namesList.append(", ");
                }
                namesList.append(name);
            }
            greetingTarget = namesList.toString();
        }
        System.out.println("Hello, " + greetingTarget + "!");
    }
}