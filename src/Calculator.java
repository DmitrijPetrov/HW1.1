import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //BinaryOperator<Integer> divide = (x, y) -> x / y;
    BinaryOperator<Integer> divide = (x, y) -> y != 0 ? x / y : null;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    //Consumer<Integer> println = System.out::println;

    Consumer<Integer> println = (x) -> {
        if (x == null) {
            System.err.println("Ошибка вычислений");
        } else {
            System.out.println(x);
        }
    };
}
