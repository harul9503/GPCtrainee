import java.util.Scanner;
class ownexception extends Exception {
    public ownexception(String message) {
        super(message);
    }
}

public class exceptioneg {
    
    public static int divide(int a, int b) throws ArithmeticException, ownexception {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        if (a < 0) {
            throw new ownexception("Negative numbers are not allowed.");
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int result = divide(a, b); 
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ownexception e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }

    
}
