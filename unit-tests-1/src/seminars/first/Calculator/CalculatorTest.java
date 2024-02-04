package seminars.first.Calculator;

import seminars.first.Calculator.Calculator;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
        // Проверка базового функционала с целыми числами:
        if (8 != Calculator.calculation(2, 6, '+')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (0 != Calculator.calculation(2, 2, '-')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (14 != Calculator.calculation(2, 7, '*')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (2 != Calculator.calculation(100, 50, '/')) {
            throw new AssertionError("Ошибка в методе");
        }

               // Тесты для нового метода calculateDiscount
        assert 80.0 == Calculator.calculateDiscount(100.0, 20);
        assertThat(Calculator.calculateDiscount(100.0, 20)).isEqualTo(80.0);

        // Тесты для проверки исключений
        assertThatThrownBy(() ->
                Calculator.calculateDiscount(-50.0, 10)
        ).isInstanceOf(IllegalArgumentException.class)
         .hasMessage("Invalid input: purchaseAmount and discountPercentage must be non-negative, and discountPercentage must be between 0 and 100");

        assertThatThrownBy(() ->
                Calculator.calculateDiscount(100.0, -10)
        ).isInstanceOf(IllegalArgumentException.class)
         .hasMessage("Invalid input: purchaseAmount and discountPercentage must be non-negative, and discountPercentage must be between 0 and 100");

        assertThatThrownBy(() ->
                Calculator.calculateDiscount(100.0, 120)
        ).isInstanceOf(IllegalArgumentException.class)
         .hasMessage("Invalid input: purchaseAmount and discountPercentage must be non-negative, and discountPercentage must be between 0 and 100");
    }
}