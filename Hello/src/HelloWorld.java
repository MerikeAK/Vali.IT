public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(String.format("Hello World, %s!", args[0])); // 1
        System.out.println("Hello World, " + args[0] + "!"); // 2
    }
}
