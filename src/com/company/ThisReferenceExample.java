package com.company;

public class ThisReferenceExample {
    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

        thisReferenceExample.doProcess(10 , i -> {
            System.out.println(i);

            //System.out.println(this);
            //lambdas does not touch the this reference
        });


        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int t) {
                System.out.println("======" + t);
                System.out.println(this);
            }

            public String toString() {
                return "This is the anonymous inner class";
            }
        });

    }

    public void doProcess(int i, Process p) {
        p.process(i);
    }

    public String toString() {
        return "This is the anonymous outer class";
    }
}

