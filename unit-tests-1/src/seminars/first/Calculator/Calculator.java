package seminars.first.Calculator;

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    // Метод для вычисления суммы покупки со скидкой
    public static double calculateDiscount(double purchaseAmount, int discountPercentage) {
        if (purchaseAmount < 0 || discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("Invalid input: purchaseAmount and discountPercentage must be non-negative, and discountPercentage must be between 0 and 100");
        }

        double discount = purchaseAmount * discountPercentage / 100.0;
        return purchaseAmount - discount;
    }
}