public class MultipleCatchExample {

    public static void main(String[] args) {
        try {
            
            int result = 10 / 0; 
            
            
            int[] array = new int[5];
            array[10] = 50; 
            
            String str = null;
            System.out.println(str.length()); 
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to call a method on a null object.");
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
