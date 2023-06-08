public class Exception1 {
    public static void divideNumber(int divident, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division at 0");
        }
        int result = divident / divisor;
        System.out.println("Result = " + result);
    }

    public static void main(String[] args) {
        try {
            divideNumber(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
