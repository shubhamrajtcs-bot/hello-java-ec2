public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World from EC2 using GitHub CI/CD");

        // Calling another Java file (Utils)
        Utils.sayHello();
        Utils.sayWelcome("Shubham");
    }
}
