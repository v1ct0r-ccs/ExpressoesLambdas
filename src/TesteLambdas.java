import java.security.PrivilegedAction;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

public class TesteLambdas {
    public static void main(String[] args) {
        //Exemplo 1
        //Lambida
        IntBinaryOperator intBinaryOperator = (int a, int b) -> {
            return a + b;
        };
        intBinaryOperator.applyAsInt(1, 1);

        // Orientaçao ao objeto
        IntBinaryOperator operator = new IntBinaryOperatorClass();
        int result1 =  operator.applyAsInt(1,1);
        System.out.println(result1);

        //Lambida Bifunction
        BiFunction<Integer, Integer, Integer> biFunction = (Integer a, Integer b) -> {
          return a + b;
        };
        Integer resultBi = biFunction.apply(10, 10);
        System.out.println(resultBi);


        BiFunction<Double, Double, String> biFunctionStr = (Double a, Double b) -> {
            Double res = a + b;
            return String.valueOf(res);
        };
        String resultStr = biFunctionStr.apply(10.5d, 10.7d);
        System.out.println("String: " + resultStr);

        Long rernLong = calcular(1L, 2L, (Long v1, Long v2) -> {
            return v1 + v2;
        });
        System.out.println(rernLong);

        //Exemplo 2
        Runnable helloWorld = () -> System.out.println("Hello World");

        //Exemplo 3
        Consumer<String> stringConsumer = (String s) -> {
            System.out.println(s);
        };
        stringConsumer.accept("Value");

        //Exemplo 4
        Supplier<Integer> integerCallable = () -> 42;
        Supplier<Double> doubleCallable = () -> {
            return 3.1415;
        };

    }

    private static Long calcular (Long t, Long u ,BiFunction<Long,Long,Long> function) {
        return function.apply(t, u);
    }
}
