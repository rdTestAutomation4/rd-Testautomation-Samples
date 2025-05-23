package com.rd.Lesson15.DesingPattern.Singleton.Sample2;

class Test {

    public static void main(String[] args) {

        SingletonExample singletonExample1 = SingletonExample.getInstance();
        SingletonExample singletonExample2 = SingletonExample.getInstance();

        System.out.println("singletonExample1 ==> " + singletonExample1);
        System.out.println("singletonExample2 ==> " + singletonExample2);

        System.out.println(singletonExample1 == singletonExample2);
    }
}