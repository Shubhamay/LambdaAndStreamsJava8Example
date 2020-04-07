package com.company;

public class Main {

    public static void main(String[] args) {

        MyLambda myLambdaFunction =   () -> System.out.println("Lambda Example ");
        myLambdaFunction.food();

        MyAdd addTwoNumber = (a,  b) ->  System.out.println(a + b);

        addTwoNumber.addTwoNumber(1,2);
        MyAdd.addTowNumbers(1,11);

        Multiply multTwoNumber = (a,b) -> a * b;
        multTwoNumber.multiplyTwoNumber(1, 19);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1");
            }
        });

        thread.run();

        Thread myLambdaThread = new Thread(() -> System.out.println("my Lambda Thread"));
        myLambdaThread.run();
    }
}

@FunctionalInterface
interface MyLambda {
    void food();
}

@FunctionalInterface
interface MyAdd {
    void addTwoNumber(int a, int b);
    static int addTowNumbers(int a, int b) {
        System.out.println(a+b);
        return a + b;
    }
}

@FunctionalInterface
interface Multiply {
    int multiplyTwoNumber(int a, int b);
}