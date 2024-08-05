public class HelloWorld {
    public static void main(String[] args) {
        String input = "Hello, World! This is a test...";
        String output = input.replaceAll("[\\p{Punct}\\s]+", "");
        System.out.println(output);
    }
}
