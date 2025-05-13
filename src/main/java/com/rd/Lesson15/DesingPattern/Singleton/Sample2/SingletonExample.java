package com.rd.Lesson15.DesingPattern.Singleton.Sample2;

public class SingletonExample {

    private static SingletonExample instance;

    private SingletonExample(){}

    public static SingletonExample getInstance(){
        if (instance == null){
            instance = new SingletonExample();
        }
        return instance;
    }
}
