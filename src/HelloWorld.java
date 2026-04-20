public class HelloWorld {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String greeting = "Hello, ";
            for (String name : args) {
                greeting += name + ", ";
            }
            greeting = greeting.substring(0, greeting.length() - 2);
            greeting += "!";
            System.out.println(greeting);
        }
    }
}