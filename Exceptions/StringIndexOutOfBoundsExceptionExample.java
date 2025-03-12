public class StringIndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {
        String str = "Hello";

        
        char character = str.charAt(10);  

        System.out.println("Character at index 10: " + character);
    }
}
