package com.company.javabrains;

import java.util.function.BiConsumer;

public class JavaLambdaExceptions {
    public static void main(String[] args) {
        int [] someNumbers = {1,2,3,4,5};
        int key = 0;

        process(someNumbers, key, wrapperLambda((v , k) -> System.out.println(v / k)));
    }

    private static void process(int[] someNumbers, int key,BiConsumer<Integer, Integer> consumer) {
        for(int i: someNumbers){
            consumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (v, b) -> {
            try {
                consumer.accept(v, b);
            }catch (ArithmeticException a) {
                System.out.println("Arithmetic Exception");
            }

        };
    }
}
