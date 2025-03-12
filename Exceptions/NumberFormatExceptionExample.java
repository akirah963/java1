public class NumberFormatExceptionExample {

    public static void main(String[] args) {
        String str = "abc"; 
        
        int number = Integer.parseInt(str);  

        System.out.println("The number is: " + number);
    }
}
